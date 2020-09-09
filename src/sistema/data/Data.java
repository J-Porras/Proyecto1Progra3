/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.data;

import java.util.*;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import logic.Cliente;
import logic.Empresa;
import logic.Factura;
import logic.Producto;

/**
 *
 * @author Porras
 */
public class Data {
    private List<Cliente> clientes;
    private List<Producto> productos;
    private Empresa empresa;
    private List<Factura> facturas;
    private ComboBoxModel[] cantones;
    
    
    

    public Data() {
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.empresa = new Empresa();
        this.facturas = new ArrayList<>();
        
        cantones = new ComboBoxModel[7];
        cantones[0] = new DefaultComboBoxModel(
                new String[]{"Tibas","Moravia","San Jose","Escazu","Desamparados","Puriscal","Tarrazu","Aserri",
                "Mora","Goicoechea","Goicoechea","Alajuelita","Vazquez de Coronado","Acosta","Montes de Oca",
                "Turrubares","Dota","Curridabat","Perez Zeledon","Leon Cortes Castro"}
        );
        cantones[1] = new DefaultComboBoxModel(
                new String[]{"Santo Domingo","San Pablo","Heredia","Barva","Santa Barbara","San Rafael","San Isidrio",
                "Belen","Flores","Sarapiqui"}
        );
        
        cantones[2] = new DefaultComboBoxModel(
                new String[]{"Alajuela","San Ramon","Grecia","San Mateo","Atenas","Naranjo","Palmares","Poas","Orotina",
                "San Carlos","Zarcero","Sarchi","Upala","Los Chiles","Guatuso","Río Cuarto"}       
        );
        
        cantones[3] = new DefaultComboBoxModel(
                new String[]{"Cartago","Paraiso","La Union","Jimenez","Turrialba","Alvarado","Oreamuno","El Guarco"}     
        );
        
        cantones[4] = new DefaultComboBoxModel(
                new String[]{"Liberia","Nicoya","Santa Cruz","Bagaces","Carrillo","Caañas",
                "Abangares","Tilaran","Nandayure","La Cruz","Hojancha"}
        );
         cantones[5] = new DefaultComboBoxModel(
                 new String[]{"Limon","Pococi","Siquirres","Talamanca","Matina","Guacimo"}
         );
         cantones[6] = new DefaultComboBoxModel(
                 new String[]{"Puntarenas","Esparza","Buenos Aires","Montes de Oro","Osa",
                 "Quepos","Golfito","Coto Brus","Parrita","Corredores","Garabito"}
         );
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Empresa getDataEmpresa(){
        return this.empresa;
    }

    public List<Factura> getListFacturas() {
        return facturas;
    }
    
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void setDataEmpresa(Empresa p){
        this.empresa = p;
    }

    public void setListFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public ComboBoxModel getListCantones(int i){
        return cantones[i];
    }
}
