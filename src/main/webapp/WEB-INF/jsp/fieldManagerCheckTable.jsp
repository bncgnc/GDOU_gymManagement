<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>场地管理员界面</title>
</head>
<body >
<div>
<div align="center">
    <form action="${pageContext.request.contextPath}/field/fieldExampleSelect" method="post">
        <input type="text" name="selectExample" placeholder="查询条件"/>
        <input type="submit" value="查询">
    </form>
    <button onclick="location='toFieldApplication'" >查看场地申请</button>
    <button onclick="location='toFieldAdd'">添加场地</button>
</div>
<div align="center">
    <table width="800px" border="1px" align="center">
        <tr bgcolor="#a9a9a9" >
            <th align="center">场地编号 </th>
            <th align="center">场地名称</th>
            <th align="center">地址</th>
            <th align="center">负责人</th>
            <th align="center">负责人电话</th>
            <th align="center">租金</th>
        </tr>

        <c:forEach items="${fieldList}" var="field">
            <tr bgcolor="#f0f8ff" >
                <td align="center">${field.fieldid}</td>
                <td align="center">${field.fname}</td>
                <td align="center">${field.flocation}</td>
                <td align="center">${field.fhost}</td>
                <td align="center">${field.fhostcall}</td>
                <td align="center">${field.frent}</td>
                <td align="center">
                    <button onclick="location='toFieldUpdate/${field.fieldid}'">修改</button>
                    <button onclick="location='fieldRemove/${field.fieldid}'">删除</button>
                    <button onclick="location='toFieldTimetable/${field.fieldid}'">查看具体安排</button>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

<footer align="right">
    GGMS场地管理员
</footer>

</div>
</body>
</html>
