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
<form action="" method="post" name="filedForm" >
    <div align="center">场地id：<input name="filedId" type="number">
    </div>
    <div align="center">
        场地名称：<input name="filedName" type="text">
    </div>
    <div align="center">
        场地地址：<input name="filedLocation" type="text">
    </div>
    <div align="center">场地开始时间：<input name="filedId" type="datetime-local">
    </div>
    <div align="center">
        场地结束时间：<input name="filedName" type="datetime-local">
    </div>
    <div align="center">
        负责人：<input name="filedHost" type="text">
    </div>
    <div align="center">
        负责人电话：<input name="filedCall" type="tel">
    </div>
    <div align="center">
        场地租金：<input name="filedRent" type="text">
    </div>
    <div align="center"><button name="change">确认添加</button><button name="return">返回</button> </div>
</form>

</body>
</html>
