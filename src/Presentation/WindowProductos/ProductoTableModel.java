/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowProductos;

import static java.lang.Math.round;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import logic.Producto;



/**
 *
 * @author pgat3000
 */
public class ProductoTableModel extends AbstractTableModel{
    List<Producto> p;
    private String[] NombresColumna={"Codigo","Descripcion","Precio"};
    public ProductoTableModel(List<Producto> p) {
        this.p = p;
    }

   public int getRowCount() {
        return p.size();
    }

    @Override
    public int getColumnCount() {
      return NombresColumna.length;
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
         if(arg1==0){
            return round(p.get(arg0).getCodigo());
        }
        else if (arg1==1){
              return p.get(arg0).getDescripcionProducto();
        }
        else if(arg1==2){
            return round(p.get(arg0).getPrecio());
        }
       
        return 0;
    }
    
          public String getColumnName(int col) {
      return NombresColumna[col];
   }
    
}
