/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

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
    protected int codigo;
    
    
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
    protected Producto producto;
    
    
    public abstract void  crearFactura();
    
    //definicion de constructor
    public Factura(int Codigo, double total, int cantidad, String formaDePago, Fecha fechaVencimiento, Fecha diaActual, String ClaveElectronica, String NumeroFacturaElectronica,
            int Plazo, Cliente cliente1, Fecha fecha, Producto producto, Empresa empresa) {
        this.codigo = Codigo;
        this.total = total;
        this.cantidadProducto = cantidad;
        this.formaDePago = formaDePago;
        this.fechaVencimiento = fechaVencimiento;
        this.diaActual = diaActual;
        //this.claveElectronica = ClaveElectronica;
        //this.NumeroFacturaElectronica = NumeroFacturaElectronica;
       // this.Plazo = Plazo;
        this.cliente1 = cliente1;
        //this.fecha = fecha;
        this.producto = producto;
        this.empresa = empresa;
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
    /*
    public String getClaveElectronica() {
        return claveElectronica;
    }*/
    
    /*

    public String getNumeroFacturaElectronica() {
        return NumeroFacturaElectronica;
    }*/

    /*public int getPlazo() {
        return Plazo;
    }*/

    public Fecha getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Fecha getDiaActual() {
        return diaActual;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    /*
    public Fecha getFecha() {
        return fecha;
    }*/

    public Producto getProducto() {
        return producto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
        
    
    
    
    
    
    
    
    
    
    
}
