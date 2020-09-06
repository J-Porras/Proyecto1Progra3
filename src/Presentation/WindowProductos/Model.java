/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowProductos;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


import logic.Producto;



/**
 *
 * @author pgat3000
 */
public class Model extends  Observable {
  List<Producto> productos;
  
   
    public Model (){
        productos = new ArrayList<>();
    }
  
    
    @Override
    public void addObserver(java.util.Observer o){
        super.addObserver(o);
        notifyObservers(null);
    }

    
    public void commit (Producto p){
        productos.add(p);
        setChanged();
        notifyObservers();
    }
    
   
}
