/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowFactura;

import Presentation.WindowProductos.ProductoTableModel;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JTable;
import logic.Cliente;
import logic.Factura;
import logic.FacturaPDF;
import logic.Identificacion;
import logic.Producto;
import sistema.errors.EmptySpaceExcep;

/**
 *
 * @author Joaquin
 */
public class ViewFactura extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form ViewFactura
     */
    
    ModelFactura model;
    ControllerFactura controller;
    
    public ViewFactura() {
        initComponents(); 
    }
    
    @Override
    public void update(Observable o, Object arg) {
        this.tableProductosFac.setModel(new ProductoTableModel(this.model.getProductosFactura()));
        this.lblSubtotal.setText(Float.toString(logic.Service.getInstance().subtotal(model.getProductosFactura())));
        
        this.lblImpuesto.setText(Float.toString(logic.Service.getInstance().impuestoFactura(13, model.getProductosFactura())));
        
        float total = logic.Service.getInstance().impuestoFactura(13, model.getProductosFactura()) + 
                logic.Service.getInstance().subtotal(model.getProductosFactura());
        
        this.lblTotal.setText(Float.toString(total));
        
    }
    
    public void setModel(ModelFactura model){
        this.model = model;
        model.addObserver(this);
    }
    
    public void setController(ControllerFactura controller){
        this.controller = controller;
    }

    public JTable getTableProductos() {
        return tableProductos;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addProduc = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rdbtnEfectivo = new javax.swing.JRadioButton();
        rdbtnTarjeta = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnFinalizarFactur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProductosFac = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblImpuesto = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Detalles de Factura");

        jLabel2.setText("Condición de la venta:");

        jLabel3.setText("Forma de pago:");

        jLabel4.setText("Moneda:");

        addProduc.setText("Agregar Producto");
        addProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProducActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel5.setText("Contado");

        buttonGroup1.add(rdbtnEfectivo);
        rdbtnEfectivo.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        rdbtnEfectivo.setText("Efectivo");

        buttonGroup1.add(rdbtnTarjeta);
        rdbtnTarjeta.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        rdbtnTarjeta.setText("Tarjeta");
        rdbtnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTarjetaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel6.setText("Colones");

        jLabel7.setText("Impuesto valor agregado: ");

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel8.setText("13%");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Contenidos de Factura");

        jLabel10.setText("ID Cliente:");

        btnFinalizarFactur.setText("Finalizar Factura");
        btnFinalizarFactur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarFacturActionPerformed(evt);
            }
        });

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tableProductos);
        if (tableProductos.getColumnModel().getColumnCount() > 0) {
            tableProductos.getColumnModel().getColumn(0).setHeaderValue("Codigo");
            tableProductos.getColumnModel().getColumn(1).setHeaderValue("Descripcion");
            tableProductos.getColumnModel().getColumn(2).setHeaderValue("Precio");
        }

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel12.setText("Nombre");

        jLabel13.setText("-------");
        jLabel13.setToolTipText("");

        jLabel11.setText("Lista de Productos");

        tableProductosFac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio"
            }
        ));
        jScrollPane2.setViewportView(tableProductosFac);
        if (tableProductosFac.getColumnModel().getColumnCount() > 0) {
            tableProductosFac.getColumnModel().getColumn(0).setHeaderValue("Codigo");
            tableProductosFac.getColumnModel().getColumn(1).setHeaderValue("Descripcion");
            tableProductosFac.getColumnModel().getColumn(2).setHeaderValue("Precio");
        }

        jLabel14.setText("Subtotal:");

        lblSubtotal.setText("-------");
        lblSubtotal.setToolTipText("");

        jLabel15.setText("Impuesto:");

        lblImpuesto.setText("-------");

        jLabel17.setText("Total:");

        lblTotal.setText("-------");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel16.setText("Productos en Factura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbtnEfectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnTarjeta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCliente))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addProduc)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnFinalizarFactur)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliente)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rdbtnEfectivo)
                            .addComponent(rdbtnTarjeta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lblTotal)
                            .addComponent(btnFinalizarFactur)
                            .addComponent(btnSalir))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(addProduc)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnTarjetaActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        try {
            if (txtIDCliente.getText().isEmpty()) {
                throw new EmptySpaceExcep();
            }
            Cliente clienteaux = new Cliente();
            clienteaux.setID(txtIDCliente.getText());
            clienteaux = logic.Service.getInstance().getDataCliente(clienteaux);
            if (clienteaux !=null) {
                this.model.setClienteActual(clienteaux);
                this.jLabel13.setText(this.model.getClienteActual().getNombre());
                
            }
            
        }
        catch(EmptySpaceExcep e){
            e.infoError("Error", e, this);
        }
        
        catch (Exception e) {
        }
     
        
        
        
        
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void addProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProducActionPerformed
        // TODO add your handling code here:
        try {
            int rowIndex = tableProductos.getSelectedRow();
            String codigo = tableProductos.getValueAt(rowIndex, 0).toString();
            Producto p = logic.Service.getInstance().getDataProducto(codigo);
            this.controller.addProdFactura(p);
              
            
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_addProducActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnFinalizarFacturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarFacturActionPerformed
        // TODO add your handling code here:
        try {
            
            float total = logic.Service.getInstance().impuestoFactura(13, model.getProductosFactura()) + 
                    logic.Service.getInstance().subtotal(model.getProductosFactura());

            String formaPago = null;
            if (rdbtnTarjeta.isSelected()) {
                formaPago = "Tarjeta";
            }
            else if (rdbtnEfectivo.isSelected()  ) {
                formaPago = "Efectivo";
            }
            else   
                throw new EmptySpaceExcep();
            
            Factura factura = new FacturaPDF(Integer.toString(logic.Service.getInstance().getFacturas().size()),total,model.getProductosFactura().size(),
            formaPago,model.getClienteActual(),logic.Service.getInstance().getDataEmpresa(),model.getProductosFactura());
            factura.crearFactura();
            
        }
        catch(EmptySpaceExcep e){
            e.infoError("Error", e, this);
        }
        catch (Exception e) {
        }
        
       
    }//GEN-LAST:event_btnFinalizarFacturActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProduc;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnFinalizarFactur;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImpuesto;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rdbtnEfectivo;
    private javax.swing.JRadioButton rdbtnTarjeta;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTable tableProductosFac;
    private javax.swing.JTextField txtIDCliente;
    // End of variables declaration//GEN-END:variables

    
}
