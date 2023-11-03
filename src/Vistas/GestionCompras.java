/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ComprasData;
import AccesoADatos.DetalleCompraData;
import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;
import Entidades.Compras;
import Entidades.Producto;
import Entidades.Proveedor;
import Entidades.detalleCompra;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class GestionCompras extends javax.swing.JInternalFrame {
    String nombreProducto="";
    Date fecha=null;
    int cantidad=0;
    Double precioCosto=0.0;
    int idproveedor=0;
    int idproducto=0;
    int idCompras=0;

    /**
     * Creates new form GestionCompras
     */
    public GestionCompras() {
        initComponents();
        cargarCombo();
        cargarCombo2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCBProductos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCBProveedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jDCFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jTFCantidad = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTFPrecioCosto = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabel1.setText("Gestion de Compras");

        jCBProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProductosActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione un producto");

        jLabel3.setText("Seleccione un proveedor");

        jCBProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProveedorActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha");

        jLabel5.setText("Cantidad");

        jBGuardar.setText("Guardar");
        jBGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBGuardarMouseClicked(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBNuevoMouseClicked(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });

        jLabel6.setText("Precio de costo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCBProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDCFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addComponent(jTFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSalir)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jCBProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jBGuardar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jDCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTFPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jBNuevo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jCBProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProveedorActionPerformed
        ComprasData cd =new ComprasData();
                
        
        int selectedIndex = jCBProveedor.getSelectedIndex();

    if (selectedIndex != -1) {
        
        String selectedItem = jCBProveedor.getSelectedItem().toString();
       
        idproveedor = Integer.parseInt(selectedItem.split(" - ")[0]);
        System.out.println(idproveedor);
        
         fecha=jDCFecha.getDate();
//         cantidad= Integer.parseInt(jTFCantidad.getText());
        
       
    }//GEN-LAST:event_jCBProveedorActionPerformed
    }
    private void jCBProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProductosActionPerformed
        int selectedIndex = jCBProductos.getSelectedIndex();

    if (selectedIndex != -1) {
     String selectedItem = jCBProductos.getSelectedItem().toString(); 
        nombreProducto =selectedItem.split(" - ")[1];
        idproducto=Integer.parseInt(selectedItem.split(" - ")[0]);
        System.out.println(nombreProducto);
    }//GEN-LAST:event_jCBProductosActionPerformed
    }
    private void jBGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseClicked
      fecha=jDCFecha.getDate();
        java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
        
        cantidad=Integer.parseInt(jTFCantidad.getText());
        
        precioCosto=Double.parseDouble(jTFPrecioCosto.getText());
        ComprasData cd= new ComprasData();
        Compras compras=new Compras();
        Proveedor proveedor=new Proveedor(idproveedor);
        compras.setProveedor(proveedor);
      proveedor.setIdProveedor(idproveedor);
            compras.setFecha(fechaSQL);
            compras.setEstadoCompra(true);
        try {
            cd.GuardarCompra(compras);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        }
        
      idCompras=cd.RecuperarUltimoIdCompra(idproveedor);
        System.out.println(idCompras);
        detalleCompra dc=new detalleCompra(cantidad, precioCosto);
        DetalleCompraData dcd = new DetalleCompraData();
        dcd.GuardarDetalleCompra(cantidad, precioCosto, idCompras,idproducto);
        
      cd.ActualizarStock(idproducto);
        limpiarCampos();
      
        
        
    }//GEN-LAST:event_jBGuardarMouseClicked

    private void jBNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNuevoMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_jBNuevoMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBProductos;
    private javax.swing.JComboBox<String> jCBProveedor;
    private com.toedter.calendar.JDateChooser jDCFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTFCantidad;
    private javax.swing.JTextField jTFPrecioCosto;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
     ProductoData productoData = new ProductoData();
        List<Producto> productos = productoData.listarProductos();

        DefaultComboBoxModel<String> comboBox = new DefaultComboBoxModel<>();
        comboBox.addElement(" ");
        for (Producto producto : productos) {
            String item = producto.getIdProducto() + " - " + producto.getNombreProducto();
            comboBox.addElement(item);
        }

        jCBProductos.setModel(comboBox);

    }  

    private void cargarCombo2() {
      ProveedorData proveedorData = new ProveedorData();
        List<Proveedor> proveedor = proveedorData.ListarProveedor();

        DefaultComboBoxModel<String> comboBox = new DefaultComboBoxModel<>();
        comboBox.addElement(" ");
        for (Proveedor proveedor1 : proveedor) {
            String item = proveedor1.getIdProveedor() + " - " + proveedor1.getRazonSocial();
            comboBox.addElement(item);
        }

        jCBProveedor.setModel(comboBox);

    }  
    
      private void limpiarCampos() {
        
       
       cargarCombo();
       cargarCombo2();
        jDCFecha.setDate(null);
       jTFCantidad.setText("");
       jTFPrecioCosto.setText(" ");
    }   
    
}