<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>赛事管理员界面</title>
</head>
<body>
<div align="center">
    <table width="800px" border="1px" align="center">
        <tr bgcolor="#a9a9a9" >
            <th align="center">赛事编号</th>
            <th align="center">场地申请编号</th>
            <th align="center">器材申请名称</th>
            <th align="center">赛事名</th>
            <th align="center">裁判</th>
            <th align="center">状态</th>
        </tr>

        <c:forEach items="${competitionList}" var="competition">
            <tr bgcolor="#a9a9a9">
                <td align="center">${competition.competitionid}</td>
                <td align="center">${competition.fieldApplicationid}</td>
                <td align="center">${competition.equipmentApplicationid}</td>
                <td align="center">${competition.cname}</td>
                <td align="center">${competition.cjudge}</td>
                <td align="center">
                    <c:if test="${competition.capermit == 0}">
                        未审核
                    </c:if>
                    <c:if test="${competition.capermit == 1}">
                        申请通过
                    </c:if>
                    <c:if test="${competition.capermit == 2}">
                        申请驳回
                    </c:if>
                </td>
                <td bgcolor="#f0f8ff" >
                    <button onclick="location='${pageContext.request.contextPath}/competition/competitionPermit/${competition.competitionid}'">
                        审核通过
                    </button>
                    <button onclick="location='${pageContext.request.contextPath}/competition/competitionRefuse/${competition.competitionid}'">
                        审核驳回
                    </button>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>


<footer align="right">
    GGMS赛事管理员
</footer>
</div>

</body>
</html>
