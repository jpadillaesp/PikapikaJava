<%-- 
    Document   : index
    Author     : jpadilla
--%>

<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix = "page" uri = "WEB-INF/tlds/customtag.tld"%>

<page:header message="funciona tag header" title="PikaPika"></page:header>
<page:menu ></page:menu>
    <div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
    <%!
        private String view = "dashboard.jsp";

    %>
    <%

        if (request.getParameter("newlinea") != null) {
            view = "newlinea.jsp";
        } else if (request.getParameter("viewlinea") != null) {
            view = "lineadetail";
        } else if (request.getParameter("listlinea") != null) {
            view = "listlinea";
        } else if (request.getParameter("editlinea") != null) {
            view = "lineaedit";
        }
    %>
    
    <jsp:include page="<%= view%>" >
        <jsp:param name="objeto" value="${requestScope.objeto}" />
        <jsp:param name="mensaje" value="${requestScope.mensaje}" />
    </jsp:include>

</div>
<page:footer></page:footer>