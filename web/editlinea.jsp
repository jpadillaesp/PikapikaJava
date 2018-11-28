<%-- 
    Document   : editlinea
    Created on : 26-nov-2018, 18:30:56
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
                <li class="active">Actualización de Linea</li>
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
            <!--/.col-->

            <div class="col-md-6">


                <div class="panel panel-default">
                    <div class="panel-heading">
                        Actualización de Linea
                        <ul class="pull-right panel-settings panel-button-tab-right">
                            <li class="dropdown"><a class="pull-right dropdown-toggle" data-toggle="dropdown" href="#">
                                    <em class="fa fa-cogs"></em>
                                </a>
                            </li>
                        </ul>
                        <span class="pull-right clickable panel-toggle panel-button-tab-left"><em class="fa fa-toggle-up"></em></span></div>
                    <div class="panel-body">
                        <form class="form-horizontal" action="${pageContext.request.contextPath}/linea" method="post">
                        <fieldset>
                            <c:forEach items="${requestScope.objeto}" var="linea">
                                <!-- Name input-->
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="id_linea">Id Linea</label>
                                    <div class="col-md-9">
                                        <input id="id_linea" name="id_linea" type="text" value="${linea.id_linea}" class="form-control" required>
                                    </div>
                                </div>
                                <!-- Name input-->
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="nombre">Linea</label>
                                    <div class="col-md-9">
                                        <input id="nombre" name="nombre" type="text" value="${linea.nombre}" class="form-control" required>
                                    </div>
                                </div>
                                <!-- Name input-->
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="id_propietario">Linea Superior</label>
                                    <div class="col-md-9">
                                        <input id="id_propietario" name="id_propietario" type="text" value="${linea.id_propietario}" class="form-control" required>
                                    </div>
                                </div>
                                <!-- Name input-->
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="activo">Activo</label>
                                    <div class="col-md-9">
                                        <input id="activo" name="activo" type="text" value="${linea.activo}" class="form-control" required>
                                    </div>
                                </div>

                                <!-- Form actions -->
                                <div class="form-group">
                                    <div class="col-md-12 widget-right">
                                        <input type="Submit" name="action" class="btn btn-default btn-md pull-right" value="Add" />
                                        <input type="Submit" name="action" class="btn btn-default btn-md pull-right" value="Edit" />
                                        <input type="Submit" name="action" class="btn btn-default btn-md pull-right" value="Delete" />

                                    </div>
                                </div>
                            </c:forEach> 
                        </fieldset>
                    </form>
                </div>
            </div>
        </div><!--/.col-->

    </div>

</div>
<page:footer></page:footer>