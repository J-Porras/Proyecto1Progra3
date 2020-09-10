package Presentation.Aplication;

import Presentation.WindowCliente.ControllerCliente;
import Presentation.WindowCliente.ModelCliente;
import Presentation.WindowCliente.ViewCliente;
import Presentation.WindowEmpresa.ControllerEmpresa;
import Presentation.WindowEmpresa.ModelEmpresa;
import Presentation.WindowEmpresa.ViewEmpresa;
import Presentation.WindowFactura.ControllerFactura;
import Presentation.WindowFactura.ModelFactura;
import Presentation.WindowFactura.ViewFactura;
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
    //factura
   ModelFactura facturas_model;
   ViewFactura facturas_view;
   ControllerFactura facturas_controller;
   //cliente
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
  //factura
   facturas_model= new ModelFactura() ;
    facturas_view= new ViewFactura();
   facturas_controller = new ControllerFactura(facturas_model,facturas_view) ;
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
      public void FacturaShow(){
        this.facturas_controller.show();
    }
}
