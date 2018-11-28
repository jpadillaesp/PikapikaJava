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
public class Bodega implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id_bodega;
    private String descripcion;
    private int activo;
    private List<OrdenDetalle> ordenDetalleList;
    private List<ProductoBodega> productoBodegaList;
    private Ciudad id_ciudad;

    public Bodega() {
    }

    public Bodega(Integer idBodega) {
        this.id_bodega = idBodega;
    }

    public Bodega(Integer idBodega, int activo) {
        this.id_bodega = idBodega;
        this.activo = activo;
    }

    public Integer getIdBodega() {
        return id_bodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.id_bodega = idBodega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
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

    public Ciudad getIdCiudad() {
        return id_ciudad;
    }

    public void setIdCiudad(Ciudad idCiudad) {
        this.id_ciudad = idCiudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_bodega != null ? id_bodega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bodega)) {
            return false;
        }
        Bodega other = (Bodega) object;
        if ((this.id_bodega == null && other.id_bodega != null) || (this.id_bodega != null && !this.id_bodega.equals(other.id_bodega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpadilla.entity.Bodega[ idBodega=" + id_bodega + " ]";
    }
    
}
