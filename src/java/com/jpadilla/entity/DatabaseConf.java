package com.jpadilla.entity;

public class DatabaseConf {

    private String server;
    private String port;
    private String namespaces;
    private String user;
    private String password;
    private int datasource;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getServer() {
        return this.server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNamespaces() {
        return this.namespaces;
    }

    public void setNamespaces(String namespaces) {
        this.namespaces = namespaces;
    }

    public int getDatasource() {
        return this.datasource;
    }

    public void setDatasource(int datasource) {
        this.datasource = datasource;
    }

    public void setDatabaseConfSQL() {
        this.server = "localhost\\SQLEXPRESS";
        this.port = "1433";
        this.namespaces = "pikapika_db";
        this.user = "sa";
        this.password = "seguridad";
        this.datasource = 3; // 2 Lan, 3 Local
    }

    public void setDatabaseConfSQL(String server,
            String port,
            String namespaces,
            String user,
            String password,
            int datasource) {
        this.server = server;
        this.port = port;
        this.namespaces = namespaces;
        this.user = user;
        this.password = password;
        this.datasource = datasource;
    }

}
