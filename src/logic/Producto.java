/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author pg300
 */
public class Producto {
    private String DescripcionProducto;
    private int Codigo;
    private double precio;

    public Producto(String DescripcionProducto, double precio) {
        this.DescripcionProducto = DescripcionProducto;
        this.Codigo= (int) ((Math.random() * ((199999-100000) + 1)) + 100000);
        this.precio = precio;
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

    
    
    
}
