/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowProductos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logic.Producto;

/**
 *
 * @author pgat3000
 */
public class ControllerProducto implements ActionListener{
   private  ModelProducto model;
    private ViewProducto view;

    public ControllerProducto(ModelProducto model, ViewProducto view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
    }
    
    public void addProducto(Producto p) throws Exception{
        logic.Service.getInstance().addProducto(p);
        this.model.setProductos(logic.Service.getInstance().getListProductos());
        this.model.commit();
    }
     public void show(){
        view.setVisible(true);
    } 
}
