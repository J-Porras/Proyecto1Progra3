/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowFactura;

import java.util.Observable;

/**
 *
 * @author Joaquin
 */
public class ModelFactura extends Observable {
    
    public ModelFactura (){
        
    }  
    
    @Override
    public void addObserver(java.util.Observer o){
        super.addObserver(o);
        notifyObservers(null);
    }
    
    public void commit (){
        setChanged();
        notifyObservers();
    }

    public void setFacturas() {
        
    }
    
}
