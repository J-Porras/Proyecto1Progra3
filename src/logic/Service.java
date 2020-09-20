/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import sistema.data.Data;
import java.util.List;
import sistema.data.Datax;


/**
 *
 * @author Porras
 */
public class Service {
    
    private static Service instance;
    Data data;
    Datax datax;
    
    private Service(){
       // data = new Data();
        datax = new Datax();
       
    }
    
    public static Service getInstance(){
        if (instance == null) {
            instance = new Service();
        } 
        return instance;
    }
    
    public List<Cliente> getListClientes(){
       return this.datax.getClientes();
        
    }
    
    public void addCliente(Cliente c) throws Exception{
        this.datax.getClientes().add(c);
        logic.XmlPersister.getInstance().store(this.datax);
    }
    
    //recien hecho
    public void addFactura(Factura f) throws Exception{
        this.data.getListFacturas().add(f);
        logic.XmlPersister.getInstance().store(this.datax);
    }
    
    public List<Producto> getListProductos(){
        return this.datax.getProductos();
    }
    
    
    public void addProducto(Producto p) throws Exception{
        this.datax.getProductos().add(p);
        logic.XmlPersister.getInstance().store(this.datax);
    }
    
    public void setDataEmpresa(Empresa emp) throws Exception{
        this.datax.setEmpresa(emp);
        logic.XmlPersister.getInstance().store(this.datax);
        
    }
    
    public Empresa getDataEmpresa(){
        if (this.datax.getEmpresa()!=null) {
            return this.datax.getEmpresa();
        }
        return null;
    }
    
    public Cantones getListCantones(){
        return this.datax.getCantones();
    }
    
    public Provincias getListProvincias(){
        return this.datax.getProvincias();
    }
    
    public boolean isDuplicated(Cliente cliente){
        Cliente aux;
        for (int i = 0; i < this.datax.getClientes().size(); i++) {
            aux = datax.getClientes().get(i);
            if (cliente.getID().equals(aux.getID())) {
                return true;
            }
        }
        return false;
    }
    
    public Cliente getDataCliente(Cliente cliente){
        Cliente aux;
        for (int i = 0; i < this.datax.getClientes().size(); i++) {
            aux = datax.getClientes().get(i);
            if (cliente.getID().equals(aux.getID())) {
                return aux;
            }
        }
        return null;
    }
    
    public Producto getDataProducto(String codigo){
        Producto p;
        for (int i = 0; i < datax.getProductos().size(); i++) {
            p = this.datax.getProductos().get(i);
            if (codigo.equals(p.getCodigo())) {
                return p;
            }
        }
        return null;
    }
    
    public float impuestoFactura(float impuesto,List<Producto> productos){
        float impuestodecimal = impuesto/100;
        float impuestotal = 0;
 
        for (int i = 0; i < productos.size(); i++) {
            impuestotal += (productos.get(i).getPrecio()*impuestodecimal);
        }
        return impuestotal;
    }
    
    
    public float subtotal(List<Producto> productos){
        float subtotal = 0;
        for (int i = 0; i < productos.size(); i++) {
            subtotal += (productos.get(i).getPrecio());
        }
        return subtotal;
    }
    
    public List<Factura> getFacturas() {
        return this.datax.getListFacturas();
    }
    
    public void setData(Datax datax){
        this.datax = datax;
    }
    
}

