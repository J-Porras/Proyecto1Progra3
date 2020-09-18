/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import sistema.data.Data;
import sistema.data.Datax;

/**
 *
 * @author Porras
 */
public class XmlPersister{
    private String path;
    private static XmlPersister Instance;
    
    
    public static XmlPersister getInstance(){
        if (Instance==null) {
            Instance = new XmlPersister();
            Instance.setPath("data.xml");
            return Instance;
        }
        return Instance;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
    public Datax load()throws Exception{
        File file = new File(path);
        
        
        if (file.exists() && file.canRead()) {
            JAXBContext jaxbContext =  JAXBContext.newInstance(Datax.class);
            FileInputStream in = new FileInputStream(path);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Datax result = (Datax)unmarshaller.unmarshal(in);
            in.close();
            return result; 
        }
        return null; 
    }
    
    public void store(Datax datax) throws Exception{
        JAXBContext jaxbContext =  JAXBContext.newInstance(Datax.class);
        FileOutputStream out  = new FileOutputStream(path);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(datax,out);
        out.flush();
        out.close();
        
    }
    
    
    
}
