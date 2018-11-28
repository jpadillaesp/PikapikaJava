/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpadilla.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jpadilla
 */
public class OrdenDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id_orden_detalle;
    
    private Integer cantidad;
    
    private Date fecha_modificacion;
    
    private Bodega id_bodega;
    
    private Estados id_estado;
    
    private Orden id_orden;
    
    private Producto id_producto;

    public OrdenDetalle() {
    }

    public OrdenDetalle(Integer idOrdenDetalle) {
        this.id_orden_detalle = idOrdenDetalle;
    }

    public Integer getIdOrdenDetalle() {
        return id_orden_detalle;
    }

    public void setIdOrdenDetalle(Integer idOrdenDetalle) {
        this.id_orden_detalle = idOrdenDetalle;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaModificacion() {
        return fecha_modificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fecha_modificacion = fechaModificacion;
    }

    public Bodega getIdBodega() {
        return id_bodega;
    }

    public void setIdBodega(Bodega idBodega) {
        this.id_bodega = idBodega;
    }

    public Estados getIdEstado() {
        return id_estado;
    }

    public void setIdEstado(Estados idEstado) {
        this.id_estado = idEstado;
    }

    public Orden getIdOrden() {
        return id_orden;
    }

    public void setIdOrden(Orden idOrden) {
        this.id_orden = idOrden;
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
        hash += (id_orden_detalle != null ? id_orden_detalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenDetalle)) {
            return false;
        }
        OrdenDetalle other = (OrdenDetalle) object;
        if ((this.id_orden_detalle == null && other.id_orden_detalle != null) || (this.id_orden_detalle != null && !this.id_orden_detalle.equals(other.id_orden_detalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpadilla.entity.OrdenDetalle[ idOrdenDetalle=" + id_orden_detalle + " ]";
    }
    
}
