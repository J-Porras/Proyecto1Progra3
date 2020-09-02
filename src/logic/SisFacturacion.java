/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

//import Presentation.WindowProductos.Controller;
//import Presentation.WindowProductos.Model;
//import Presentation.WindowProductos.View;

import Presentation.WindowEmpresa.ControllerEmpresa;
import Presentation.WindowEmpresa.ModelEmpresa;
import Presentation.WindowEmpresa.ViewEmpresa;
 
import Presentation.WindowCliente.View;

/**
 *
 * @author Porras
 */
public class SisFacturacion {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
        /*
        Model model = new Model();
        View view = new View();
        Controller controller= new Controller(model,view) ;
        view.setVisible(true);*/
        
        
        
        ViewEmpresa view = new ViewEmpresa();
        view.setVisible(true);

        
        
        View view1 = new View();
        view1.setVisible(true);
    }
    
}
