/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowFactura;

import java.util.List;
import java.util.Observable;
import logic.Producto;

/**
 *
 * @author Joaquin
 */
public class ModelFactura extends Observable {
    
    List<Producto> listProductos;
    
    public ModelFactura (){
        listProductos = logic.Service.getInstance().getListProductos();
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

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }
    
    
}
