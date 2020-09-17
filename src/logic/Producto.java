/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

/**
 *
 * @author pgat3000
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class Producto {
    //@XmlID
    private int Codigo;
    
    private String DescripcionProducto;
    
    private double precio;

    public Producto(String DescripcionProducto, double precio) {
        this.DescripcionProducto = DescripcionProducto;
        this.Codigo= (int) ((Math.random() * ((199999-100000) + 1)) + 100000);
        this.precio = precio;
    }

    public Producto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public double getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void newCode(){
        this.Codigo= (int) ((Math.random() * ((199999-100000) + 1)) + 100000);
    }
    
    
}
