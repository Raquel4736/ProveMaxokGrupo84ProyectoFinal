/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Producto;
import Entidades.Proveedor;
import Entidades.detalleCompra;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Compras;
import java.util.logging.Level;
import java.util.logging.Logger;
 
 
 
public class DetalleCompraData {
    
    
    
    
      private Connection connection = null;
    private ProductoData ProdData;
    private ComprasData ComData;

    public DetalleCompraData() { 
       connection = Conexion.getConexion();
        ProdData = new ProductoData();
      
    }
   
    public detalleCompra obtenerCantidadYPrecioCostoPorIdProducto(int idProducto) {
        detalleCompra detalleC = null;

        try {
            String sql = "SELECT cantidad, precioCosto FROM datellecompra WHERE idProducto = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, idProducto);

            ResultSet resultSet = st.executeQuery();

            if (resultSet.next()) {
                int cantidad = resultSet.getInt("cantidad");
                double precioCosto = resultSet.getDouble("precioCosto");

                detalleC = new detalleCompra(cantidad, precioCosto);
            }

           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
          
        }

        return detalleC;
    }
    
    public void GuardarDetalleCompra(int cantidad,double precioCosto,int idCompras,int idProducto){
        System.out.println(cantidad +"  " + precioCosto +"  " +idCompras+"  " +idProducto);  
     
          try { 
              
              String sql= "INSERT INTO datellecompra( cantidad, precioCosto, idCompras, idProducto) VALUES (?,?,?,?)";      
             
               PreparedStatement ps = connection.prepareStatement(sql);

              ps.setInt(1, cantidad);
             ps.setDouble(2, precioCosto);
              ps.setInt(3, idCompras);
              ps.setInt(4, idProducto);
              
//              int exito= 0;
             
              
              int exito = ps.executeUpdate();
               
               System.out.println(exito);
               
              if (exito>0) {
                JOptionPane.showMessageDialog(null,"Detalle agregado" );
                  
              }else{
               JOptionPane.showMessageDialog(null,"Error al acceder a la tabla" );
              }
              
          } catch (SQLException ex) {
              Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, ex);
          }

    }
    }




 

