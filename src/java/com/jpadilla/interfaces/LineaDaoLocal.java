/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpadilla.interfaces;

import com.jpadilla.entity.Linea;
import java.util.List;

/**
 *
 * @author jpadilla
 */
public interface LineaDaoLocal {

    void addLinea(Linea linea);

    void editLinea(Linea linea);

    void deleteLinea(int id_linea);

    Linea getLinea(int id_linea);

    List<Linea> findAllLinea();

}
