<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" media="all"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <script>
        var __links = document.querySelectorAll('a');

        function __linkClick(e) {
            parent.window.postMessage(this.href, '*');
        };
        for (var i = 0, l = __links.length; i < l; i++) {
            if (__links[i].getAttribute('data-t') == '_blank') {
                __links[i].addEventListener('click', __linkClick, false);
            }
        }
    </script>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
</head>
<body>
<!-- contact-form -->
<div class="message warning">
    <div class="inset">
        <div class="login-head">
            <h1>登录</h1>
        </div>
        <form action="userLogin" method="post">
            <li>
                <input type="text" class="text" value="用户id/学号" name="userid"
                       onfocus="this.value = '';"
                       onblur="if (this.value == '') {this.value = '用户id/学号';}">
                <a href="#" class=" icon user"></a>
            </li>
            <div class="clear"></div>
            <li>
                <input type="password" value="password" name="password"
                       onfocus="this.value = '';"
                       onblur="if (this.value == '') {this.value = 'password';}">
                <a href="#" class="icon lock"></a>
            </li>
            <div class="clear"></div>
            <div class="submit">
                <input type="submit" value="确认">
                <input id="register" type="button" onclick="location='toUserRegister'" value="还没有账号?点击注册"/>
                <div class="clear"></div>
            </div>
        </form>
    </div>
</div>
</div>
<div class="clear"></div>
</body>
</html>

