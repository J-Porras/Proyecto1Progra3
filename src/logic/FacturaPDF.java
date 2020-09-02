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

/**
 *
 * @author Porras
 */
public class FacturaPDF extends Factura{
    Document docPDF;

    public FacturaPDF(int Codigo, double total, int cantidad, String formaDePago, Fecha fechaVencimiento, Fecha diaActual, 
            String ClaveElectronica, String NumeroFacturaElectronica, int Plazo, Cliente cliente1, Fecha fecha, Producto producto, Empresa empresa)
    {
        super(Codigo, total, cantidad, formaDePago, fechaVencimiento, diaActual, ClaveElectronica, NumeroFacturaElectronica, 
                Plazo, cliente1, fecha, producto, empresa);
        
        this.docPDF = new Document();
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
            PdfWriter writer = PdfWriter.getInstance(docPDF, new FileOutputStream(this.getCodigo()));
            docPDF.open();
            docPDF.add(new Paragraph(this.empresa.getNomEmpresa()));
            docPDF.add(new Paragraph(this.empresa.getDireccion()));
            docPDF.add(new Paragraph("Tel: "+this.empresa.getNumTelefono()));
            docPDF.add(new Paragraph(this.empresa.getPagWeb()));
            docPDF.add(new Paragraph(" "));
            docPDF.add(new Paragraph("Cedula Juridica: " + this.empresa.getIDJurid()));
            docPDF.add(new Paragraph("Factura Electronica No." + this.getNumeroFacturaElectronica()));
            

            
            docPDF.close();
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
            docPDF.open();
            docPDF.add(new Paragraph("Datos del cliente"));
            docPDF.add(new Paragraph(this.cliente1.getNombre()));
            docPDF.add(new Paragraph((this.cliente1.getID().getNumero())));
            docPDF.add(new Paragraph(this.cliente1.getNumTel()));
            
            docPDF.close();
            
        } 
        catch (DocumentException e)
        {
            e.printStackTrace();
        } 
         /*catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }*/
        
        
    }
    
    
}
