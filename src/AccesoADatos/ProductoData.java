
package AccesoADatos;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Proveedor;


public class ProductoData {
    
    
public static void agregarProducto(Producto producto) {
    Connection connection = Conexion.getConexion();
    
    try {
        String sql = "INSERT INTO producto (nombreProducto, descripcion, precioActual, Stock, estado)"
                + " VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, producto.getNombreProducto());
        ps.setString(2, producto.getDescripcion());
        ps.setDouble(3, producto.getPrecioActual());
        ps.setInt(4, producto.getStock());
        ps.setBoolean(5, producto.isEstado());

        int exito = ps.executeUpdate();
        
       if (exito > 0) {
            JOptionPane.showMessageDialog(null, "Producto Agregado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar el producto", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }
} 
    
    
    
    public static List<Producto> obtenerProductosXDebajoStockMinimo(int stockMinimo) {
        Connection connection = Conexion.getConexion();
        List<Producto> productos = new ArrayList<>();

        if (connection == null) {
            
            return productos;
        }

        try {
            String sql = "SELECT * FROM producto WHERE Stock <=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, stockMinimo);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int idProducto = rs.getInt("idProducto");
                String nombreProducto = rs.getString("nombreProducto");
                String descripcion = rs.getString("descripcion");
                double precioActual = rs.getDouble("precioActual");
                int stock = rs.getInt("Stock");
                boolean estado = rs.getBoolean("estado");

                Producto producto = new Producto(idProducto, nombreProducto, descripcion, precioActual, stock, estado);
                productos.add(producto);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage());
        } 

        return productos;
    }
    
    public static List<Producto> listarProductos() {
        Connection connection = Conexion.getConexion();
        List<Producto> productos = new ArrayList<>();

        if (connection == null) {
            return productos;
        }

        try {
            String sql = "SELECT * FROM producto";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idProducto = rs.getInt("idProducto");
                String nombreProducto = rs.getString("nombreProducto");
                String descripcion = rs.getString("descripcion");
                double precioActual = rs.getDouble("precioActual");
                int stock = rs.getInt("Stock");
                boolean estado = rs.getBoolean("estado");

                Producto producto = new Producto(idProducto, nombreProducto, descripcion, precioActual, stock, estado);
                productos.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage());
        }

        return productos;
    }
    
    public static Producto buscarProductoPorId(int idProducto) {
        Connection connection = Conexion.getConexion();
        Producto producto = null;

        if (connection == null) {
            return null;
        }

        try {
            String sql = "SELECT * FROM producto WHERE idProducto = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idProducto);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nombreProducto = rs.getString("nombreProducto");
                String descripcion = rs.getString("descripcion");
                double precioActual = rs.getDouble("precioActual");
                int stock = rs.getInt("Stock");
                boolean estado = rs.getBoolean("estado");

                producto = new Producto(idProducto, nombreProducto, descripcion, precioActual, stock, estado);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar producto por ID. " + ex.getMessage());
        }

        return producto;
    }
    
    public static List<Producto> buscarProductoPorNombre(String nombreProducto) {
    Connection connection = Conexion.getConexion();
    List<Producto> productos = new ArrayList<>();

    if (connection == null) {
        return productos;
    }

    try {
       
        String[] palabras = nombreProducto.split(" "); 
        String primerPalabra = palabras[0]; 

        String sql = "SELECT * FROM producto WHERE nombreProducto LIKE ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, primerPalabra + "%"); 

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int idProducto = rs.getInt("idProducto");
            String descripcion = rs.getString("descripcion");
            double precioActual = rs.getDouble("precioActual");
            int stock = rs.getInt("Stock");
            boolean estado = rs.getBoolean("estado");
            String nombrePro = rs.getString("nombreProducto");

            Producto producto = new Producto(idProducto, nombrePro, descripcion, precioActual, stock, estado);
            productos.add(producto);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar productos por nombre. " + ex.getMessage());
    }

    return productos;
            }

    
    public static void eliminarProducto(int idProducto) {
    Connection connection = Conexion.getConexion();

    try {
        String sql = "UPDATE producto SET estado = false WHERE idProducto = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, idProducto);

        int exito = ps.executeUpdate();

        if (exito > 0) {
            JOptionPane.showMessageDialog(null, "Producto Eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el producto con ID " + idProducto, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}

    
    public static Producto buscarProductoInactivoPorId(int idProducto) {
    Connection connection = Conexion.getConexion();
    Producto producto = null;

    try {
        String sql = "SELECT * FROM producto WHERE idProducto = ? AND estado = 0";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, idProducto);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int id = rs.getInt("idProducto");
            String nombreProducto = rs.getString("nombreProducto");
            String descripcion = rs.getString("descripcion");
            double precioActual = rs.getDouble("precioActual");
            int stock = rs.getInt("Stock");
            boolean estado = rs.getBoolean("estado");

            producto = new Producto(id, nombreProducto, descripcion, precioActual, stock, estado);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    return producto;
}
    
    public static void actualizarProducto(Producto producto) {
    Connection connection = Conexion.getConexion();

    try {
        if (producto.getIdProducto() > 0) {
            String sql = "UPDATE producto SET nombreProducto = ?, descripcion = ?, precioActual = ?, Stock = ?, estado = ? WHERE idProducto = ?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());

            int exito = ps.executeUpdate();

            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Producto Actualizado.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el producto con ID " + producto.getIdProducto(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ID de producto inválido.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
}
