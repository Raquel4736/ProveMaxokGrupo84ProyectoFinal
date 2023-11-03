/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


public class detalleCompra {

private int idDetalle;
private int cantidad;
private double precioCosto;
private Compras compras;
private Producto producto;
private Proveedor proveedor;

public detalleCompra(int cantidad, double precioCosto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
    }

    public detalleCompra(int cantidad, double precioCosto, Compras compras, Producto producto, Proveedor proveedor) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compras = compras;
        this.producto = producto;
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }



    public detalleCompra() {
    }

    public detalleCompra(int idDetalle, int cantidad, double precioCosto, Compras compras, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compras = compras;
        this.producto = producto;
    }

    public detalleCompra(int cantidad, double precioCosto, Compras compras, Producto producto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compras = compras;
        this.producto = producto;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Compras getCompras() {
        return compras;
    }

    public void setCompras(Compras compras) {
        this.compras = compras;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "detalleCompra{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto + ", compras=" + compras + ", producto=" + producto + '}';
    }







    
}
