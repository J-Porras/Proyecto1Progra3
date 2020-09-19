/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.List;

/**
 *
 * @author Porras
 */
public class FacturaXML extends Factura {

    public FacturaXML(String codigo, double total, int cantidadProducto, String formaDePago, Cliente cliente1, Empresa empresa, List<Producto> productos) {
        super(codigo, total, cantidadProducto, formaDePago, cliente1, empresa, productos);
    }

    
    
    
    @Override
    public void crearFactura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
