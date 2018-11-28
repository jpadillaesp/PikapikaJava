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
public class ProductoBodega implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id_producto_bodega;
    
    private Integer stock;
    
    private Integer activo;
    
    private Bodega id_bodega;
    
    private Producto id_producto;

    public ProductoBodega() {
    }

    public ProductoBodega(Integer idProductoBodega) {
        this.id_producto_bodega = idProductoBodega;
    }

    public Integer getIdProductoBodega() {
        return id_producto_bodega;
    }

    public void setIdProductoBodega(Integer idProductoBodega) {
        this.id_producto_bodega = idProductoBodega;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Bodega getIdBodega() {
        return id_bodega;
    }

    public void setIdBodega(Bodega idBodega) {
        this.id_bodega = idBodega;
    }

    public Producto getIdProducto() {
        return id_producto;
    }

    public void setIdProducto(Producto idProducto) {
        this.id_producto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_producto_bodega != null ? id_producto_bodega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoBodega)) {
            return false;
        }
        ProductoBodega other = (ProductoBodega) object;
        if ((this.id_producto_bodega == null && other.id_producto_bodega != null) || (this.id_producto_bodega != null && !this.id_producto_bodega.equals(other.id_producto_bodega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpadilla.entity.ProductoBodega[ idProductoBodega=" + id_producto_bodega + " ]";
    }
    
}
