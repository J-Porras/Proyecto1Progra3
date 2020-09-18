/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

/**z|
 *
 * @author Porras
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente {
    
    private Identificacion ID;
    
    private String nombre;
    
    private int numTel;

    private Ubicacion ubicacion;
    
    
    
    public Cliente(String nombre, Identificacion ID, int numTel,Ubicacion ubicacion) {
        this.nombre = nombre;
        this.ID = ID;
        this.numTel = numTel;
        this.ubicacion = ubicacion;
    }

    public Cliente() {
        
    }

    
    public String getNombre() {
        return nombre;
    }

    public Identificacion getID() {
        return ID;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
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
    
    public boolean invalidCharacter(){
       return nombre.matches(".*\\d.*");
    }
    
    @XmlID
    public String getNumID(){
        return this.ID.getNumero();
    }
}
