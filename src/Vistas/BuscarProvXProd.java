/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;
import Entidades.Compras;
import Entidades.Producto;
import Entidades.Proveedor;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quiqu
 */
public class BuscarProvXProd extends javax.swing.JInternalFrame {
     
    private int filaSeleccionada = -1;
    
     private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return false;
        }
     };
             
             
     
    public BuscarProvXProd() {
        initComponents();
        cargarCombo();
        armarCabecera();
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jCBProducto = new javax.swing.JComboBox<>();
        jBLimpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Buscar proveedor x producto");

        jLabel2.setText("Selecione el producto:");

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

        jBSalir.setText("Salir");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });

        jCBProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBProductoMouseClicked(evt);
            }
        });
        jCBProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProductoActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jBLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBLimpiar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jCBProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProductoActionPerformed
  
        
      
                                                  
        int idProducto=-1;
        int selectedIndex = jCBProducto.getSelectedIndex();

        if (selectedIndex != -1) {
            
            String selectedItem = jCBProducto.getSelectedItem().toString();
            String[] parts = selectedItem.split(" - ");

            if (parts.length == 2) {
               
                idProducto = Integer.parseInt(parts[0]);
                
            }
            System.out.println("idProducto:"+idProducto);
           
        }
        
         ProveedorData pd = new ProveedorData();
          Proveedor prov =  pd.obtenerProveedorPorIdProducto(idProducto);
          if (prov != null) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); 
        modelo.addRow(new Object[]{
            prov.getIdProveedor(),
            prov.getRazonSocial(),
            prov.getDomicilio(),
            prov.getTelefono()
        });
       
        jTable1.setModel(modelo);
    } else {
        JOptionPane.showMessageDialog(null, "Proveedor no encontrado para el producto seleccionado.");
    }
    
    

    }//GEN-LAST:event_jCBProductoActionPerformed

    private void jCBProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBProductoMouseClicked
        
    }//GEN-LAST:event_jCBProductoMouseClicked

    private void jBLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

private void cargarCombo(){ 

        
         ProductoData productoData = new ProductoData();
    List<Producto> productos = productoData.listarProductos();

    DefaultComboBoxModel<String> comboBox = new DefaultComboBoxModel<>();

    for (Producto producto : productos) {
        String item = producto.getIdProducto() + " - " + producto.getNombreProducto();
        comboBox.addElement(item);
    }

    jCBProducto.setModel(comboBox);

    }
   
    private void limpiarCampos() {
         jCBProducto.setSelectedItem("");
         modelo.setRowCount(0);
    }
       

    private void armarCabecera() {
              modelo.addColumn("id Proveedor");
       modelo.addColumn("razon social");
        modelo.addColumn("direccion");
        modelo.addColumn("contacto");
        jTable1.setModel(modelo); 
    }
    
    
       
     




    }



