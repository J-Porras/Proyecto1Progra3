/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfacturacion;

/**
 *
 * @author pg300
 */
public class Producto {
    private String DescripcionProducto;
    private double Codigo;
   
    private double desc;
    private double precio;

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public double getCodigo() {
        return Codigo;
    }

    public void setCodigo(double Codigo) {
        this.Codigo = Codigo;
    }

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto(String DescripcionProducto, double desc, double precio) {
        this.DescripcionProducto = DescripcionProducto;
        this.desc = desc;
        this.Codigo= ((Math.random() * ((1999999-1000000  ) + 1)) + 1000000);
        this.precio = precio;
    }
    
    
}
