/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import sistema.data.Data;
import java.util.List;


/**
 *
 * @author Porras
 */
public class Service {
    
    private static Service instance;
    Data data;
    XmlPersister xmlpersister;
    
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
    
    public void addCliente(Cliente c) throws Exception{
        this.data.getClientes().add(c);
        logic.XmlPersister.getInstance().store(this.data);
    }
    
    public List<Producto> getListProductos(){
        return this.data.getProductos();
    }
    
    
    public void addProducto(Producto p) throws Exception{
        this.data.getProductos().add(p);
        //this.xmlpersister.store(this.data);
    }
    
    public void setDataEmpresa(Empresa emp) throws Exception{
        this.data.setDataEmpresa(emp);
        //this.xmlpersister.store(this.data);
        
    }
    
    public Empresa getDataEmpresa(){
        return this.data.getDataEmpresa();
    }
    
    public Cantones getListCantones(){
        return this.data.getCantones();
    }
    
    public Provincias getListProvincias(){
        return this.data.getProvincias();
    }
    
    
    
}

