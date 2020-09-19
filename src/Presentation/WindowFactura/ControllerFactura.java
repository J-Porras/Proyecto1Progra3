/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowFactura;

import Presentation.WindowCliente.ClienteTableModel;
import Presentation.WindowProductos.ProductoTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import logic.Factura;
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
        initComponents();
    }
    public void show(){
        view.setVisible(true);
    } 
   
    public void initComponents(){
        this.view.getTableProductos().setModel(new ProductoTableModel(model.getListProductos()));
        this.view.getTableClientes().setModel(new ClienteTableModel(logic.Service.getInstance().getListClientes()));
    }
    
    public void addProdFactura(Producto p){
        this.model.getProductosFactura().add(p);
        this.model.commit();
    }
    public void addProdFactura(int row){
        this.model.getProductosFactura().add(this.model.getListProductos().get(row));
        this.model.commit();
    }
    public void nuevaFactura(Factura factura){
        
    }
    
    public void setCurrenteCliente(int row){
        model.setClienteActual(model.getListclientes().get(row));
        model.commit();
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
