<%--
  Created by IntelliJ IDEA.
  User: kongweikun
  Date: 20-2-13
  Time: 上午9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <%--    <script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>--%>
    <script>
        function a() {
            $.post({
                url: "${pageContext.request.contextPath}/hello",
                data: {'name': $("#usrname").val()},
                success: function (data) {
                    alert(data);
                }
            })
        }
    </script>
</head>
<body>
用户名: <input id="usrname" onblur="a()">
</body>
</html>
