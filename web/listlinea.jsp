<%-- 
    Document   : listlinea
    Author     : Root
--%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix = "page" uri = "WEB-INF/tlds/customtag.tld"%>

<page:header message="funciona tag header" title="PikaPika"></page:header>
<page:menu ></page:menu>
    <div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
        <div class="row">
            <ol class="breadcrumb">
                <li><a href="#">
                        <em class="fa fa-home"></em>
                    </a></li>
                <li class="active">Listado de Limeas</li>
            </ol>
        </div>
        <div class="row">
            <div class="col-xs-12">
                <div class="alert alert-warning">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                    <strong>Mensaje!</strong> ${requestScope.mensaje}
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-xs-12">
            <a href="${pageContext.request.contextPath}?newlinea" style="margin:3px; width:32.8%" class="btn btn-success col-lg-3 col-xs-3"><span style="font-size:larger;">
                    <span style="margin-right: 5px" class="glyphicon glyphicon-plus">
                    </span>Nueva Linea</span>
            </a>
        </div>
    </div>
    <div class="row">
        <!--/.col-->
        <div class="col-md-12">
            <div class="panel panel-info">
                <div class="panel-heading">Listado
                    <span class="pull-right clickable panel-toggle"><em class="fa fa-toggle-up"></em></span>
                </div>
                <div class="panel-body" style="display: block;">
                    <div class="table-responsive">
                        <table id="tablaResult" class="table table-striped table-bordered" style="width:100%" >
                            <thead>
                                <tr>
                                    <th>ID Linea</th>
                                    <th>Nombre</th>
                                    <th>Linea Padre</th>
                                    <th>Activo</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${requestScope.lista}" var="linea">
                                    <tr>
                                        <td><a href="${pageContext.request.contextPath}/lineadetail?id=${linea.id_linea}">${linea.id_linea}</a></td>
                                        <td>${linea.nombre}</td>
                                        <td>${linea.id_propietario}</td>
                                        <td>${linea.activo}</td>
                                        <td colspan="3">
                                            <a href="${pageContext.request.contextPath}/lineaedit?id=${linea.id_linea}"><span style="margin-right: 5px" class="glyphicon glyphicon-pencil"></span>Editar</a>
                                            <a href="${pageContext.request.contextPath}/lineadetail?id=${linea.id_linea}"><span style="margin-right: 5px" class="glyphicon glyphicon-align-justify"></span>Detalles</a>
                                            <a href="${pageContext.request.contextPath}/linea?id_linea=${linea.id_linea}&action=Delete"><span style="margin-right: 5px" class="glyphicon glyphicon-trash"></span>Eliminar</a></td>

                                    </tr>
                                </c:forEach>                 
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
<page:footer></page:footer>