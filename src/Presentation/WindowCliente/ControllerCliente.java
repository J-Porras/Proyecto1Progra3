/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        view.setModel(model);
        view.setController(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        int i = view.getComBoxProvincia().getSelectedIndex();
        switch(i){
            
            case 0:{
                view.getComBoxCanton().setModel(model.cantones[0]);
                break;
            }
             
            case 1:{
                view.getComBoxCanton().setModel(model.cantones[1]);
                break;
            }
            
            default:{
                view.getComBoxCanton().setModel(model.cantones[1]);
                break;
            }
        }
       
    }
    
    public void distritos(int provincia,int canton){
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
