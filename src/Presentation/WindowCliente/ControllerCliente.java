
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
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
        view.setModel(model);
        view.setController(this);
        view.getComBoxProvincia().setModel(new DefaultComboBoxModel(logic.Service.getInstance().getListProvincias().getProvincias()));
        initComponents();
    }
    
    public void show(){
        view.setVisible(true);
    }
     
    public void initComponents(){
       model.setListCliente(logic.Service.getInstance().getListClientes());
       model.commit();  
    }
    
    
     
    @Override
    public void actionPerformed(ActionEvent evento){
        int i = view.getComBoxProvincia().getSelectedIndex();
        ComboBoxModel cantones;
        switch(i){
            
            case 0:{
                cantones = new DefaultComboBoxModel(logic.Service.getInstance().getListCantones().getCantonSanJose());
                view.getComBoxCanton().setModel(cantones);
                break;
            }
             
            case 1:{
                cantones = new DefaultComboBoxModel(logic.Service.getInstance().getListCantones().getCantonHeredia());
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            
            case 2:{
                cantones = new DefaultComboBoxModel(logic.Service.getInstance().getListCantones().getCantonAlajuela());
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            
            case 3:{
                cantones = new DefaultComboBoxModel(logic.Service.getInstance().getListCantones().getCantonCartago());
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            
            case 4:{
                cantones = new DefaultComboBoxModel(logic.Service.getInstance().getListCantones().getCantonGuancaste());
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            
            case 5:{
                cantones = new DefaultComboBoxModel(logic.Service.getInstance().getListCantones().getCantonLimon());
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            
            case 6:{
                cantones = new DefaultComboBoxModel(logic.Service.getInstance().getListCantones().getCantonPuntarenas());
                view.getComBoxCanton().setModel(cantones);
                break;
            }
            default:{
                cantones = new DefaultComboBoxModel(logic.Service.getInstance().getListCantones().getCantonSanJose());
                view.getComBoxCanton().setModel(cantones);
                break;
            }
        }
    }
    
    public void addCliente(Cliente c) throws Exception{
        //xml
        logic.Service.getInstance().addCliente(c);
        
        //view
        model.setListCliente(logic.Service.getInstance().getListClientes());
        model.commit();
    }
}    
    
   
    
    