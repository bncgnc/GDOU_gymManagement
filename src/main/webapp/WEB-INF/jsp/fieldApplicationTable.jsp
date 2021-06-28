<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>场地申请</title>
</head>
<body>
<div align="center">
    <form action="${pageContext.request.contextPath}/field/fieldApplicationExampleSelect" method="post">
        <input type="text" name="selectExample" placeholder="查询条件"/>
        <input type="submit" value="查询">
    </form>
</div>
<div >
    <table width="900px" border="1px" align="center">
        <tr bgcolor="#a9a9a9" >
            <th align="center">场地申请编号</th>
            <th align="center">场地&时间id</th>
            <th align="center">申请用户id</th>
            <th align="center">状态</th>
            <th align="center">是否付款</th>
            <th align="center">申请日期</th>
        </tr>

        <c:forEach items="${fieldApplications}" var="application">
            <tr bgcolor="#f0f8ff" >
                <td align="center">${application.fieldApplicationid}</td>
                <td align="center">${application.fieldTimetableid}</td>
                <td align="center">${application.userid}</td>
                <td align="center">
                    <c:choose>
                        <c:when test="${application.fapermit == 0}">
                            未审核
                        </c:when>
                        <c:when test="${application.fapermit == 1}">
                            申请通过
                        </c:when>
                        <c:otherwise>
                            申请驳回
                        </c:otherwise>
                    </c:choose>
                </td>
                <td align="center">
                    <c:choose>
                        <c:when test="${application.fapaid == 0}">
                            未付款
                        </c:when>
                        <c:otherwise>
                            已付款
                        </c:otherwise>
                    </c:choose>
                </td>
                <td align="center">${application.fapdate}</td>
                <td align="center">
                    <button onclick="location='fieldApplicationPermit/${application.fieldApplicationid}'">
                        审核通过
                    </button>
                    <button onclick="location='fieldApplicationRefuse/${application.fieldApplicationid}'">
                        审核拒绝
                    </button>
                    <button onclick="location='fieldApplicationPaid/${application.fieldApplicationid}'">
                        已付款
                    </button>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
