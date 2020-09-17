/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Document;
import java.awt.List;

/**
 *
 * @author Porras
 */
public class FacturaPDF extends Factura{
    Document docPdf;

    public FacturaPDF(Document docPdf, int codigo, double total, int cantidadProducto, String formaDePago, 
            Cliente cliente1, Empresa empresa, java.util.List<Producto> productos) 
    {
        super(codigo, total, cantidadProducto, formaDePago,cliente1, empresa, productos);
        this.docPdf = new Document();
    }

   

   

   

    @Override
    public void crearFactura() {
        try {
            this.initPDF();
        } catch (Exception e) {
            
        }
    }
    
    public void initPDF(){
        
        try {
            PdfWriter writer = PdfWriter.getInstance(docPdf, new FileOutputStream(this.getCodigo()));
            docPdf.open();
            this.emisorData();
            
            docPdf.add(new Paragraph(" "));
            docPdf.add(new Paragraph(diaActual.getCurrentDate()));
            docPdf.add(new Paragraph("Fecha de Vencimiento: " + fechaVencimiento.getPlusDays(365)));
            
            this.dataClient();
            
            
           
            //docPDF.add(new Paragraph("Factura Electronica No." + this.getNumeroFacturaElectronica()));
            

            
            docPdf.close();
            writer.close();
        } 
        catch (DocumentException e)
        {
            e.printStackTrace();
        } 
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    
    public void dataClient(){
        
        try {
            docPdf.open();
            docPdf.add(new Paragraph("Datos del receptor: "));
            docPdf.add(new Paragraph(cliente1.getNombre()));
            
            if (cliente1.getID().getTipo()==0) {
                docPdf.add(new Paragraph("Cédula Física: " + cliente1.getID().getNumero()));
                
            }
            if (cliente1.getID().getTipo() == 1) {
                docPdf.add(new Paragraph("Cédula Jurídica: " + cliente1.getID().getNumero()));
            }
            else
                docPdf.add(new Paragraph("Identificación: " + cliente1.getID().getNumero()));
            
            docPdf.add(new Paragraph("Teléfono: " +  Integer.toString(cliente1.getNumTel())));
            
            
        } 
        catch (DocumentException e)
        {
            e.printStackTrace();
        } 
        
        
    }
    
    public void emisorData(){
         
        try {
            
            docPdf.open();
            docPdf.add(new Paragraph(this.empresa.getNomEmpresa()));
            docPdf.add(new Paragraph("Cedula Juridica: " + this.empresa.getIDJurid()));
            docPdf.add(new Paragraph(this.empresa.getDireccion()));

            docPdf.add(new Paragraph("Tel: "+this.empresa.getNumTelefono()));
            docPdf.add(new Paragraph(this.empresa.getPagWeb()));
            docPdf.add(new Paragraph(" "));
            
        }
        catch (DocumentException e)
        {
            e.printStackTrace();
        } 
        catch (Exception e) {
        }
    }
    
}
