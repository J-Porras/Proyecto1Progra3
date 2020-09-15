/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.data;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import logic.Cantones;
import logic.Cliente;
import logic.Empresa;
import logic.Factura;
import logic.Producto;
import logic.Provincias;

/**
 *
 * @author Porras
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {
    
    
    private List<Cliente> clientes;
    private List<Producto> productos;
    private Empresa empresa;
    private List<Factura> facturas;
    private Cantones cantones;
    private Provincias provincias;
   
    

    public Data() {
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.empresa = new Empresa();
        this.facturas = new ArrayList<>();
        this.cantones = new Cantones();
        this.provincias = new Provincias();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    
    
    public List<Producto> getProductos() {
        return productos;
    }

    public Empresa getDataEmpresa(){
        return this.empresa;
    }

    public List<Factura> getListFacturas() {
        return facturas;
    }
    
    public Cantones getCantones() {
        return cantones;
    }

    public Provincias getProvincias() {
        return provincias;
    }
    
    
    
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void setDataEmpresa(Empresa p){
        this.empresa = p;
    }

    public void setListFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    
    
    
}
