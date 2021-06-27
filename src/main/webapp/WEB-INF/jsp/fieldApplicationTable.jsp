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
    <button name="checkFiledMessage" ><a href="filedManagerCheckTable.jsp">查看场地信息</a> </button>
</div>
<div >
    <table width="800px" border="1px" align="center">
        <tr bgcolor="#a9a9a9" >
            <th>场地申请编号</th>
            <th>场地名称</th>
            <th>场地地址</th>
        </tr>


        <tr bgcolor="#f0f8ff" >
            <td><a href="filedApplicationForm.jsp">审核</a> </td>
        </tr>

    </table>
</div>

</body>
</html>
