package Presentation.Aplication;

import Presentation.WindowCliente.ControllerCliente;
import Presentation.WindowCliente.ModelCliente;
import Presentation.WindowCliente.ViewCliente;
import Presentation.WindowEmpresa.ControllerEmpresa;
import Presentation.WindowEmpresa.ModelEmpresa;
import Presentation.WindowEmpresa.ViewEmpresa;
import Presentation.WindowProductos.ControllerProducto;
import Presentation.WindowProductos.ModelProducto;
import Presentation.WindowProductos.ViewProducto;

public class ControllerApp {
    ModelApp model;
    ViewApp view;

    public ControllerApp(ModelApp model, ViewApp view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
        
        initOptions();
    }

   ModelCliente cliente_Moddel;
    ViewCliente cliente_View;
    ControllerCliente cliente_Controller;
    //empresa
    ControllerEmpresa empresa_controller;
    ModelEmpresa empresa_model;
    ViewEmpresa empresa_view;
    //Productos
    ControllerProducto producto_controller;
    ModelProducto producto_model;
    ViewProducto producto_view;
    public void initOptions() {
        cliente_Moddel =  new ModelCliente();
        cliente_View = new ViewCliente();
       
        cliente_Controller = new ControllerCliente(cliente_Moddel,cliente_View);    
   //Porducto
        producto_model= new ModelProducto();
        producto_view = new ViewProducto();
        producto_controller = new ControllerProducto(producto_model,producto_view);
   //empresa
 
    empresa_model= new ModelEmpresa() ;
 empresa_view= new    ViewEmpresa();  
  empresa_controller= new ControllerEmpresa(empresa_view, empresa_model);
    }
        public void EmpresaShow(){
        this.empresa_controller.show();
    }
    public void clienteShow(){
        this.cliente_Controller.show();
    }
     public void ProductoShow(){
        this.producto_controller .show();
    }
}
