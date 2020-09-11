/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import logic.*;

/**
 *
 * @author Porras
 */
public class ControllerCliente implements ActionListener{
    private ModelCliente model;
   private ViewCliente view;
    
    
    
    
    public ControllerCliente(ModelCliente model, ViewCliente view) {
        this.model = model;
        this.view = view;
        model.setListCliente(logic.Service.getInstance().getListClientes());
        view.setModel(model);
        view.setController(this);
    }
    
     public void show(){
        view.setVisible(true);
    } 
    @Override
    public void actionPerformed(ActionEvent evento){
        int i = view.getComBoxProvincia().getSelectedIndex();
        ComboBoxModel cantones;
        switch(i){
            
            case 0:{
                cantones = logic.Service.getInstance().getListCantones(i);
                view.getComBoxCanton().setModel(cantones);
                break;
            }
             
            case 1:{
                cantones = logic.Service.getInstance().getListCantones(i);
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            
            case 2:{
                cantones = logic.Service.getInstance().getListCantones(i);
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            
            case 3:{
                cantones = logic.Service.getInstance().getListCantones(i);
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            
            case 4:{
                cantones = logic.Service.getInstance().getListCantones(i);
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            
            case 5:{
                cantones = logic.Service.getInstance().getListCantones(i);
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            
            case 6:{
                cantones = logic.Service.getInstance().getListCantones(i);
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            default:{
                cantones = logic.Service.getInstance().getListCantones(0);
                view.getComBoxCanton().setModel(cantones);
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
