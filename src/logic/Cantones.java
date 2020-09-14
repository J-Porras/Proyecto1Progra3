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
public class Cantones {
    private String[] cantonSanJose;
    private String[] cantonHeredia;
    private String[] cantonAlajuela;
    private String[] cantonCartago;
    private String[] cantonPuntarenas;
    private String[] cantonGuancaste;
    private String[] cantonLimon;
    
    public Cantones(){
        cantonSanJose = new String[]{"Tibas","Moravia","San Jose","Escazu","Desamparados","Puriscal","Tarrazu","Aserri",
                "Mora","Goicoechea","Goicoechea","Alajuelita","Vazquez de Coronado","Acosta","Montes de Oca",
                "Turrubares","Dota","Curridabat","Perez Zeledon","Leon Cortes Castro"};
        
        cantonHeredia = new String[]{"Santo Domingo","San Pablo","Heredia","Barva","Santa Barbara","San Rafael","San Isidrio",
                "Belen","Flores","Sarapiqui"};
        
        cantonAlajuela = new String[]{"Alajuela","San Ramon","Grecia","San Mateo","Atenas","Naranjo","Palmares","Poas","Orotina",
                "San Carlos","Zarcero","Sarchi","Upala","Los Chiles","Guatuso","Río Cuarto"};
        
        cantonCartago = new String[]{"Cartago","Paraiso","La Union","Jimenez","Turrialba",
                "Alvarado","Oreamuno","El Guarco"};
        
        cantonPuntarenas =  new String[]{"Puntarenas","Esparza","Buenos Aires","Montes de Oro","Osa",
                "Quepos","Golfito","Coto Brus","Parrita","Corredores","Garabito"};
        
        cantonGuancaste = new String[]{"Liberia","Nicoya","Santa Cruz","Bagaces","Carrillo","Caañas",
                "Abangares","Tilaran","Nandayure","La Cruz","Hojancha"};
        
        cantonLimon = new String[]{"Limon","Pococi","Siquirres","Talamanca","Matina","Guacimo"};
    }

    public String[] getCantonSanJose() {
        return cantonSanJose;
    }

    public String[] getCantonHeredia() {
        return cantonHeredia;
    }

    public String[] getCantonAlajuela() {
        return cantonAlajuela;
    }

    public String[] getCantonCartago() {
        return cantonCartago;
    }

    public String[] getCantonPuntarenas() {
        return cantonPuntarenas;
    }

    public String[] getCantonGuancaste() {
        return cantonGuancaste;
    }

    public String[] getCantonLimon() {
        return cantonLimon;
    }
    
    
    
}
