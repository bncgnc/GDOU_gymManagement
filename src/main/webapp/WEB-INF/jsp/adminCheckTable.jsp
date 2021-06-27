<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员用户界面</title>
</head>
<body>

<div>
    <div align="center">
        <form action="userExampleSelect" method="post">
            <input type="text" name="selectExample" placeholder="查询条件"/>
            <input type="submit" value="查询">
        </form>
        <button onclick="location='toUserAdd'">添加用户</button>
        <button onclick="location='userLogout'" title="注销">注销</button>
    </div>
    <div align="center">
        <table width="800px" border="1px" align="center">
            <tr bgcolor="#a9a9a9" >
                <th align="center">用户编号 </th>
                <th align="center">用户名称</th>
                <th align="center">用户信用</th>
                <th align="center">用户类型</th>
                <th align="center">用户所属组织</th>
                <th align="center">用户电话</th>

            </tr>
            <c:forEach items="${userList}" var="user">
                <tr bgcolor="#f0f8ff" >
                    <td align="center">${user.userid} </td>
                    <td align="center">${user.uname} </td>
                    <td align="center">${user.ucredit} </td>
                    <td align="center">
                        <c:choose>
                            <c:when test="${user.utype == 0}">
                                普通用户
                            </c:when>
                            <c:when test="${user.utype == 1}">
                                用户管理员
                            </c:when>
                            <c:when test="${user.utype == 2}">
                                场地管理员
                            </c:when>
                            <c:when test="${user.utype == 3}">
                                器材管理员
                            </c:when>
                            <c:otherwise>
                                赛事管理员
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td align="center">${user.uunit} </td>
                    <td align="center">${user.uphone} </td>
                    <td align="center" >
                        <button onclick="location='toUserUpdate/${user.userid}'">修改</button>
                        <button onclick="location='userRemove/${user.userid}'">删除</button>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </div>


    <footer align="right">
        GGMS用户管理员
    </footer>
</div>

</body>
</html>
