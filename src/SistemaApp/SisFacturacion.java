package SistemaApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
import Presentation.Aplication.ControllerApp;
import Presentation.Aplication.ModelApp;
import Presentation.Aplication.ViewApp;
import Presentation.WindowCliente.ControllerCliente;
import Presentation.WindowCliente.ModelCliente;
import Presentation.WindowCliente.ViewCliente;

import Presentation.WindowProductos.*;

/**
 *
 * @author Porras
 */
public class SisFacturacion {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      ControllerApp controller;
      ModelApp model;
      ViewApp view;
      model = new ModelApp();
      view = new ViewApp();
      controller = new ControllerApp(model,view);
      view.setVisible(true);
      
    }
    
}
