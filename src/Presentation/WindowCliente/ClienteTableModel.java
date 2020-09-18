/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowCliente;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import logic.*;
        
/**
 *
 * @author Porras
 */
public class ClienteTableModel extends AbstractTableModel {
    private String[] nombresColumna={"ID","Nombre","Telefono","Provincia","Canton"};
    private List<Cliente> clientes;

    public ClienteTableModel(List<Cliente> clientesModel) {
        this.clientes = clientesModel;
    }

    
    
    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return nombresColumna.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return clientes.get(rowIndex).getID().getNumero();
        }
        else    
        if (columnIndex == 1) {
            return clientes.get(rowIndex).getNombre();
        }
        else
        if (columnIndex == 2) {
            return clientes.get(rowIndex).getNumTel();
        }
        else
        if (columnIndex == 3) {
            return clientes.get(rowIndex).getUbicacion().getProvincia();
        }
        else
            if(columnIndex == 4){
                return clientes.get(rowIndex).getUbicacion().getCanton();
            }
        return 0;
    }
     public String getColumnName(int col) {
      return nombresColumna[col];
    }   
    
    
}
