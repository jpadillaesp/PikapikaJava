/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpadilla.dao;

import com.jpadilla.entity.DatabaseConf;
import com.jpadilla.entity.Errors;
import com.jpadilla.entity.Linea;
import com.jpadilla.utils.MyLogger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpadilla
 */
public class LineaDao extends Ds {

    public static MyLogger logs = (MyLogger) MyLogger.getLogger("LineaDao SERVER");
    public ResultSetMetaData md;
    public PreparedStatement SqlQuery;
    public ResultSet result;
    public DatabaseConf databaseConf;
    public Errors errors = new Errors();

    public LineaDao(DatabaseConf databaseConf) {
        super(databaseConf);
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    public void addLinea(Linea linea) {
        logs.info(LineaDao.class.getName() + " addLinea(Linea linea)");
        String Statement
                = "INSERT INTO linea"
                + "           (nombre"
                + "           ,id_propietario"
                + "           ,activo)"
                + "     VALUES"
                + "           (?"
                + "           ,?"
                + "           ,?)";
        begin();
        if (getConnection() != null) {
            try {
                this.SqlQuery = getConnection().prepareStatement(Statement);
                this.SqlQuery.setString(1, linea.getNombre());
                this.SqlQuery.setInt(2, linea.getId_propietario());
                this.SqlQuery.setInt(3, linea.getActivo());
                this.SqlQuery.executeUpdate();

            } catch (SQLException ex) {
                logs.error(ex.getMessage());
            }

        }
        close();
        if (this.result
                != null) {
            try {
                this.result.close();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (this.SqlQuery
                != null) {
            try {
                this.SqlQuery.close();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void editLinea(Linea linea) {
        logs.info(LineaDao.class.getName() + " editLinea(Linea linea)");
        String Statement
                = "UPDATE linea"
                + "   SET nombre = ?"
                + "      ,id_propietario = ?"
                + " WHERE id_linea = ?"
                + " AND activo = 1";
        begin();
        if (getConnection() != null) {
            try {
                this.SqlQuery = getConnection().prepareStatement(Statement);
                this.SqlQuery.setString(1, linea.getNombre());
                this.SqlQuery.setInt(2, linea.getId_propietario());
                this.SqlQuery.setInt(3, linea.getId_linea());
                this.SqlQuery.executeUpdate();

            } catch (SQLException ex) {
                logs.error(ex.getMessage());
            }

        }
        close();
        if (this.result
                != null) {
            try {
                this.result.close();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (this.SqlQuery
                != null) {
            try {
                this.SqlQuery.close();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void deleteLinea(int id_linea) {
        logs.info(LineaDao.class.getName() + " deleteLinea(int id_linea)");
        String Statement
                = "UPDATE linea"
                + "   SET activo = 0"
                + " WHERE id_linea = ?"
                + " AND activo = 1";
        if (getPropietario(id_linea) != null) {
            this.errors.setCod_error(3);
            this.errors.setMsg_error("ERROR NODO PROPIETARIO RESTRINGIDO POR NODOS HOJAS");
        } else {
            begin();
            if (getConnection() != null) {
                try {
                    this.SqlQuery = getConnection().prepareStatement(Statement);
                    this.SqlQuery.setInt(1, id_linea);
                    this.SqlQuery.executeUpdate();
                    this.errors.setCod_error(10);
                    this.errors.setMsg_error("SE HA ELIMINADO LA LINEA");
                } catch (SQLException ex) {
                    logs.error(ex.getMessage());
                }

            }
            close();
            if (this.result
                    != null) {
                try {
                    this.result.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (this.SqlQuery
                    != null) {
                try {
                    this.SqlQuery.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public Linea getLinea(int id_linea) {
        logs.info(LineaDao.class.getName() + " getLinea(int id_linea)");
        Linea linea = null;

        String Statement
                = "SELECT id_linea"
                + "      ,nombre"
                + "      ,id_propietario"
                + "      ,activo"
                + "  FROM linea"
                + "  WHERE id_linea=?";
        begin();

        if (getConnection() != null) {
            try {
                this.SqlQuery = getConnection().prepareStatement(Statement);
                this.SqlQuery.setInt(1, id_linea);
                this.result = this.SqlQuery.executeQuery();

                while (this.result.next()) {
                    linea = new Linea();
                    linea.setId_linea(this.result.getInt("id_linea"));
                    linea.setNombre(this.result.getString("nombre"));
                    linea.setId_propietario(this.result.getInt("id_propietario"));
                    linea.setActivo(this.result.getInt("activo"));
                }

            } catch (SQLException ex) {
                logs.error(ex.getMessage());
            }

        }
        close();
        if (this.result
                != null) {
            try {
                this.result.close();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (this.SqlQuery
                != null) {
            try {
                this.SqlQuery.close();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return linea;
    }

    public List<Linea> findAllLinea() {
        List<Linea> ls = new LinkedList<>();
        logs.info(LineaDao.class.getName() + " findAllLinea()");
        String Statement
                = "SELECT id_linea"
                + "      ,nombre"
                + "      ,id_propietario"
                + "      ,activo"
                + "  FROM linea"
                + "  WHERE activo = 1";
        begin();
        if (getConnection() != null) {
            try {
                this.SqlQuery = getConnection().prepareStatement(Statement);
                this.result = this.SqlQuery.executeQuery();
                while (this.result.next()) {
                    Linea linea = new Linea();
                    linea.setId_linea(this.result.getInt("id_linea"));
                    linea.setNombre(this.result.getString("nombre"));
                    linea.setId_propietario(this.result.getInt("id_propietario"));
                    linea.setActivo(this.result.getInt("activo"));
                    ls.add(linea);
                }

            } catch (SQLException ex) {
                logs.error(ex.getMessage());
            }

        }
        close();
        if (this.result
                != null) {
            try {
                this.result.close();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (this.SqlQuery
                != null) {
            try {
                this.SqlQuery.close();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return ls;
    }

    public Linea getPropietario(int id_linea) {
        logs.info(LineaDao.class.getName() + " getPropietario(int id_linea)");
        Linea Propietario = null;

        String Statement
                = "SELECT pd.id_linea"
                + ", pd.nombre"
                + ", pd.id_propietario"
                + ", pd.activo"
                + " FROM linea pd"
                + " INNER JOIN (SELECT DISTINCT"
                + " id_propietario"
                + "  FROM linea"
                + "   WHERE 1=1)"
                + "    rz ON pd.id_linea = rz.id_propietario"
                + "    AND pd.id_linea =?";
        begin();

        if (getConnection() != null) {
            try {
                this.SqlQuery = getConnection().prepareStatement(Statement);
                this.SqlQuery.setInt(1, id_linea);
                this.result = this.SqlQuery.executeQuery();

                while (this.result.next()) {
                    Propietario = new Linea();
                    Propietario.setId_linea(this.result.getInt("id_linea"));
                    Propietario.setNombre(this.result.getString("nombre"));
                    Propietario.setId_propietario(this.result.getInt("id_propietario"));
                    Propietario.setActivo(this.result.getInt("activo"));
                }

            } catch (SQLException ex) {
                logs.error(ex.getMessage());
            }

        }
        close();
        if (this.result
                != null) {
            try {
                this.result.close();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (this.SqlQuery
                != null) {
            try {
                this.SqlQuery.close();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoSqlServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Propietario;
    }
}
