/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

/**
 *
 * @author pg300
 */

@XmlAccessorType(XmlAccessType.FIELD)
//para serializar campos
public abstract class Factura {
    @XmlID
    protected String codigo;
    
    
    protected double total;
    protected int cantidadProducto;
    protected String formaDePago;
    //protected String claveElectronica;
    //protected String NumeroFacturaElectronica;
    //protected int Plazo;
    
    // atributos no primitivos
    protected Fecha fechaVencimiento;
    protected Fecha diaActual;
    @XmlIDREF
    protected Cliente cliente1;
    @XmlIDREF
    protected Empresa empresa;
    //Lista Productos??
    @XmlIDREF
    protected List<Producto> productos;
    
    
    public abstract void  crearFactura();
    
    //definicion de constructor

    public Factura(String codigo, double total, int cantidadProducto, String formaDePago,
            Cliente cliente1, Empresa empresa, 
            List<Producto> productos) 
    {
        this.codigo = codigo;
        this.total = total;
        this.cantidadProducto = cantidadProducto;
        this.formaDePago = formaDePago;
        this.fechaVencimiento = new Fecha();
        
        this.diaActual = new Fecha();
        this.cliente1 = cliente1;
        this.empresa = empresa;
        this.productos = productos;
        
      
    }

    
    public String getCodigo(){
         return "FA."+codigo;
    } 

    public double getTotal() {
        return total;
    }

    public int getCantidad() {
        return cantidadProducto;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public Fecha getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Fecha getDiaActual() {
        return diaActual;
    }

    public Cliente getCliente1() {
        return cliente1;
    }


    public List<Producto> getProducto() {
        return productos;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
        
    
    
    
    
    
    
    
    
    
    
}
