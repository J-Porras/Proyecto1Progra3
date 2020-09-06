/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logic.*;

/**
 *
 * @author Porras
 */
public class ControllerCliente implements ActionListener{
    ModelCliente model;
    ViewCliente view;
    
    
    
    
    public ControllerCliente(ModelCliente model, ViewCliente view) {
        this.model = model;
        this.view = view;
        model.setListCliente(logic.Service.getInstance().getListClientes());
        view.setModel(model);
        view.setController(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento){
        int i = view.getComBoxProvincia().getSelectedIndex();
        switch(i){
            
            case 0:{
                
                view.getComBoxCanton().setModel(model.getCantones()[0]);
                break;
            }
             
            case 1:{
                view.getComBoxCanton().setModel(model.getCantones()[1]);
                break;
            }
            
            default:{
                view.getComBoxCanton().setModel(model.getCantones()[0]);
                break;
            }
        }
    }
    
    public void addCliente(Cliente c){
        logic.Service.getInstance().addCliente(c);
        model.setListCliente(logic.Service.getInstance().getListClientes());
        model.commit();
    }
    
    
 
}
