<%-- 
    Document   : newlinea
    Created on : 27-nov-2018, 3:38:34
    Author     : Root
--%>
<div class="row">
    <ol class="breadcrumb">
        <li><a href="#">
                <em class="fa fa-home"></em>
            </a></li>
        <li class="active">Ingreso de Linea</li>
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
                Actualización de Categoría:
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
                        <input id="id_linea" name="id_linea" type="hidden" value="" class="form-control" required >
                        <!-- Name input-->
                        <div class="form-group">
                            <label class="col-md-3 control-label" for="nombre">Linea</label>
                            <div class="col-md-9">
                                <input id="nombre" name="nombre" type="text" value="" class="form-control" required>
                            </div>
                        </div>
                        <!-- Name input-->
                        <div class="form-group">
                            <label class="col-md-3 control-label" for="id_propietario">Linea Superior</label>
                            <div class="col-md-9">
                                <input id="id_propietario" name="id_propietario" type="text" value="" class="form-control" required>
                            </div>
                        </div>
                        <!-- Name input-->
                        <div class="form-group">
                            <label class="col-md-3 control-label" for="activo">Activo</label>
                            <div class="col-md-9">
                                <input id="activo" name="activo" type="text" value="" class="form-control" required>
                            </div>
                        </div>

                        <!-- Form actions -->
                        <div class="form-group">
                            <div class="col-md-12 widget-right">
                                <input type="Submit" name="action" class="btn btn-default btn-md pull-right" value="Add" />
                                <input type="Reset"  class="btn btn-default btn-md pull-right" value="Limpiar" />

                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div><!--/.col-->
</div>
