<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>器材申请</title>
</head>
<body>
<div align="center">
    <form action="${pageContext.request.contextPath}/equipment/equipmentApplicationExampleSelect" method="post">
        <input type="text" name="selectExample" placeholder="查询条件"/>
        <input type="submit" value="查询">
    </form>
    <button onclick="location='${pageContext.request.contextPath}/equipment/equipmentRentSelect'">查看结算</button>
</div>
<div >
    <table width="800px" border="1px" align="center">
        <tr bgcolor="#a9a9a9" >
            <th>器材申请编号</th>
            <th>器材编号</th>
            <th>申请人id</th>
            <th>申请人名称</th>
            <th>申请数量</th>
            <th>申请天数</th>
            <th>申请状态</th>
        </tr>

        <div align="center">
        <form action="${pageContext.request.contextPath}/equipment/equipmentRentAdd" method="post">
            实际使用天数:<input type="text" name="eractualtime" id="eractualtime"/>
            实际损坏数量:<input type="text" name="erbreaknum" id="erbreaknum"/>
        <c:forEach items="${equipmentApplicationList}" var="application">
            <tr bgcolor="#f0f8ff" >
                <td align="center">${application.equipmentApplicationid}</td>
                <td align="center">${application.equipmentid}</td>
                <td align="center">${application.userid}</td>
                <td align="center">
                    <c:set var="curUserId" value="${application.userid}"/>
                    <c:out value="${applicants.get(curUserId).uname}"/>
                </td>
                <td align="center">${application.eanum}</td>
                <td align="center">${application.eaplantime}</td>
                <td align="center">
                    <c:if test="${application.eapermit == 0}">
                        未审核
                    </c:if>
                    <c:if test="${application.eapermit == 1}">
                        申请通过
                    </c:if>
                    <c:if test="${application.eapermit == 2}">
                        申请驳回
                    </c:if>
                </td>
                <td>
                    <c:if test="${application.eapermit == 0}">
                        <button onclick="location='${pageContext.request.contextPath}/equipment/equipmentApplicationPermit/${application.equipmentApplicationid}'">
                            审核通过
                        </button>
                        <button onclick="location='${pageContext.request.contextPath}/equipment/equipmentApplicationRefuse/${application.equipmentApplicationid}'">
                            审核驳回
                        </button>
                        <a href="#">结算</a>
                    </c:if>
                    <c:if test="${application.eapermit != 0}">
                        <a href="#">审核通过</a>
                        <a href="#">审核驳回</a>
                        <input type="hidden" name="equipmentApplicationid" id="equipmentApplicationid" value="${application.equipmentApplicationid}"/>
                        <input type="submit" value="结算">
                    </c:if>
                </td>
            </tr>
        </c:forEach>
        </form>
        </div>
    </table>
</div>

</body>
</html>
