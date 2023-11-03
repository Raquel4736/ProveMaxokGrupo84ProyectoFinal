/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import Entidades.Proveedor;
import AccesoADatos.ProveedorData;
import java.util.List;
import javax.swing.JOptionPane;

public class ProveedoresActInac extends javax.swing.JInternalFrame {
    
   private ButtonGroup grupoproveedores;
    
   private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return false;

        }
   };
   
    public ProveedoresActInac() {
        initComponents();
        armarCabecera();
        
         grupoproveedores = new ButtonGroup();

        // Agrupa los JRadioButton
        grupoproveedores.add(jRBactivos);
        grupoproveedores.add(jRBinactivos);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jRBactivos = new javax.swing.JRadioButton();
        jRBinactivos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Proveedores Activos/Inactivos");

        jRBactivos.setText("ACTIVOS");
        jRBactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBactivosActionPerformed(evt);
            }
        });

        jRBinactivos.setText("INACTIVOS");
        jRBinactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBinactivosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBSalir.setText("SALIR");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });

        jBLimpiar.setText("LIMPIAR");
        jBLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jRBactivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRBinactivos)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jBLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBactivos)
                    .addComponent(jRBinactivos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBLimpiar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBactivosActionPerformed
      

     
            
        if (jRBactivos.isSelected()) {
        ProveedorData proveedorData = new ProveedorData();
        
        try {
            List<Proveedor> activos = proveedorData.ListarProveedor();
            
            if (!activos.isEmpty()) {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setRowCount(0); 

                for (Proveedor activo : activos) {
                    modelo.addRow(new Object[]{
                        
                    activo.getIdProveedor(),
                        activo.getRazonSocial(),
                        activo.getDomicilio(),
                        activo.getTelefono()
                    });
                }
                jTable1.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron proveedores activos.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista de proveedores activos: " + ex.getMessage());
        }
    }
             
        
        
        
    }//GEN-LAST:event_jRBactivosActionPerformed

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jBLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseClicked
limpiarCampor();        // TODO add your handling code here:
    }//GEN-LAST:event_jBLimpiarMouseClicked

    private void jRBinactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBinactivosActionPerformed
     
    if (jRBinactivos.isSelected()) {
        ProveedorData proveedorData = new ProveedorData();
        
        try {
            List<Proveedor> inactivo= proveedorData.ListarProveedorinactivo();
            
            if (!inactivo.isEmpty()) {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setRowCount(0); 

                for (Proveedor inactivos : inactivo) {
                    modelo.addRow(new Object[]{
                        
                    inactivos.getIdProveedor(),
                        inactivos.getRazonSocial(),
                        inactivos.getDomicilio(),
                        inactivos.getTelefono()
                    });
                }
                jTable1.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron proveedores inactivos.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista de proveedores inactivos: " + ex.getMessage());
        }
    }
             
            
        
        
        
        
        
        
        
        
        
                                                                                        
    }//GEN-LAST:event_jRBinactivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBactivos;
    private javax.swing.JRadioButton jRBinactivos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
         modelo.addColumn("id Proveedor");
       modelo.addColumn("razon social");
        modelo.addColumn("direccion");
        modelo.addColumn("contacto");
        jTable1.setModel(modelo); 

    }

    private void limpiarCampor() {
        
         modelo.setRowCount(0);
    }

  
            }

        
    

