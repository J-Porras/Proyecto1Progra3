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
public abstract class Factura {
    private int Codigo;
    private double total;
    private int cantidad;
    private Cliente cliente1;
    private String formaDePago;
    private Fecha fechaVencimiento;
    private Fecha diaActual;
    private String ClaveElectronica;
    private String NumeroFacturaElectronica;
    private int Plazo;
    public String getCodigo(){
    return "FA-"+Codigo;} 
    
    public abstract void  crearFactura();

    public Factura( int Codigo, double total, int cantidad, Cliente cliente1, String formaDePago, Fecha diaActual, String ClaveElectronica, String NumeroFacturaElectronica) {
        this.Codigo =Codigo;
        this.total = total;
        this.cantidad = cantidad;
        this.cliente1 = cliente1;
        this.formaDePago = formaDePago;
        this.diaActual = diaActual;
        this.ClaveElectronica = ClaveElectronica;
        this.NumeroFacturaElectronica = NumeroFacturaElectronica;
    }
    
}
