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


import java.io.FileWriter;
import java.util.List;
import sistema.errors.CharacterExcep;
import java.io.BufferedWriter;
import java.io.File;



public class Xmlhacienda extends Factura{
 String ruta = ("Fa"+this.codigo+".txt");
   
    public Xmlhacienda(String codigo, double total, int cantidadProducto, String formaDePago,
            Cliente cliente1, Empresa empresa, List<Producto> productos)
    {
        super(codigo, total, cantidadProducto, formaDePago,cliente1, empresa, productos);
    }
    
    
    
    public String ForamtoXml(String b, String centro, int tab){
        String salida = "<"+b+">"+centro+"</"+b+">";
        for(int i = 0;i<tab;i++){
            salida = "\t"+salida;
        }
        return (salida+"\n");
    }

    @Override
    public void crearFactura() throws CharacterExcep{
        
        File file = null;
        try {
            file = new File(ruta);
            
            if (!file.exists()) 
            {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter xml = new BufferedWriter(fw);
            xml.write("<FacturaElectronica>\n");
            
            /*        
            diaActual.setDia(LocalDate.now().getDayOfMonth());                                                   
            diaActual.setMes(LocalDate.now().getMonthValue());
            diaActual.setAnio(LocalDate.now().getYear());
            */
            
            
            ////Datos emisor
            String nomEmpres = this.empresa.getNomEmpresa();
            xml.write("\t<Emisor>\n");
            xml.write("\t  <Nombre>"+nomEmpres+"</Nombre>\n");
            xml.write("\t  <Identificacion>\n");
            xml.write("\t    <Tipo>01</Tipo>\n");
            xml.write("\t    <Numero>"+empresa.getIDJurid()+"</Numero>\n");
            xml.write("\t  </Identificacion>\n");
            xml.write("\t  <Ubicacion>\n");
            xml.write("\t\t <OtrasSenas>"+empresa.getDireccion()+" </OtrasSenas>\n");
            xml.write("\t  </Ubicacion>\n"); 
            xml.write("\t  <Telefono>\n");
            xml.write("\t    <CodigoPais>506</CodigoPais>\n");
            xml.write("\t    <NumTelefono>"+Integer.toString(empresa.getNumTelefono())+"</NumTelefono>\n");
            xml.write("\t  </Telefono>\n");
            xml.write(ForamtoXml("PaginaWeb",empresa.getPagWeb(),1));
            xml.write("\t</Emisor>\n");
            
            
            ////////////////////////Receptor  
            xml.write("\t<Receptor>\n");
            xml.write(ForamtoXml("Nombre",cliente.getNombre(),1));
            xml.write(ForamtoXml("Nombre",cliente.getNombre(),1));
            xml.write("\t  <Identificacion>\n");
            xml.write("\t    <Tipo>01</Tipo>\n");
            xml.write("\t    <Numero>"+Integer.toString(cliente.getTipoID())+"</Numero>\n");
            xml.write("\t  </Identificacion>\n");
            xml.write("\t  <Telefono>\n");
            xml.write("\t    <CodigoPais>506</CodigoPais>\n");
            xml.write("\t    <NumTelefono>"+Integer.toString(cliente.getNumTel())+"</NumTelefono>\n");
            xml.write("\t  </Telefono>\n");
            xml.write("\t  <Direccion>\n");
            xml.write(ForamtoXml("Provincia",cliente.getUbicacion().getProvincia(),1));
            xml.write(ForamtoXml("Canton",cliente.getUbicacion().getCanton(),1));

            xml.write("\t  </Direccion>\n");
            xml.write("\t</Receptor>\n");

            xml.write("\t  <CondiCionVenta>\n");
            if ("Efectivo".equals(this.formaDePago)) 
            {
                xml.write(ForamtoXml("MedioPago","1",1)); 
            }   
            if ("Tarjeta".equals(this.formaDePago)) 
            {
                xml.write(ForamtoXml("MedioPago","2",1));
            }
            xml.write("\t  </CondiCionVenta>\n");
            xml.write("\t  <DetalleServicio>\n");
            
            for (int i = 0; i < productos.size(); i++) {
                Producto p = productos.get(i);
                xml.write("\t  <LineaDetalle>\n");  
                xml.write(ForamtoXml("NumeroLinea",String.valueOf(i+1),1));      
                xml.write("\t  <CodigoComercial>\n");
                xml.write(ForamtoXml("Codigo",String.valueOf( p.getCodigo()),2));
                xml.write("\t  </CodigoComercial>\n");
                xml.write(ForamtoXml("Cantidad",String.valueOf(1),1));
                xml.write(ForamtoXml("UnidadMedida","Unid",2));



                xml.write(ForamtoXml("Detalle",p.getDescripcionProducto(),1));
                xml.write(ForamtoXml("PrecioUnitario",Double.toString(p.getPrecio()),1));
                xml.write(ForamtoXml("MontoTotal",Double.toString(p.getPrecio()),2));
                xml.write("\t  <Impuesto>\n");
                xml.write(ForamtoXml("Tarifa",String.valueOf(13),2));

                Double canimpuesto = 13.0;
                xml.write(ForamtoXml("Monto",Double.toString(canimpuesto * p.getPrecio()),2));
                xml.write("\t  </Impuesto>\n");
                xml.write(ForamtoXml("MontoTotalLinea",Double.toString((canimpuesto * p.getPrecio()) + p.getPrecio()),1));

            }
            xml.write("\t  </LineaDetalle>\n");  
            xml.write("\t  </DetalleServicio>\n"); 

            xml.close();
             
        }
        catch(Exception e){
        }

        
    }
    
   
            
}


