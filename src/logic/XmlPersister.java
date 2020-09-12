/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import javax.xml.bind.JAXBContext;
import sistema.data.Data;

/**
 *
 * @author Porras
 */
public class XmlPersister{
    public Data load(){
        return null;
    }
    
    public void store(Data data) throws Exception{
        JAXBContext jaxbContext =  JAXBContext.newInstance(Data.class);
    }
}
