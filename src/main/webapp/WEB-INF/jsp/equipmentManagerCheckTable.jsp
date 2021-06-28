<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>器材管理员界面</title>
</head>
<body >
<div align="center">
    <form action="${pageContext.request.contextPath}/equipment/equipmentExampleSelect" method="post">
        <input type="text" name="selectExample" placeholder="查询条件"/>
        <input type="submit" value="查询">
    </form>
    <button onclick="location='equipmentApplicationSelect'">查看器材申请</button>
    <button onclick="location='toEquipmentAdd'">添加器材</button>
</div>
<div>
    <table  width="800px" border="1px" align="center" >
        <tr bgcolor="#a9a9a9" >
            <th>器材编号 </th>
            <th>器材名称</th>
            <th>器材可用数量</th>
            <th>租金</th>
            <th>器材赔偿价格</th>
        </tr>

        <c:forEach items="${equipmentList}" var="equipment">
        <tr bgcolor="#f0f8ff" >
            <td align="center">${equipment.equipmentid}</td>
            <td align="center">${equipment.ename}</td>
            <td align="center">${equipment.getenums()}</td>
            <td align="center">${equipment.erent}</td>
            <td align="center">${equipment.ebreakprice}</td>
            <td align="center">
                <button onclick="location='toEquipmentUpdate/${equipment.equipmentid}'">修改</button>
                <button onclick="location='equipmentRemove/${equipment.equipmentid}'">删除</button>
            </td>
        </tr>
        </c:forEach>

    </table>
</div>


<footer align="right">
    GGMS器材管理员
</footer>
</body>
</html>
