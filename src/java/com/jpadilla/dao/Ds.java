package com.jpadilla.dao;

import com.jpadilla.entity.DatabaseConf;
import com.jpadilla.utils.MyLogger;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sourceforge.jtds.jdbcx.JtdsDataSource;

public class Ds {

    private Connection connection = null;
    private String BaseDato = "";
    private String Servidor = "";
    private String Usuario = "";
    private String Passwd = "";
    private int Port = 0;
    private int datasource = 0;
    private static MyLogger logs = (MyLogger) MyLogger.getLogger("DsSql");

    public Ds(DatabaseConf databaseConf) {
        this.Servidor = databaseConf.getServer();
        this.Port = Integer.parseInt(databaseConf.getPort());
        this.BaseDato = databaseConf.getNamespaces();
        this.Usuario = databaseConf.getUser();
        this.Passwd = databaseConf.getPassword();
        this.datasource = databaseConf.getDatasource();
    }

    protected void begin() {
        try {
            switch (this.datasource) {
                case 1:
                    JtdsDataSource dsSybase = new JtdsDataSource();
                    dsSybase.setDatabaseName(this.BaseDato);
                    dsSybase.setServerName(this.Servidor);
                    dsSybase.setServerType(2);
                    dsSybase.setPortNumber(this.Port);
                    this.connection = dsSybase.getConnection(this.Usuario, this.Passwd);
                    break;
                case 2:
                    SQLServerDataSource dsMssql = new SQLServerDataSource();
                    dsMssql.setDatabaseName(this.BaseDato);
                    dsMssql.setServerName(this.Servidor);
                    dsMssql.setPortNumber(this.Port);
                    this.connection = dsMssql.getConnection(this.Usuario, this.Passwd);
                    break;
                case 3:
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    } catch (ClassNotFoundException cnfe) {
                        System.err.println(" Error cargando el driver -> " + cnfe);
                        cnfe.printStackTrace();
                    }
                    try {
                        String dbURL = "jdbc:sqlserver://" + this.Servidor + ";databaseName=" + this.BaseDato + "";

                        this.connection = DriverManager.getConnection(dbURL, this.Usuario, this.Passwd);
                    } catch (SQLException e) {
                        System.out.println(" Error obteniendo la conexion -> " + e);
                    }
                    break;

                default:
                    this.connection = null;
            }
            logs.info("Iniciando begin()...");
        } catch (SQLException ex) {
            logs.error("SQLException: ", ex);
        }
    }

    protected Connection getConnection() {
        return this.connection;
    }

    protected void close() {
        try {
            if (this.connection != null) {
                this.connection.close();
                logs.info("Cerrando close()...");
            }
        } catch (SQLException ex) {
            logs.error("SQLException: ", ex);
        }
    }
}
