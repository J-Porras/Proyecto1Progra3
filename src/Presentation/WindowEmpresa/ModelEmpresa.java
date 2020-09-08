/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowEmpresa;

/**
 *
 * @author Porras
 */

import java.util.Observable;
import java.util.Observer;
import logic.Empresa;

/**
 *
 * @author Porras
 */
public class ModelEmpresa extends Observable {
    private Empresa empresa;
    
    public ModelEmpresa(){
        empresa = new Empresa();
    }

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o); 
        notifyObservers(null);
    }

    public void commit(){
        this.setChanged();
        this.notifyObservers();
    }
    
    public void setDataEmprsa(Empresa p){
        this.empresa = p;
    }
    
    
}