<%-- 
    Document   : menu
    Created on : 26-nov-2018, 18:04:50
    Author     : Root
--%>

<%@tag description="menu" pageEncoding="UTF-8"%>

<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
    <div class="divider"></div>
    <ul class="nav menu">
        <li class="active"><a href="${pageContext.request.contextPath}"><em class="fa fa-dashboard">&nbsp;</em> Dashboard</a></li>
        <li><a href="${pageContext.request.contextPath}"><em class="fa fa-pencil-square-o">&nbsp;</em>Agregar Producto</a></li>
        <li><a href="${pageContext.request.contextPath}"><em class="fa fa-sort-amount-asc">&nbsp;</em>Ver Productos</a></li>
        <li><a href="${pageContext.request.contextPath}?newlinea"><em class="fa fa-pencil-square-o">&nbsp;</em>Agregar L&iacute;nea</a></li>
        <li><a href="${pageContext.request.contextPath}/listlinea"><em class="fa fa-sort-amount-asc">&nbsp;</em>Ver L&iacute;neas</a></li>
        <li><a href="${pageContext.request.contextPath}"><em class="fa fa-shopping-cart">&nbsp;</em>Ver Ordenes</a></li>
    </ul>
</div>

