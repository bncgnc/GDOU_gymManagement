<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新建场地</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/field/fieldAdd" method="post" name="filedForm" >
    <div align="center">
        场地名称：<input name="fname" id="fname" type="text">
    </div>
    <div align="center">
        场地地址：<input name="flocation" id="flocation" type="text">
    </div>
    <div align="center">
        负责人：<input name="fhost" id="fhost" type="text">
    </div>
    <div align="center">
        负责人电话：<input name="fhostcall" id="fhostcall" type="text">
    </div>
    <div align="center">
        场地租金：<input name="frent" id="frent" type="text">
    </div>
    <div align="center">
        <button name="change">确认添加</button>
    </div>
</form>
<div align="center">
    <button onclick="location='${pageContext.request.contextPath}/field/fieldSelect'">返回</button>
</div>

</body>
</html>
