/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Porras
 */


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import sistema.errors.CharacterExcep;
import sistema.errors.EmptySpaceExcep;


public class Xmlhacienda extends Factura{

    public Xmlhacienda(String codigo, double total, int cantidadProducto, String formaDePago,
            Cliente cliente1, Empresa empresa, List<Producto> productos)
    {
        super(codigo, total, cantidadProducto, formaDePago,cliente1, empresa, productos);
    }
    
    @Override
    public void crearFactura() throws CharacterExcep{
        
        FileWriter writer = null;
        try {
            Document document = new Document();
            Element root = null;
            root = new Element("FacturaEletronica");
            document.setRootElement(root);
            ////Datos emisor
            
            Element emisor = new Element("Emisor");
            Element nomEmpresa = new Element("Nombre");
            emisor.addContent(nomEmpresa);
            Element id = new Element("Identificacion");
            id.addContent(new Element("Tipo").setText("1"));
            id.addContent(new Element("Numero").setText(empresa.getIDJurid()));
            emisor.addContent(id);
            Element direccion = new Element("OtrasSenas").setText(empresa.getDireccion());
            emisor.addContent(direccion);
            Element telefono = new Element("Telefono");
            telefono.addContent(new  Element("CodigoPais").setText("506"));
            telefono.addContent(new  Element("NumTelefono").setText(Integer.toString(empresa.getNumTelefono())));
            emisor.addContent(telefono);
            Element pagweb = new Element("PaginaWeb").setText(empresa.getPagWeb());
            emisor.addContent(pagweb);
            root.addContent(emisor);
            
            /////////////////////////Receptor
            Element receptor = new Element("Receptor");
            Element nombreCliente = new Element("Nombre");
            nombreCliente.setText(cliente.getNombre());
            receptor.addContent(nombreCliente);
            Element idCliente = new Element("Identificacion");
            idCliente.addContent(new Element("Tipo").setText(Integer.toString(cliente.getTipoID())));
            idCliente.addContent(new Element("Numero").setText(cliente.getID()));
            receptor.addContent(idCliente);
            Element telefonoCliente = new Element("Telefono");
            telefonoCliente.addContent(new Element("CodigoPais").setText("506"));
            telefonoCliente.addContent(new  Element("NumTelefono").setText(Integer.toString(cliente.getNumTel())));
            receptor.addContent(telefonoCliente);
            
            
            Element direccionCliente = new Element("Direccion");
            direccionCliente.addContent(new Element("Provincia").setText(cliente.getUbicacion().getProvincia()));
         
            direccionCliente.addContent(new Element("Canton").setText(cliente.getUbicacion().getCanton()));
          
           
            receptor.addContent(direccionCliente);
          
            root.addContent(receptor);
           
     
            

            
           Element condicionVenta = new Element("CondicionVenta").setText("1");
            
            root.addContent(condicionVenta);
            
            
            if ("Efectivo".equals(this.formaDePago)) {
            
                Element medioPago = new Element("MedioPago").setText("1");
                root.addContent(medioPago);
                
            }   if ("Tarjeta".equals(this.formaDePago)) {
                Element medioPago = new Element("MedioPago").setText("2");
                root.addContent(medioPago);
            }
            
            
             
            Element detalleServicio = new Element("DetalleServicio");
            
            
            
            
            for (int i = 0; i < productos.size(); i++) {
                
                
                Producto p = productos.get(i);
                Element lineaDetalle = new Element("NumeroLinea" + Integer.toString(i+1));
                
                Element codigoComercial = new Element("CodigoComercial");
                Element codigoProducto = new Element("Codigo").setText(p.getCodigo());
                codigoComercial.addContent(codigoProducto);
                lineaDetalle.addContent(codigoComercial);
                
                Element cantidad = new Element("Cantidad").setText("1");
                lineaDetalle.addContent(cantidad);
                
                Element unidadMedida = new Element("UnidadMedida").setText("Unid");
                lineaDetalle.addContent(unidadMedida);
                
                Element detalle = new Element("Detalle").setText(p.getDescripcionProducto());
                lineaDetalle.addContent(detalle);
                
                Element precioUnitario = new Element("PrecioUnitario").setText(Double.toString(p.getPrecio()));
                lineaDetalle.addContent(precioUnitario);
                
                Element MontoTotal = new Element("MontoTotal").setText(Double.toString(p.getPrecio()));
                lineaDetalle.addContent(MontoTotal);
                
                Element Impuesto = new Element("Impuesto");
                
                
                Element tarifa = new Element("Tarifa").setText("13");
                Double canimpuesto = 13.0;
                Impuesto.addContent(tarifa);
                
                Element montoimpuesto = new Element("Monto").setText(Double.toString(canimpuesto * p.getPrecio()));
                Impuesto.addContent(montoimpuesto);
                
                lineaDetalle.addContent(Impuesto);
                Element montoTotalLinea = new Element("MontoTotalLinea").setText(Double.toString((canimpuesto * p.getPrecio()) + p.getPrecio()));
                lineaDetalle.addContent(montoTotalLinea);
                
                detalleServicio.addContent(lineaDetalle);
                
            } 
            
            root.addContent(detalleServicio);
            
            writer = new FileWriter("FacturaEletronica"+codigo+".xml");
            XMLOutputter outputter = new XMLOutputter();
            outputter.setFormat(Format.getPrettyFormat());
            outputter.output(document, new FileOutputStream("C:\\file.xml"));
            writer.close();
             
        }
        catch(Exception e){}

        
    }
    
   
            
}


