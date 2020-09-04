/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowEmpresa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logic.Empresa;

/**
 *
 * @author Porras
 */
public class ControllerEmpresa implements ActionListener {
    private ViewEmpresa  view;
    private ModelEmpresa model;

    public ControllerEmpresa(ViewEmpresa view,ModelEmpresa mod) {
        this.view = view;
        this.model = mod;
        view.setModel(model);
        view.setController(this);
    }

 
    
    public void actionPerformed(ActionEvent evento){
        String nombre = view.getTxtNomEmpresa().getText();
            String id = view.getTxtCedJurid().getText();
            String direccion = view.getTxtDireccion().getText();
            int telefono = Integer.parseInt(view.getTxtNumTel().getText());
            String pagweb = view.getTxtDirPagWeb().getText();
            Empresa emp = new Empresa(nombre,direccion,telefono,id,pagweb);
            
            model.change(emp);
    }
    
}
