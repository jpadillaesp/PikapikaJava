/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpadilla.entity;

import java.util.List;

/**
 *
 * @author Root
 */
public class Linea {

    private Integer id_linea;

    private String nombre;

    private int activo;

    private Integer id_propietario;

    private List<Linea> lineaList;
    private Linea Propietario;
    private List<ProductoLinea> productoLineaList;

    public Linea(int id_linea, String nombre, int id_propietario, int activo) {
        this.id_linea = id_linea;
        this.nombre = nombre;
        this.id_propietario = id_propietario;
        this.activo = activo;
    }

    public Linea() {
       
    }

    public Integer getId_linea() {
        return id_linea;
    }

    public void setId_linea(Integer id_linea) {
        this.id_linea = id_linea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public Integer getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(Integer id_propietario) {
        this.id_propietario = id_propietario;
    }

    public List<Linea> getLineaList() {
        return lineaList;
    }

    public void setLineaList(List<Linea> lineaList) {
        this.lineaList = lineaList;
    }

    public Linea getPropietario() {
        return Propietario;
    }

    public void setPropietario(Linea Propietario) {
        this.Propietario = Propietario;
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
        hash += (id_linea != null ? id_linea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linea)) {
            return false;
        }
        Linea other = (Linea) object;
        if ((this.id_linea == null && other.id_linea != null) || (this.id_linea != null && !this.id_linea.equals(other.id_linea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jpadilla.entity.Linea[ id_linea=" + id_linea + " ]";
    }
}
