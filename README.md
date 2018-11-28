# PikapikaJava
***Netbeans Java Web Application MVC without framework***

<img src="https://pbs.twimg.com/media/DtDRogrWwAAB-8F.jpg:large" />

#### Modificar archivo package com/padilla/entity/DatabaseConf.java 

El archivo DatabaseConf.java a continuación contiene los datos de login de la base de datos MSSQL

```plain
    public void setDatabaseConfSQL() {
        this.server = "TCP/IP";
        this.port = "1433";
        this.namespaces = "pikapika_db";
        this.user = "sa";
        this.password = "+++++";
        this.datasource = 3; // 2 Lan, 3 Local package com/jpadilla/dao/Ds.java
    }
```


#### Modificar archivo package com/padilla/dao/Ds.java 

La clase Ds permite añadir opciones varias para obtener el objeto Connection la una base de datos

```plain
    protected void begin() {
        try {
            switch (this.datasource) {
                case 1:
                    ...
                    break;
                case 2:
                    ...
                    break;
                case 3:
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    } ...
```
Thank you! :)
