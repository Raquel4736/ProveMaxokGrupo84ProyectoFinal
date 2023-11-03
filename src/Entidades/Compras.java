/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;




public class Compras {

private int idCompras;
private Producto producto;
private Proveedor proveedor;
private Date fecha;
private boolean estadoCompra;

    public Compras(int idCompras, Date fecha) {
        this.idCompras = idCompras;
        this.fecha = fecha;
    }

    public Compras(int idCompras) {
        this.idCompras = idCompras;
    }

    public Compras() {
    }
    

    public Compras(int idCompras, Date fecha, Producto producto, Proveedor proveedor) {
        this.idCompras = idCompras;
        this.fecha = fecha;
        this.producto = producto;
        this.proveedor = proveedor;
    }

    

    public Compras(Producto producto, Proveedor proveedor, Date fecha, boolean estadoCompra) {
        this.producto = producto;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.estadoCompra = estadoCompra;
    }

    public Compras(int idCompras, Producto producto, Proveedor proveedor, Date fecha, boolean estadoCompra) {
        this.idCompras = idCompras;
        this.producto = producto;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.estadoCompra = estadoCompra;
    }

    public int getIdCompras() {
        return idCompras;
    }

    public void setIdCompras(int idCompras) {
        this.idCompras = idCompras;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(boolean estadoCompra) {
        this.estadoCompra = estadoCompra;
    }

    @Override
    public String toString() {
        return "Compras{" + "idCompras=" + idCompras + ", producto=" + producto + ", proveedor=" + proveedor + ", fecha=" + fecha + ", estadoCompra=" + estadoCompra + '}';
    }



}
        
    

    

 