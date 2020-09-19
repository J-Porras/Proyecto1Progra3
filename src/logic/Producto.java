/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author pgat3000
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class Producto {
    @XmlID
    private String Codigo;
    
    private String DescripcionProducto;
    
    private double precio;

    public Producto(String DescripcionProducto, double precio) {
        this.DescripcionProducto = DescripcionProducto;
        this.Codigo =  Integer.toString(ThreadLocalRandom.current().nextInt(1, 10000 + 1));
        //int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        this.precio = precio;
    }

    public Producto() {
        
    }
    
    
    
    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void newCode(){
        this.Codigo= Double.toString((Math.random() * ((19999-10000) + 1)) + 10000);
    }
    
    
}
