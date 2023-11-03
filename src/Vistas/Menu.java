
package Vistas;

import static java.lang.System.exit;

/**
 *
 * @author PcRa
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        JDMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4item3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMBuscarProvXProd = new javax.swing.JMenuItem();
        jMProvActInac = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMIGestionCompras = new javax.swing.JMenuItem();
        jMICompraxFecha = new javax.swing.JMenuItem();
        jMICompraxprov = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JDMenu.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout JDMenuLayout = new javax.swing.GroupLayout(JDMenu);
        JDMenu.setLayout(JDMenuLayout);
        JDMenuLayout.setHorizontalGroup(
            JDMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );
        JDMenuLayout.setVerticalGroup(
            JDMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        jMenu4item3.setText(" Proveedor ");
        jMenu4item3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu4item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4item3ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Gestion de proveedores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4item3.add(jMenuItem2);

        jMBuscarProvXProd.setText("Buscar proveedor x producto");
        jMBuscarProvXProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBuscarProvXProdActionPerformed(evt);
            }
        });
        jMenu4item3.add(jMBuscarProvXProd);

        jMProvActInac.setText("Proveedores activos/inactivos");
        jMProvActInac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMProvActInacActionPerformed(evt);
            }
        });
        jMenu4item3.add(jMProvActInac);

        jMenuBar1.add(jMenu4item3);

        jMenu3.setText(" Compra ");
        jMenu3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMIGestionCompras.setText("Gestion de Compras");
        jMIGestionCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGestionComprasActionPerformed(evt);
            }
        });
        jMenu3.add(jMIGestionCompras);

        jMICompraxFecha.setText("Seleccionar Compra por fecha");
        jMICompraxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICompraxFechaActionPerformed(evt);
            }
        });
        jMenu3.add(jMICompraxFecha);

        jMICompraxprov.setText("Seleccionar Compra por proveedor");
        jMICompraxprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICompraxprovActionPerformed(evt);
            }
        });
        jMenu3.add(jMICompraxprov);

        jMenuBar1.add(jMenu3);

        jMenu2.setText(" Detalle de Compra ");
        jMenu2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu1.setBackground(new java.awt.Color(153, 255, 153));
        jMenu1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu1.setText(" Producto ");
        jMenu1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItem1.setText("Formulario de Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu5.setText(" Salir ");
        jMenu5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        JDMenu.removeAll();
        JDMenu.repaint();
        GestionProducto gestionM = new GestionProducto();
        gestionM.setVisible(true);
        JDMenu.add(gestionM);
        JDMenu.moveToFront(gestionM);


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMICompraxprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICompraxprovActionPerformed
        JDMenu.removeAll();
        JDMenu.repaint();
        ComprasxProveedor cpp = new ComprasxProveedor();
        cpp.setVisible(true);
        JDMenu.add(cpp);
        JDMenu.moveToFront(cpp);
    }//GEN-LAST:event_jMICompraxprovActionPerformed

    private void jMICompraxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICompraxFechaActionPerformed
        JDMenu.removeAll();
        JDMenu.repaint();
        ComprasXFecha cpf = new ComprasXFecha();
        cpf.setVisible(true);
        JDMenu.add(cpf);
        JDMenu.moveToFront(cpf);
    }//GEN-LAST:event_jMICompraxFechaActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

        JDMenu.removeAll();
        JDMenu.repaint();
        detalledetalle ddc = new detalledetalle();
        ddc.setVisible(true);
        JDMenu.add(ddc);
        JDMenu.moveToFront(ddc);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked

         System.exit(0);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     
        JDMenu.removeAll();
        JDMenu.repaint();
        GestionDeProveedor gdp = new GestionDeProveedor();
        gdp.setVisible(true);
        JDMenu.add(gdp);
        JDMenu.moveToFront(gdp);        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMBuscarProvXProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBuscarProvXProdActionPerformed
        JDMenu.removeAll();
        JDMenu.repaint();
        BuscarProvXProd bppp = new BuscarProvXProd();
        bppp.setVisible(true);
        JDMenu.add(bppp);
        JDMenu.moveToFront(bppp);
          
    }//GEN-LAST:event_jMBuscarProvXProdActionPerformed

    private void jMenu4item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4item3ActionPerformed
        
    }//GEN-LAST:event_jMenu4item3ActionPerformed

    private void jMProvActInacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMProvActInacActionPerformed
        JDMenu.removeAll();
        JDMenu.repaint();
        ProveedoresActInac pai = new ProveedoresActInac();
        pai.setVisible(true);
        JDMenu.add(pai);
        JDMenu.moveToFront(pai); 
    }//GEN-LAST:event_jMProvActInacActionPerformed

    private void jMIGestionComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGestionComprasActionPerformed
      JDMenu.removeAll();
        JDMenu.repaint();
     GestionCompras gc = new GestionCompras();
       gc.setVisible(true);
        JDMenu.add(gc);
        JDMenu.moveToFront(gc);    
    }//GEN-LAST:event_jMIGestionComprasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    
      
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDMenu;
    private javax.swing.JMenuItem jMBuscarProvXProd;
    private javax.swing.JMenuItem jMICompraxFecha;
    private javax.swing.JMenuItem jMICompraxprov;
    private javax.swing.JMenuItem jMIGestionCompras;
    private javax.swing.JMenuItem jMProvActInac;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4item3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
