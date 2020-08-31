/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfacturacion;

/**
 *
 * @author Joaquin
 */
public class Ubicacion {
    private int provincia; 
    private int canton;
    private int distrito;
    private String detalle;

    public Ubicacion(int provincia, int canton, int distrito, String detalle) {
        if (provincia > 0 && provincia < 8){            
            this.provincia = provincia;
        }
        this.canton = canton;  
        this.distrito = distrito;
        this.detalle = detalle;
    }
    
    
    
}
