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
public class Estados implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id_estado;
    
    private String descipcion;
    
    private Integer activo;
    
    private List<OrdenDetalle> ordenDetalleList;

    public Estados() {
    }

    public Estados(Integer idEstado) {
        this.id_estado = idEstado;
    }

    public Integer getIdEstado() {
        return id_estado;
    }

    public void setIdEstado(Integer idEstado) {
        this.id_estado = idEstado;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_estado != null ? id_estado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estados)) {
            return false;
        }
        Estados other = (Estados) object;
        if ((this.id_estado == null && other.id_estado != null) || (this.id_estado != null && !this.id_estado.equals(other.id_estado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpadilla.entity.Estados[ idEstado=" + id_estado + " ]";
    }
    
}
