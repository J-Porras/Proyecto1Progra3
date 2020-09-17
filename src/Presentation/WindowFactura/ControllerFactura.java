/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowFactura;

import Presentation.WindowProductos.ProductoTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import logic.Producto;

/**
 *
 * @author Joaquin
 */
public class ControllerFactura implements ActionListener, MouseListener{
    ModelFactura model;
    ViewFactura view;
    

    public ControllerFactura(ModelFactura facturas_model, ViewFactura facturas_view) {
        this.model = facturas_model;
        this.view = facturas_view;
    }
    public void show(){
        view.setVisible(true);
    } 
   
    public void initComponents(){
        this.view.getTableProductos().setModel(new ProductoTableModel(model.getListProductos()));
    }
    
    public void addProdFactura(Producto p){
        this.model.productosFactura.add(p);
        this.model.commit();
    }
    
    public float subtotal(List<Producto> productos){
        float subtotal = 0;
        for (int i = 0; i < 10; i++) {
            subtotal += (productos.get(i).getPrecio());
        }
        return subtotal;
    }
    
    
    
    public float impuestoFactura(int impuesto,List<Producto> productos){
        float impuestodecimal = impuesto/100;
        float impuestotal = 0;
 
        for (int i = 0; i < 10; i++) {
            impuestotal += (productos.get(i).getPrecio()*impuestodecimal);
        }
        return impuestotal;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
}
