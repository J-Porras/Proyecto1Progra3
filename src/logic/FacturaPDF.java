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
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.util.List;

/**
 *
 * @author Porras
 */
public class FacturaPDF extends Factura{
    Document docPdf;

    public FacturaPDF(String codigo, double total, int cantidadProducto, String formaDePago, 
            Cliente cliente1, Empresa empresa, List<Producto> productos) 
    {
        super(codigo, total, cantidadProducto, formaDePago, cliente1, empresa, productos);
        this.docPdf = new Document();
    }
    
    
    
   

    @Override
    public void crearFactura() {
        try {
            this.initPDF();
        } 
        catch (Exception e) {   
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
            this.productosTable();
            
            docPdf.add(new Paragraph("Subtotal: " + Float.toString(logic.Service.getInstance().subtotal(productos))));
            docPdf.add(new Paragraph("Impuesto: " + Float.toString(logic.Service.getInstance().impuestoFactura(13, productos))));
            float total = logic.Service.getInstance().impuestoFactura(13,productos) + 
                logic.Service.getInstance().subtotal(productos);
            docPdf.add(new Paragraph("Total: " + Float.toString(total)));
            
            
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
            
            if (cliente1.getTipoID() ==0) {
                docPdf.add(new Paragraph("Cédula Física: " + cliente1.getID()));
                
            }
            if (cliente1.getTipoID() == 1) {
                docPdf.add(new Paragraph("Cédula Jurídica: " + cliente1.getID()));
            }
            else
                docPdf.add(new Paragraph("Identificación: " + cliente1.getID()));
            
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
    
    public void productosTable(){
        try {
            
            docPdf.open();
            PdfPTable table = new PdfPTable(3);
            table.setWidthPercentage(100); //Width 100%
            table.setSpacingBefore(10f); //Space before table
            table.setSpacingAfter(10f); //Space after table
            
            //codigo de howtodoinjava/generate pdf java
            float[] columnWidths = {1f, 1f, 1f};
            table.setWidths(columnWidths);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Codigo"));
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            
            PdfPCell cell2 = new PdfPCell(new Paragraph("Descripion"));
            //cell2.setPaddingLeft(10);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
            
            PdfPCell cell3 = new PdfPCell(new Paragraph("Precio"));
            //cell3.setPaddingLeft(10);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            
            for (int i = 0; i < productos.size(); i++) {
                table.addCell(productos.get(i).getCodigo());
                table.addCell(productos.get(i).getDescripcionProducto());
                table.addCell(Double.toString(productos.get(i).getPrecio()));
            }
            
          docPdf.add(table);
            
        }
        catch (DocumentException e)
        {
            e.printStackTrace();
        } 
        catch (Exception e) {
        }
    }
    
}
