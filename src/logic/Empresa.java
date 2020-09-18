/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;

/**
 *
 * @author Porras
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Empresa{
    
    @XmlID
    private String IDJurid;
     
    private String nomEmpresa;
    //@XmlAttribute
    private String direccion;
    
    //@XmlAttribute
   
   // @XmlAttribute
    private String pagWeb;
    
    //@XmlAttribute
    private int numTelefono;
    
    public Empresa(String nomEmpresa, String direccion, int numTelefono, String IDJurid, String pagWeb) {
        this.nomEmpresa = nomEmpresa;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.IDJurid = IDJurid;
        this.pagWeb = pagWeb;
    }
    
    public Empresa() {
        this.nomEmpresa = "GreenSpices";
        this.direccion = "Heredia, Santo Domingo, centro comercial Plaza Nueva ";
        this.numTelefono = 22448002;
        this.IDJurid = "2-500-7340";
        this.pagWeb = "www.greenspices.com";
    }
    
    
    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public String getIDJurid() {
        return IDJurid;
    }

    public String getPagWeb() {
        return pagWeb;
    }

    public void setIDJurid(String IDJurid) {
        this.IDJurid = IDJurid;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
 
    
}
