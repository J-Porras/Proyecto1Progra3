/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**z|
 *
 * @author Porras
 */
public class Cliente {
    private String nombre;
    private Identificacion ID;
    private int numTel;

    public Cliente(String nombre, Identificacion ID, int numTel) {
        this.nombre = nombre;
        this.ID = ID;
        this.numTel = numTel;
    }

    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public Identificacion getID() {
        return ID;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(Identificacion ID) {
        this.ID = ID;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }
    
    
    
}
