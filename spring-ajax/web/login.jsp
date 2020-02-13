<%--
  Created by IntelliJ IDEA.
  User: kongweikun
  Date: 20-2-13
  Time: 下午3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script>
        function a1() {
            $.post({
                url: "${pageContext.request.contextPath}/a3",
                data: {"name": $("#name").val()},
                success: function (data) {
                    if(data.toString() == "ok"){
                        $("#userInfo").css("color","green");
                    }else {
                        $("#userInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                },
            })
        };

        function a2() {
            $.post({
                url: "${pageContext.request.contextPath}/a3",
                data: {"pwd": $("#pwd").val()},
                success: function (data) {
                    if(data.toString() == "ok"){
                        $("#pwd").css("color","green");
                    }else {
                        $("#pwd").css("color","red");
                    }
                    $("#pwdInfo").html(data);
                },
            })
        }
    </script>
</head>
<body>
<p>
    用户名:<input type="text" id="name" onblur="a1()"/>
    <span id="userInfo"></span>
</p>
<p>
    密码:<input type="text" id="pwd" onblur="a2()"/>
    <span id="pwdInfo"></span>
</p>
</body>
</html>
