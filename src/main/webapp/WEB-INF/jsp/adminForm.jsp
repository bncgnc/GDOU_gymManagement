<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户修改</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/user/userUpdate" method="post">
        <div align="center">用户id：<input name="userid" id="userid" type="text" value="${user.userid}" readonly="readonly">
        </div>
        <div align="center">
            用户名称：<input name="uname" id="uname" type="text" value="${user.uname}">
        </div>
        <div align="center">
            用户信用：<input name="ucredit" id="ucredit" type="text" value="${user.ucredit}">
        </div>
        <div align="center">
            用户类型：<input name="utype" id="utype" type="text" value="${user.utype}">
        </div>
        <div align="center">
            用户所属组织：<input name="uunit" id="uunit" type="text" value="${user.uunit}">
        </div>
        <div align="center">
            用户密码：<input name="upassword" id="upassword" type="password" value="${user.upassword}" readonly="readonly">
        </div>
        <div align="center">
            用户电话：<input name="uphone" id="uphone" type="text" value="${user.uphone}">
        </div>

        <div align="center">
            <input type="submit" value="提交"/>
        </div>
    </form>
</div>
</body>
</html>
