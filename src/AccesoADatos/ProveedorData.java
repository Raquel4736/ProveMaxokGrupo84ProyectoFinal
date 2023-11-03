/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Proveedor;
import javax.swing.JTable;


public class ProveedorData {
    

//    public static JTable listarProveedorActivo() {
//      
//        
//        
//        
//        
//    }
//
//    
//    
//    
//    
//    public static JTable listarProveedorInactivo() {
//        
//                
//    }
//    
    
    
    private Connection con=null;
    
     public ProveedorData(){
    
        con=Conexion.getConexion();
    }
     
     
     public void guardarProveedor(Proveedor proveedor){
    
        String sql = "INSERT INTO Proveedor(idProveedor, razonSocial, domicilio, telefono, estado) "
                + "VALUES (?,?,?,?,?)";
                
               
        try
        {
            
            PreparedStatement ps =con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, proveedor.getIdProveedor());
            ps.setString(2, proveedor.getRazonSocial());
            ps.setString(3, proveedor.getDomicilio());
            ps.setString(4, proveedor.getTelefono());
            ps.setBoolean(5,proveedor.isEstado());
            ps.executeUpdate();
            
            ///VAS POR ACA <-----------------------------
            
            
            
            ResultSet rs =ps.getGeneratedKeys();
            if(rs.next()){
            proveedor.setIdProveedor(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Proveedor agregado");
            }
            
        } catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, "Error ala acceder a la tabla Proveedores"+ex.getMessage());
        }
    
    }
    
    public Proveedor buscarProveedor(String razonSocial){
        
        Proveedor proveedor = null;
        String sql="SELECT razonSocial, domicilio, telefono, estado FROM Proveedor WHERE razonSocial = ? ";
         PreparedStatement ps = null;
    
        try
        {
           ps=con.prepareStatement(sql);
            ps.setString(1, razonSocial);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
            
                proveedor=new Proveedor();
                //proveedor.setIdProveedor(id);
                proveedor.setRazonSocial(rs.getString("razonSocial"));   
                proveedor.setDomicilio(rs.getString("Domicilio"));
                proveedor.setTelefono(rs.getString("Telefono"));
                proveedor.setEstado(rs.getBoolean("estado"));

            }else{
            JOptionPane.showMessageDialog(null, "No existe el Proveedor");
            }
         
               ps.close();
                  
            
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor"+ex.getMessage());
        }
        return proveedor;
    
    
    }
    
    
    public void modificarProveedor(Proveedor proveedor){
    
    String sql="Update proveedor SET domicilio = ?, telefono =?, estado = ? WHERE razonSocial = ?";
            
           
        try
        {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, proveedor.getDomicilio());
            ps.setString(2,proveedor.getTelefono());
            ps.setBoolean(3, proveedor.isEstado());
            ps.setString(4, proveedor.getRazonSocial());
            System.out.println("");
            int exito=ps.executeUpdate();
            
            if(exito==1){
            JOptionPane.showMessageDialog(null, "Proveedor modificado");
            }else{
            JOptionPane.showMessageDialog(null, "El proveedor no existe");
            }
            
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al accerder a la tabla Proveedor");
        }
    
    }
    
    
    public void eliminarProveedor(String razonSocial ){
    
        String sql = "Update Proveedor Set estado=0 Where razonSocial=?";
        try
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, razonSocial );
            int exito = ps.executeUpdate();
            
            
            
 
            if (exito == 1)
            {
                JOptionPane.showMessageDialog(null, "Se elimino el Proveedor");
            } else{
                JOptionPane.showMessageDialog(null, "El Proveedor no existe");
            }
            ps.close();
            
        } catch (SQLException ex)
        {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor"+ex.getMessage());
           
        }
    
    
    }
    
    
    public List<Proveedor> ListarProveedor(){
    
    List<Proveedor>proveedor=new ArrayList();
    
        
        try
        {
            String sql = "Select * From Proveedor Where estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while( rs.next() )
            {

               Proveedor proveedor1 = new Proveedor();
               proveedor1.setIdProveedor(rs.getInt("idProveedor"));               
               proveedor1.setRazonSocial(rs.getString("razonSocial"));
               proveedor1.setDomicilio(rs.getString("Domicilio"));
               proveedor1.setTelefono(rs.getString("Telefono"));
               proveedor1.setEstado(rs.getBoolean("estado"));
               proveedor.add(proveedor1);
               
               
            }
           // ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor" + ex.getMessage());
        }
        return proveedor;

    }
     
     
     
     

    
public String obtenerRazonSocialPorIdProducto(int idProducto) {
        String razonSocial = null;
        try {
            String sql = "SELECT p.razonSocial " +
                         "FROM proveedor p " +
                         "JOIN compras c ON p.idProveedor = c.idProveedor " +
                         "JOIN datellecompra dc ON c.idCompras = dc.idCompras " +
                         "WHERE dc.idProducto = ?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idProducto);
            ResultSet resultSet = st.executeQuery();

            if (resultSet.next()) {
                razonSocial = resultSet.getString("razonSocial");
            }

            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return razonSocial;
    }


    
    
    public Proveedor obtenerProveedorPorIdProducto(int idProducto) {
    Proveedor proveedor = null;

    try {
        String sql = "SELECT P.* " +
                     "FROM proveedor P " +
                     "JOIN compras C ON P.idProveedor = C.idProveedor " +
                     "JOIN datelleCompra DC ON DC.idCompras = C.idCompras " +
                     "JOIN producto PR ON PR.idProducto = DC.idProducto " +
                     "WHERE DC.idProducto = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idProducto);
        ResultSet rs = ps.executeQuery();
    
    
    if (rs.next()) {
            proveedor = new Proveedor();
            proveedor.setIdProveedor(rs.getInt("idProveedor"));
            proveedor.setRazonSocial(rs.getString("razonSocial"));
            proveedor.setDomicilio(rs.getString("domicilio"));
            proveedor.setTelefono(rs.getString("telefono"));
            proveedor.setEstado(rs.getBoolean("estado"));
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor: " + ex.getMessage());
    }

    return proveedor;
    
    
    
    
   
    
    }
     public List<Proveedor> ListarProveedorinactivo(){
    
    List<Proveedor>proveedor=new ArrayList();
    
        
        try
        {
            String sql = "Select * From Proveedor Where estado=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while( rs.next() )
            {

               Proveedor proveedor1 = new Proveedor();
               proveedor1.setIdProveedor(rs.getInt("idProveedor"));               
               proveedor1.setRazonSocial(rs.getString("razonSocial"));
               proveedor1.setDomicilio(rs.getString("Domicilio"));
               proveedor1.setTelefono(rs.getString("Telefono"));
               proveedor1.setEstado(rs.getBoolean("estado"));
               proveedor.add(proveedor1);
               
               
            }
           // ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor" + ex.getMessage());
        }
        return proveedor;

    }
}

