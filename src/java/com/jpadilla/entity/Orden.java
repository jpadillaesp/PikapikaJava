/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpadilla.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jpadilla
 */
public class Orden implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id_orden;
    
    private String descripcion;
    
    private Date fechaModificacion;
    
    private Integer id_estado;
    
    private List<OrdenDetalle> ordenDetalleList;
    
    private Almacen id_almacen;
    
    private List<LogOrden> logOrdenList;

    public Orden() {
    }

    public Orden(Integer idOrden) {
        this.id_orden = idOrden;
    }

    public Integer getIdOrden() {
        return id_orden;
    }

    public void setIdOrden(Integer idOrden) {
        this.id_orden = idOrden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getIdEstado() {
        return id_estado;
    }

    public void setIdEstado(Integer idEstado) {
        this.id_estado = idEstado;
    }

    
    public List<OrdenDetalle> getOrdenDetalleList() {
        return ordenDetalleList;
    }

    public void setOrdenDetalleList(List<OrdenDetalle> ordenDetalleList) {
        this.ordenDetalleList = ordenDetalleList;
    }

    public Almacen getIdAlmacen() {
        return id_almacen;
    }

    public void setIdAlmacen(Almacen idAlmacen) {
        this.id_almacen = idAlmacen;
    }

    
    public List<LogOrden> getLogOrdenList() {
        return logOrdenList;
    }

    public void setLogOrdenList(List<LogOrden> logOrdenList) {
        this.logOrdenList = logOrdenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_orden != null ? id_orden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orden)) {
            return false;
        }
        Orden other = (Orden) object;
        if ((this.id_orden == null && other.id_orden != null) || (this.id_orden != null && !this.id_orden.equals(other.id_orden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpadilla.entity.Orden[ idOrden=" + id_orden + " ]";
    }
    
}
