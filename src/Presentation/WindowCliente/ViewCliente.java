/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowCliente;

import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import logic.Cliente;
import logic.Identificacion;
import logic.Ubicacion;
import sistema.errors.*;


/**
 *
 * @author Porras
 */
public class ViewCliente extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form View
     */
    
    ModelCliente model;
    ControllerCliente controller;
    
    
    @Override
    public void update(Observable updatedmOdel, Object param){
        ClienteTableModel table = new ClienteTableModel(model.getListCliente());
        this.tableClientes.setModel(table);
    }
    
    public ViewCliente() {
        initComponents();
    }

    public JComboBox<String> getComBoxProvincia() {
        return comBoxProvincia;
    }

    public JComboBox<String> getComBoxCanton() {
        return comBoxCanton;
    }

    public JComboBox<String> getComBoxID() {
        return comBoxID;
    }

    public JTextField getTxtNombre1() {
        return txtNombre1;
    }

    public JTextField getTxtNumTel() {
        return txtNumTel;
    }

    public JTextField getTxt_ID() {
        return txt_ID;
    }

    public void setModel(ModelCliente model){
        this.model = model; 
        model.addObserver(this);//ERA ESTA
    }
        
    public void setComBoxCanton(JComboBox<String> comBoxCanton) {
        this.comBoxCanton = comBoxCanton;
    }

    public void setComBoxProvincia(JComboBox<String> comBoxProvincia) {
        this.comBoxProvincia = comBoxProvincia;
    }

    public void setController(ControllerCliente controller) {
        this.controller = controller ;
        this.comBoxProvincia.addActionListener(controller);
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comBoxProvincia = new javax.swing.JComboBox<>();
        comBoxCanton = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comBoxID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        txtNumTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        comBoxProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San Jose", "Heredia", "Alajuela", "Cartago", "Guancaste", "Limon", "Puntarenas" }));
        comBoxProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxProvinciaActionPerformed(evt);
            }
        });

        comBoxCanton.setPreferredSize(new java.awt.Dimension(100, 26));
        comBoxCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxCantonActionPerformed(evt);
            }
        });

        jLabel1.setText("Datos del cliente");

        jLabel2.setText("Nombre completo");

        comBoxID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Juridica" }));
        comBoxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Identificación");

        jLabel4.setText("Teléfono");

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Dirección");

        btnAgregar.setText("Agregar Cliente");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Telefono", "Provincia", "Canton"
            }
        ));
        jScrollPane1.setViewportView(tableClientes);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Menú Clientes");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Tabla de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(comBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre1)
                                    .addComponent(txt_ID)
                                    .addComponent(txtNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comBoxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comBoxCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(btnAgregar)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(233, 233, 233))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comBoxCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comBoxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comBoxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxIDActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (txtNombre1.getText().isEmpty() || txtNumTel.getText().isEmpty() || txt_ID.getText().isEmpty()
                    || comBoxCanton.getSelectedItem() == null) 
            {
                throw new EmptySpaceExcep();
            }
            
            int _numero = Integer.parseInt(txtNumTel.getText());
            Ubicacion u = new Ubicacion((String) comBoxProvincia.getSelectedItem(),(String)comBoxCanton.getSelectedItem());

            Identificacion _id = new Identificacion(comBoxID.getSelectedIndex(),txt_ID.getText());

            Cliente c = new Cliente(txtNombre1.getText(), _id, _numero,u);
            
            if (c.invalidCharacter()) {
                throw new CharacterExcep();
            }

            this.controller.addCliente(c);
        }
        catch(EmptySpaceExcep e){   
            e.infoError("Error", e,this);
        }
        catch(CharacterExcep e){
            e.infoError("Error", e,this);
        }
        catch (Exception e) {   
            DataException panic = new DataException();
            panic.infoError("Error", panic,this);
 
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void comBoxProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxProvinciaActionPerformed
           
    }//GEN-LAST:event_comBoxProvinciaActionPerformed

    private void comBoxCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxCantonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxCantonActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> comBoxCanton;
    private javax.swing.JComboBox<String> comBoxID;
    private javax.swing.JComboBox<String> comBoxProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNumTel;
    private javax.swing.JTextField txt_ID;
    // End of variables declaration//GEN-END:variables
}
