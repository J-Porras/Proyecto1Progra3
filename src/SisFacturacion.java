/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
import Presentation.WindowCliente.ControllerCliente;
import Presentation.WindowCliente.ModelCliente;
import Presentation.WindowCliente.ViewCliente;

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
        ViewEmpresa view2 = new ViewEmpresa();
        ModelEmpresa model1 = new ModelEmpresa();
        ControllerEmpresa ctrl = new ControllerEmpresa(view2,model1);
        view2.setVisible(true);*/
      
        /*
        Model model = new Model();
        View view = new View();
        Controller controller= new Controller(model,view) ;
        view.setVisible(true);*/
        
        
       ModelCliente modelc = new ModelCliente();
       ViewCliente viewc = new ViewCliente();
       ControllerCliente controllerc = new ControllerCliente(modelc,viewc);
       
       viewc.setVisible(true);
    
    }
    
}
