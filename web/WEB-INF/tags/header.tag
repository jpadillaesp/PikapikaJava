<%-- 
    Document   : header
    Author     : jpadilla
--%>
<%@attribute name="message"%>
<%@attribute name="title" required="false" %>
<!DOCTYPE html>
<html class="" lang="es-es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Este es el Panel de administración</title>
        <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" media="all" />
        <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css" media="all" />
        <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/assets/css/datepicker.css" media="all" />
        <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/assets/css/styles.css" media="all" />

        <link rel="stylesheet" type="text/css"  href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css" media="all" />
        <!--Custom Font-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="${pageContext.request.contextPath}/assets/js/html5shiv.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>
        <nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#sidebar-collapse" aria-expanded="true"><span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span></button>
                    <a class="navbar-brand" href="#">PikaPika</a>
                </div>
            </div><!-- /.container-fluid -->
        </nav>