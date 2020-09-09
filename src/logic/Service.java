/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import sistema.data.Data;
import java.util.List;
import javax.swing.ComboBoxModel;


/**
 *
 * @author Porras
 */
public class Service {
    
    private static Service instance;
    Data data;
    
    private Service(){
        data = new Data();
    }
    
    public static Service getInstance(){
        if (instance == null) {
            instance = new Service();
        } 
        return instance;
    }
    
    public List<Cliente> getListClientes(){
        return this.data.getClientes();
    }
    
    public void addCliente(Cliente c){
        this.data.getClientes().add(c);
    }
    
    public List<Producto> getListProductos(){
        return this.data.getProductos();
    }
    
    public void addProducto(Producto p){
        this.data.getProductos().add(p);
    }
    
    public void setDataEmpresa(Empresa emp){
        this.data.setDataEmpresa(emp);
        
    }
    
    public Empresa getDataEmpresa(){
        return this.data.getDataEmpresa();
    }
    
    public ComboBoxModel getListCantones(int i){
        return this.data.getListCantones(i);
    }
}
