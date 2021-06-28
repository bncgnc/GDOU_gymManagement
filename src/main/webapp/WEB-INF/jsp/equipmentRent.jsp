<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>器材申请结算</title>
</head>
<body>
<div>
    <table width="800px" border="1px" align="center">
        <tr bgcolor="#a9a9a9" >
            <th>器材申请结算编号</th>
            <th>器材申请编号</th>
            <th>申请实际天数</th>
            <th>损坏个数</th>
        </tr>

        <c:forEach items="${equipmentRentList}" var="rent">
            <tr bgcolor="#f0f8ff" >
                <td align="center">${rent.equipmentRentid}</td>
                <td align="center">${rent.equipmentApplicationid}</td>
                <td align="center">${rent.eractualtime}</td>
                <td align="center">${rent.erbreaknum}</td>
                <td align="center">
                    <button onclick="location='${pageContext.request.contextPath}/equipment/equipmentRentRemove/${rent.equipmentRentid}'">删除</button>
                </td>
            </tr>
        </c:forEach>

    </table>
    <div align="center">
        <button onclick="location='${pageContext.request.contextPath}/equipment/equipmentApplicationSelect'">返回</button>
    </div>
</div>

</body>
</html>
