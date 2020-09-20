/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import sistema.data.Datax;

/**
 *
 * @author Porras
 */
public class FacturaXML extends Factura {
    private String path;
    private Factura f;
    
    
    public FacturaXML(Factura f, String codigo, double total, int cantidadProducto, String formaDePago, Cliente cliente1, Empresa empresa, List<Producto> productos) {
        super(codigo, total, cantidadProducto, formaDePago, cliente1, empresa, productos);
        this.f = f;
        this.path = codigo + ".xml";
        
    }
        
    
    @Override
    public void crearFactura() {
        try {
            store(this.f);
        } catch (JAXBException ex) {
            Logger.getLogger(FacturaXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FacturaXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    void store(Factura f) throws JAXBException, IOException{
        JAXBContext jaxbContext =  JAXBContext.newInstance(FacturaXML.class);
        FileOutputStream out  = new FileOutputStream(path);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(f,out);
        out.flush();
        out.close(); 
    }
    
}
