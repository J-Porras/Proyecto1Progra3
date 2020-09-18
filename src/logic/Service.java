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
        data = new Data();
        datax = new Datax();
       
    }
    
    public static Service getInstance(){
        if (instance == null) {
            instance = new Service();
        } 
        return instance;
    }
    
    public List<Cliente> getListClientes(){
        if (this.datax.getClientes()!=null) {
            return this.datax.getClientes();
        }
        return null;
        
    }
    
    public void addCliente(Cliente c) throws Exception{
        //this.data.getClientes().add(c);
        this.datax.getClientes().add(c);
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
        return this.data.getCantones();
    }
    
    public Provincias getListProvincias(){
        return this.data.getProvincias();
    }
    
    public Cliente getDataCliente(Cliente cliente){
        Cliente aux;
        for (int i = 0; i < this.data.getClientes().size(); i++) {
            aux = data.getClientes().get(i);
            if (cliente.getID().equals(aux.getID())) {
                return cliente;
            }
        }
        return null;
    }
    
    public Producto getDataProducto(String codigo){
        Producto p;
        for (int i = 0; i < data.getProductos().size(); i++) {
            p = data.getProductos().get(i);
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }
    
    public float impuestoFactura(int impuesto,List<Producto> productos){
        float impuestodecimal = impuesto/100;
        float impuestotal = 0;
 
        for (int i = 0; i < 10; i++) {
            impuestotal += (productos.get(i).getPrecio()*impuestodecimal);
        }
        return impuestotal;
    }
    
    
    public float subtotal(List<Producto> productos){
        float subtotal = 0;
        for (int i = 0; i < 10; i++) {
            subtotal += (productos.get(i).getPrecio());
        }
        return subtotal;
    }
    
    public List<Factura> getFacturas() {
        return this.data.getListFacturas();
    }
    
    public void setData(Datax datax){
        this.datax = datax;
    }
    
}

