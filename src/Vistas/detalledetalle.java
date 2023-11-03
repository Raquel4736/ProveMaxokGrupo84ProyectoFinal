
package Vistas;

import AccesoADatos.DetalleCompraData;
import AccesoADatos.ProductoData;
import Entidades.Producto;
import Entidades.Proveedor;
import Entidades.detalleCompra;
import java.sql.Date;
import java.util.List;
import Entidades.Compras;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import java.lang.String;
import javax.swing.JOptionPane;
import AccesoADatos.ProveedorData;
import AccesoADatos.ComprasData;
public class detalledetalle extends javax.swing.JInternalFrame {

   
    public detalledetalle() {
        initComponents();
        cargarCombo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCcargarProducto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jTIDCompra = new javax.swing.JTextField();
        jTIDProducto = new javax.swing.JTextField();
        jTCantidad = new javax.swing.JTextField();
        jTPrecioCosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTNprovee = new javax.swing.JTextField();

        jLabel1.setText("Detalle de Compra");

        jLabel2.setText("Nombre del producto a detallar");

        jCcargarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcargarProductoActionPerformed(evt);
            }
        });

        jLabel3.setText("ID de la compra");

        jLabel4.setText("ID del producto");

        jLabel5.setText("Cantidad");

        jLabel6.setText("Precio de costo");

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

        jTIDCompra.setEditable(false);

        jTIDProducto.setEditable(false);

        jTCantidad.setEditable(false);

        jTPrecioCosto.setEditable(false);

        jLabel7.setText("Nombre proveedor");

        jTNprovee.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jCcargarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTIDProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(jTCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTPrecioCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTIDCompra)
                                    .addComponent(jTNprovee))))))
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jBLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jCcargarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(jLabel3))
                            .addComponent(jTIDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTNprovee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBLimpiar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jBLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseClicked
        limpiarCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_jBLimpiarMouseClicked

    private void jCcargarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcargarProductoActionPerformed

        String productoSelec = (String) jCcargarProducto.getSelectedItem();
        DetalleCompraData dcd = new DetalleCompraData();
        ProveedorData pd = new ProveedorData();
        ComprasData cd = new ComprasData();
        String[] parts = productoSelec.split(" - ");
        if (parts.length == 2) {
            String idProducto = parts[0];

            int idCompra = cd.obtenerIdCompraPorIdProducto(Integer.parseInt(idProducto));

            if (idCompra != -1) {
               
                jTIDCompra.setText(String.valueOf(idCompra));

                detalleCompra detalleInfo = dcd.obtenerCantidadYPrecioCostoPorIdProducto(Integer.parseInt(idProducto));

                if (detalleInfo!=null) {

                    jTIDProducto.setText(idProducto);
                    jTCantidad.setText(String.valueOf(detalleInfo.getCantidad()));
                    jTPrecioCosto.setText(String.valueOf(detalleInfo.getPrecioCosto()));

                    String razonSocial = pd.obtenerRazonSocialPorIdProducto(Integer.parseInt(idProducto));
                    jTNprovee.setText(razonSocial);


                } else {
                    JOptionPane.showMessageDialog(null, "No existe la compra de este producto");
                }
            }else {
                    JOptionPane.showMessageDialog(null, "No existe la compra de este producto");
            }
            }
    }//GEN-LAST:event_jCcargarProductoActionPerformed
             
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCcargarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTCantidad;
    private javax.swing.JTextField jTIDCompra;
    private javax.swing.JTextField jTIDProducto;
    private javax.swing.JTextField jTNprovee;
    private javax.swing.JTextField jTPrecioCosto;
    // End of variables declaration//GEN-END:variables

    
      private void limpiarCampos() {
        jTIDCompra.setText("");
        jTIDProducto.setText("");
        jTCantidad.setText("");
        jTPrecioCosto.setText("");
        jTNprovee.setText("");
        cargarCombo();
    }
 
    
      private void cargarCombo() {
        
         ProductoData productoData = new ProductoData();
    List<Producto> productos = productoData.listarProductos();

    DefaultComboBoxModel<String> comboBox = new DefaultComboBoxModel<>();
comboBox.addElement(" ");
    for (Producto producto : productos) {
        String item = producto.getIdProducto() + " - " + producto.getNombreProducto();
        comboBox.addElement(item);
    }

    jCcargarProducto.setModel(comboBox);

    }

    
    }


        


    
    




              


        
            


    






                   
 


   
   
        

