/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

/**z|
 *
 * @author Porras
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente {
    
   // @XmlIDREF
   // private Identificacion ID;
    
    @XmlID
    private String ID;
    
    private int tipoID;
    
    private String nombre;
    
    private int numTel;

    private Ubicacion ubicacion;
    

    public Cliente(String ID, int tipoID, String nombre, int numTel, Ubicacion ubicacion) {
        this.ID = ID;
        this.tipoID = tipoID;
        this.nombre = nombre;
        this.numTel = numTel;
        this.ubicacion = ubicacion;
    }

    
    
    
    
    public Cliente() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    public String getNombre() {
        return nombre;
    }
    
    
    
    /*
    public Identificacion getID() {
        return ID;
    }*/

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
 
    
    public int getNumTel() {
        return numTel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
    public void setID(Identificacion ID) {
        this.ID = ID;
    }*/

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getTipoID() {
        return tipoID;
    }

    public void setTipoID(int tipoID) {
        this.tipoID = tipoID;
    }

   
    
    
    
    
    public boolean invalidCharacter(){
       return nombre.matches(".*\\d.*");
    }
    
}
