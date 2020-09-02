/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowEmpresa;

import java.util.Observable;
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
    
    public void change(Empresa emp){
        empresa = emp;
        setChanged();
        notifyObservers();
    }
    
    
}
