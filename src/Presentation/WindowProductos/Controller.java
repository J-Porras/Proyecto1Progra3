/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowProductos;

import Presentation.WindowProductos.Model;
import Presentation.WindowProductos.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import logic.Producto;

/**
 *
 * @author pgat3000
 */
public class Controller implements ActionListener{
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String Descripcion;
        Descripcion = view.getNombre();
        Double Precio = view.getPrice();
        Producto p = new Producto(Descripcion,Precio);
        model.commit(p);
        view.setNombre(" ");
        view.setPrecio(" ");
    }
    
}
