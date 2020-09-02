/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import Presentation.WindowEmpresa.ControllerEmpresa;
import Presentation.WindowEmpresa.ModelEmpresa;
import Presentation.WindowEmpresa.ViewEmpresa;
import Presentation.WindowProductos.Controller;
import Presentation.WindowProductos.Model;
import Presentation.WindowProductos.View;

/**
 *
 * @author Porras
 */
public class SisFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewEmpresa view2 = new ViewEmpresa();
        ModelEmpresa model1 = new ModelEmpresa();
        ControllerEmpresa ctrl = new ControllerEmpresa(view2,model1);
        view2.setVisible(true);
        //Producto
        // Model model = new Model();
      // View view = new View();
      // Controller controller= new Controller(model,view) ;
     //  view.setVisible(true);
      
    }
    
}
