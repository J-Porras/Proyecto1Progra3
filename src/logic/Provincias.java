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
public class Provincias {
    private String[] provincias;
    
    public Provincias(){
        provincias = new String[]{"San Jose","Heredia","Alajuela","Cartago","Guanacaste","Limon","Puntareas"};
    }
    
    public String[] getProvincias(){
        return provincias;
    }
}
