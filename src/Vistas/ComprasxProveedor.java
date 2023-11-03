/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ComprasData;
import AccesoADatos.ProductoData;
import Entidades.Producto;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import Entidades.Proveedor;
import AccesoADatos.ProveedorData;
import javax.swing.JOptionPane;
import Entidades.Compras;
/**
 *
 * @author jose_
 */
public class ComprasxProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ComprasxProveedor
     */
    public ComprasxProveedor() {
        initComponents();
        cargarCombo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFIdCompra = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jTFechaCompra = new javax.swing.JTextField();
        jCBNombreProv = new javax.swing.JComboBox<>();
        jBNueno = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabel1.setText("Compras Por Proveedor");

        jLabel2.setText("Nombre Del Proveedor");

        jLabel3.setText("Fecha de su ultima Compra");

        jLabel4.setText("ID Compra");

        jBSalir.setText("Salir");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });

        jCBNombreProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jCBNombreProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBNombreProvActionPerformed(evt);
            }
        });

        jBNueno.setText("nuevo");
        jBNueno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBNuenoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jBSalir)
                                        .addGap(17, 17, 17))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jCBNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jBNueno)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(108, 108, 108)
                                .addComponent(jTFIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 187, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNueno))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jCBNombreProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBNombreProvActionPerformed

            
            int selectedIndex = jCBNombreProv.getSelectedIndex();

    if (selectedIndex != -1) {
        
        String selectedItem = jCBNombreProv.getSelectedItem().toString();
       
        int idProveedor = Integer.parseInt(selectedItem.split(" - ")[0]);
        
     
        ComprasData comprasData = new ComprasData();
        Compras ultimaCompra = comprasData.obtenerUltimaCompraPorProveedor(idProveedor);
        
        if (ultimaCompra != null) {
          
            jTFIdCompra.setText(String.valueOf(ultimaCompra.getIdCompras()));
            jTFechaCompra.setText(ultimaCompra.getFecha().toString()); 
        } else {
            JOptionPane.showMessageDialog(null, "El proveedor no tiene compras realizadas");
           
        }
    }
        
        
        
        
        
        
       
    }//GEN-LAST:event_jCBNombreProvActionPerformed

    private void jBNuenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNuenoMouseClicked
        cargarCombo();
        jTFIdCompra.setText("");
        jTFechaCompra.setText("");
    }//GEN-LAST:event_jBNuenoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBNueno;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBNombreProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTFIdCompra;
    private javax.swing.JTextField jTFechaCompra;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        
          ProveedorData proveedorData = new ProveedorData();
    List<Proveedor> proveedor = proveedorData.ListarProveedor();

    DefaultComboBoxModel<String> comboBox = new DefaultComboBoxModel<>();
comboBox.addElement(" ");
    for (Proveedor proveedor1 : proveedor) {
        String item = proveedor1.getIdProveedor() + " - " + proveedor1.getRazonSocial();
        comboBox.addElement(item);
    }

    jCBNombreProv.setModel(comboBox);

    }

    }

    

