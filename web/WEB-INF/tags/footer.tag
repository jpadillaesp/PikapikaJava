<%-- 
    Document   : footer
    Author     : Root
--%>

<%@tag description="footer" pageEncoding="UTF-8"%>
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/chart.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/chart-data.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/easypiechart.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/easypiechart-data.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap-datepicker.js"></script>

        <script type="text/javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/custom.js"></script>

        <script type="text/javascript">
            $(document).ready(function () {
                $('#tablaResult').DataTable({
                    "lengthMenu": [[5, 10, 25, 50, -1], [5, 10, 25, 50, "All"]]
                });
            });
        </script>

    </body>
</html>