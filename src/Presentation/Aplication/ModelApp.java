/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Aplication;

import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author Escinf
 */
public class ModelApp extends Observable{

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.setChanged();
        this.notifyObservers();
    }

}











