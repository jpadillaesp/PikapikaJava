/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpadilla.dao;

import com.jpadilla.entity.DatabaseConf;
import com.jpadilla.entity.Errors;
import com.jpadilla.utils.MyLogger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author * @author jpadilla
 */
public class MetodoSqlServer extends Ds {

    public static MyLogger logs = (MyLogger) MyLogger.getLogger("DaoSQL SERVER");
    public ResultSetMetaData md;
    public PreparedStatement SqlQuery;
    public ResultSet result;
    public DatabaseConf databaseConf;
    public Errors errors = new Errors();

    public MetodoSqlServer(DatabaseConf databaseConf) {
        super(databaseConf);
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

   
}
