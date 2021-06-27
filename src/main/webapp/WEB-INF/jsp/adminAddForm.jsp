<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<div>
<form action="${pageContext.request.contextPath}/user/userAdd" method="post">
    <div align="center">用户id：<input name="userid" id="userid" type="text">
    </div>
    <div align="center">
        用户名称：<input name="uname" id="uname" type="text">
    </div>
    <div align="center">
        用户信用：<input name="ucredit" id="ucredit" type="text">
    </div>
    <div align="center">
        用户类型：<input name="utype" id="utype" type="text">
    </div>
    <div align="center">
        用户所属组织：<input name="uunit" id="uunit" type="text">
    </div>
    <div align="center">
       用户密码：<input name="upassword" id="upassword" type="password">
    </div>
    <div align="center">
        用户电话：<input name="uphone" id="uphone" type="text">
    </div>

    <div align="center">
        <input type="submit" value="提交"/>
    </div>
</form>
    <div align="center">
        <button onclick="location='userSelect'">返回</button>
    </div>
</div>
</body>
</html>
