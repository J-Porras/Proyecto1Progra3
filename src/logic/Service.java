/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Porras
 */
public class Service {
    
    private static Service instance;
    List<Cliente> clientes;
    List<Producto> productos;
    
    private Service(){
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
    }
    
    public static Service getInstance(){
        if (instance == null) {
            instance = new Service();
        } 
        return instance;
    }
    
    public List<Cliente> getListClientes(){
        return this.clientes;
    }
    
    public void addCliente(Cliente c){
        this.clientes.add(c);
    }
    
    public List<Producto> getListProductos(){
        return this.productos;
    }
    
    public void addCliente(Producto p){
        this.productos.add(p);
    }
}
