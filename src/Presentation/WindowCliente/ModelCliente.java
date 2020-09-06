/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowCliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Set;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import logic.*;

/**
 *
 * @author Porras
 */
public class ModelCliente extends Observable{
    private ComboBoxModel[] cantones;
    private DefaultComboBoxModel cantonActual;
    private List<Cliente> clientes;
    
    public ModelCliente(){
        clientes = new ArrayList<>();
        cantones = new ComboBoxModel[2];
        cantones[0] = new DefaultComboBoxModel(
                new String[]{"Tibas","Moravia"}
        );
        cantones[1] = new DefaultComboBoxModel(
                new String[]{"Santo Domingo","San Pablo"}
        );
    }
    
    
    @Override
    public void addObserver(java.util.Observer o){
        super.addObserver(o);
        notifyObservers(null);
    }
    
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();
    }
    
    public ComboBoxModel[] getCantones() {
        return cantones;
    }

    public DefaultComboBoxModel getCantonActual() {
        return cantonActual;
    }

    public void setCantones(ComboBoxModel[] cantones) {
        this.cantones = cantones;
    }

    public void setCantonActual(DefaultComboBoxModel cantonActual) {
        this.cantonActual = cantonActual;
    }
    
    public void setListCliente(List<Cliente> _list){
        this.clientes = _list;
    }
    
    public List<Cliente> getListCliente(){
        return clientes;
    }
   
}
