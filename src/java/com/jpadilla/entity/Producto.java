/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpadilla.entity;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jpadilla
 */
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id_producto;
    
    private String nombre;
    
    private Integer precio;
    
    private Integer activo;
    private List<OrdenDetalle> ordenDetalleList;
    private List<ProductoBodega> productoBodegaList;
    private List<ProductoLinea> productoLineaList;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.id_producto = idProducto;
    }

    public Integer getIdProducto() {
        return id_producto;
    }

    public void setIdProducto(Integer idProducto) {
        this.id_producto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    
    public List<OrdenDetalle> getOrdenDetalleList() {
        return ordenDetalleList;
    }

    public void setOrdenDetalleList(List<OrdenDetalle> ordenDetalleList) {
        this.ordenDetalleList = ordenDetalleList;
    }

    
    public List<ProductoBodega> getProductoBodegaList() {
        return productoBodegaList;
    }

    public void setProductoBodegaList(List<ProductoBodega> productoBodegaList) {
        this.productoBodegaList = productoBodegaList;
    }

    
    public List<ProductoLinea> getProductoLineaList() {
        return productoLineaList;
    }

    public void setProductoLineaList(List<ProductoLinea> productoLineaList) {
        this.productoLineaList = productoLineaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_producto != null ? id_producto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.id_producto == null && other.id_producto != null) || (this.id_producto != null && !this.id_producto.equals(other.id_producto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpadilla.entity.Producto[ idProducto=" + id_producto + " ]";
    }
    
}
