/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowCliente;

import java.util.Observable;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Porras
 */
public class ModelCliente extends Observable{
    ComboBoxModel[] cantones;
    ComboBoxModel[] distritosChepe;
    ComboBoxModel[] distritosHeredia;
    
    public ModelCliente(){
        cantones = new ComboBoxModel[2];
        cantones[0] = new DefaultComboBoxModel(
                new String[]{"Tibas","Moravia"}
        );
        cantones[1] = new DefaultComboBoxModel(
                new String[]{"Santo Domingo","San Pablo"}
        );
        
        
        distritosChepe = new ComboBoxModel[2];
        distritosHeredia = new ComboBoxModel[2];
        distritosChepe[0] = new DefaultComboBoxModel(
                new String[]{"San Juan","Cinco Esquinas"}
        );
        distritosChepe[1] = new DefaultComboBoxModel(
                new String[]{"San Vicente","San Jeronimo"}
        );
        
        distritosHeredia[0] = new DefaultComboBoxModel(
                new String[]{"Santa Rosa","Santo Tomas","Santo Domingo"}
        );
        distritosHeredia[1] = new DefaultComboBoxModel(
                new String[]{"San Pablo","Rincon de Sabanilla"}
        );
    }
    
    
    @Override
    public void addObserver(java.util.Observer o){
        super.addObserver(o);
        setChanged();
        notifyObservers(null);
    }
    
}
