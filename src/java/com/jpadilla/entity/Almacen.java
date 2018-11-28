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
 * @author * @author jpadilla
 */

public class Almacen implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id_almacen;
    private String descripcion;
    private int activo;
    private Ciudad id_ciudad;
    private List<Orden> ordenList;

    public Almacen() {
    }

    public Almacen(Integer idAlmacen) {
        this.id_almacen = idAlmacen;
    }

    public Almacen(Integer idAlmacen, String descripcion, int activo) {
        this.id_almacen = idAlmacen;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdAlmacen() {
        return id_almacen;
    }

    public void setIdAlmacen(Integer idAlmacen) {
        this.id_almacen = idAlmacen;
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

    public Ciudad getIdCiudad() {
        return id_ciudad;
    }

    public void setIdCiudad(Ciudad idCiudad) {
        this.id_ciudad = idCiudad;
    }

    
    public List<Orden> getOrdenList() {
        return ordenList;
    }

    public void setOrdenList(List<Orden> ordenList) {
        this.ordenList = ordenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_almacen != null ? id_almacen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Almacen)) {
            return false;
        }
        Almacen other = (Almacen) object;
        if ((this.id_almacen == null && other.id_almacen != null) || (this.id_almacen != null && !this.id_almacen.equals(other.id_almacen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpadilla.entity.Almacen[ idAlmacen=" + id_almacen + " ]";
    }
    
}
