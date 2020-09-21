/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.time.LocalDate;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import sistema.errors.CharacterExcep;
import sistema.errors.EmptySpaceExcep;


/**
 *
 * @author pg300
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Factura {
    
    @XmlID
    protected String codigo;
    
    
    protected double total;
    protected int cantidadProducto;
    protected String formaDePago;
    
    // atributos no primitivos
    protected Fecha fechaVencimiento;
    protected Fecha diaActual;
    @XmlIDREF
    protected Cliente cliente;
    @XmlIDREF
    protected Empresa empresa;
    @XmlIDREF
    protected List<Producto> productos;
    
    
   

    
    
    public Factura(String codigo, double total, int cantidadProducto, String formaDePago,
            Cliente cliente, Empresa empresa, 
            List<Producto> productos) 
    {
        this.codigo = codigo;
        this.total = total;
        this.cantidadProducto = cantidadProducto;
        this.formaDePago = formaDePago;
        this.fechaVencimiento = new Fecha();
        
        this.diaActual = new Fecha();
        this.cliente = cliente;
        this.empresa = empresa;
        this.productos = productos;
        
        diaActual.setDia(LocalDate.now().getDayOfMonth());
        diaActual.setMes(LocalDate.now().getMonthValue());
        diaActual.setAnio(LocalDate.now().getYear());
        fechaVencimiento.setDia(LocalDate.now().plusYears(1).getDayOfMonth());
        fechaVencimiento.setMes(LocalDate.now().plusYears(1).getMonthValue());
        fechaVencimiento.setAnio(LocalDate.now().plusYears(1).getYear());

    }
    
    public void crearFactura() throws CharacterExcep{
    
    }
    
    //definicion de constructor

    public Factura() {
    }
    
    public String getCodigo(){
         return codigo;
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
        return cliente;
    }


    public List<Producto> getProducto() {
        return productos;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
        
    
    
    
    
    
    
    
    
    
    
}
