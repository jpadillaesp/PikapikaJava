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
public class LogOrden implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id_log_orden;
    
    private int id_estado;
    
    private Date log_fecha;
    private Orden id_orden;

    public LogOrden() {
    }

    public LogOrden(Integer idLogOrden) {
        this.id_log_orden = idLogOrden;
    }

    public LogOrden(Integer idLogOrden, int idEstado) {
        this.id_log_orden = idLogOrden;
        this.id_estado = idEstado;
    }

    public Integer getIdLogOrden() {
        return id_log_orden;
    }

    public void setIdLogOrden(Integer idLogOrden) {
        this.id_log_orden = idLogOrden;
    }

    public int getIdEstado() {
        return id_estado;
    }

    public void setIdEstado(int idEstado) {
        this.id_estado = idEstado;
    }

    public Date getLogFecha() {
        return log_fecha;
    }

    public void setLogFecha(Date logFecha) {
        this.log_fecha = logFecha;
    }

    public Orden getIdOrden() {
        return id_orden;
    }

    public void setIdOrden(Orden idOrden) {
        this.id_orden = idOrden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_log_orden != null ? id_log_orden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogOrden)) {
            return false;
        }
        LogOrden other = (LogOrden) object;
        if ((this.id_log_orden == null && other.id_log_orden != null) || (this.id_log_orden != null && !this.id_log_orden.equals(other.id_log_orden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpadilla.entity.LogOrden[ idLogOrden=" + id_log_orden + " ]";
    }
    
}
