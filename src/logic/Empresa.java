/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Porras
 */
public class Empresa {
    private String nomEmpresa;
    private String direccion;
    private String IDJurid;
    private String pagWeb;
    private int numTelefono;
    
    
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

    public Empresa() {
        this.nomEmpresa = "GreenSpices";
        this.direccion = "Heredia, Santo Domingo, centro comercial Plaza Nueva ";
        this.numTelefono = 22448002;
        this.IDJurid = "2-500-7340";
        this.pagWeb = "www.greenspices.com";
    }

    public Empresa(String nomEmpresa, String direccion, int numTelefono, String IDJurid, String pagWeb) {
        this.nomEmpresa = nomEmpresa;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.IDJurid = IDJurid;
        this.pagWeb = pagWeb;
    }
    
    
}
