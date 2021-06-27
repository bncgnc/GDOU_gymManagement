<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>具体时间安排</title>
</head>
<body>
<div align="center">
    <table width="800px" border="1px" align="center">
        <tr bgcolor="#a9a9a9">
            <th>场地时间表id</th>
            <th>场地id</th>
            <th>开始时间</th>
            <th>结束时间</th>
        </tr>

    <c:if test="${fieldTime.size() > 0}">
        <c:forEach items="${fieldTime}" var="time">
            <tr bgcolor="#f0f8ff">
                <td align="center">${time.fieldTimetableid}</td>
                <td align="center">${time.fieldid}</td>
                <td align="center">${time.fdtimeStart}</td>
                <td align="center">${time.fdtimeEnd}</td>
                <td align="center">
                    <button onclick="location='${pageContext.request.contextPath}/field/fieldTimetableRemove/${time.fieldTimetableid}&${time.fieldid}'">删除</button>
                </td>
            </tr>
        </c:forEach>
    </c:if>
    </table>

        <form id="timeForm" action="${pageContext.request.contextPath}/field/fieldTimetableAdd" method="post">
            <input type="text" name="fieldid" id="fieldid" value="${curFieldId}" readonly="readonly">
            <input type="time" name="fdtimeStart" id="fdtimeStart"/>
            <input type="time" name="fdtimeEnd" id="fdtimeEnd"/>
            <input type="submit" value="添加">
        </form>
</div>

<div align="center">
    <button onclick="location='${pageContext.request.contextPath}/field/fieldSelect'">返回</button>
</div>

</body>
</html>
