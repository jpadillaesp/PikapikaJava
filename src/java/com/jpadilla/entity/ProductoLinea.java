/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpadilla.entity;

import java.io.Serializable;

/**
 *
 * @author jpadilla
 */
public class ProductoLinea implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id_producto_linea;
    
    private Integer activo;
    
    private Linea linea;
    
    private Producto producto;

    public ProductoLinea() {
    }

    public ProductoLinea(Integer idProductoLinea) {
        this.id_producto_linea = idProductoLinea;
    }

    public Integer getIdProductoLinea() {
        return id_producto_linea;
    }

    public void setIdProductoLinea(Integer idProductoLinea) {
        this.id_producto_linea = idProductoLinea;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Linea getIdLinea() {
        return linea;
    }

    public void setIdLinea(Linea linea) {
        this.linea = linea;
    }

    public Producto getIdProducto() {
        return producto;
    }

    public void setIdProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_producto_linea != null ? id_producto_linea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoLinea)) {
            return false;
        }
        ProductoLinea other = (ProductoLinea) object;
        if ((this.id_producto_linea == null && other.id_producto_linea != null) || (this.id_producto_linea != null && !this.id_producto_linea.equals(other.id_producto_linea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpadilla.entity.ProductoLinea[ idProductoLinea=" + id_producto_linea + " ]";
    }
    
}
