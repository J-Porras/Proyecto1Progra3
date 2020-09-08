/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.data;

import java.util.*;
import logic.Cliente;
import logic.Empresa;
import logic.Producto;

/**
 *
 * @author Porras
 */
public class Data {
    private List<Cliente> clientes;
    private List<Producto> productos;
    private Empresa empresa;

    public Data() {
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.empresa = new Empresa();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void setDataEmpresa(Empresa p){
        this.empresa = p;
    }
    
    public Empresa getDataEmpresa(){
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
}
