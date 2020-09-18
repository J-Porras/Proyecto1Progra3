/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowFactura;

import java.util.List;
import java.util.Observable;
import logic.Cliente;
import logic.Producto;

/**
 *
 * @author Joaquin
 */
public class ModelFactura extends Observable {
    
    private List<Producto> listProductos;
    private List<Producto> productosFactura;
    private List<Cliente> listclientes;
    private Cliente clienteActual;
    public ModelFactura (){
        listProductos = logic.Service.getInstance().getListProductos();
        productosFactura = logic.Service.getInstance().getListProductos();
        listclientes = logic.Service.getInstance().getListClientes();
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

    public List<Cliente> getListclientes() {
        return listclientes;
    }

    public void setListclientes(List<Cliente> listclientes) {
        this.listclientes = listclientes;
    }

    public Cliente getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(Cliente clienteActual) {
        this.clienteActual = clienteActual;
    }

    public List<Producto> getProductosFactura() {
        return productosFactura;
    }

    public void setProductosFactura(List<Producto> productosFactura) {
        this.productosFactura = productosFactura;
    }
    
    
}
