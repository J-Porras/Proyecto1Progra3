/*
 * 
 */
package logic;

/**
 * Administración de provincias, cantones y distritos.
 * @author Joaquin
 */
public class Ubicacion {
    private int provincia; 
    private int canton;
    private int distrito;
    private String detalle;

    public Ubicacion(int provincia, int canton, int distrito, String detalle) {
        this.provincia = provincia;
        this.canton = canton;  
        this.distrito = distrito;
        this.detalle = detalle;
    }
    
    
    
} 
