<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>场地表单</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/field/fieldUpdate" method="post" name="filedForm" >
    <div align="center">
        场地编号：<input name="fieldid" id="fieldid" type="text" value="${field.fieldid}" readonly="readonly">
    </div>
    <div align="center">
        场地名称：<input name="fname" id="fname" type="text" value="${field.fname}">
    </div>
    <div align="center">
        场地地址：<input name="flocation" id="flocation" type="text" value="${field.flocation}">
    </div>
    <div align="center">
        负责人：<input name="fhost" id="fhost" type="text" value="${field.fhost}">
    </div>
    <div align="center">
        负责人电话：<input name="fhostcall" id="fhostcall" type="text" value="${field.fhostcall}">
    </div>
    <div align="center">
        场地租金：<input name="frent" id="frent" type="text" value="${field.frent}">
    </div>
    <div align="center">
        <button name="change">提交</button>
    </div>
</form>

</body>
</html>
