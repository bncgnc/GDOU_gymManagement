<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>场地管理员</title>
</head>
<body >
<div>
<div align="center">
    <button name="checkFiledMessage" > <a href="filedManagerCheckTable.jsp">查看场地信息</a> </button>
    <button name="checkFiledApplication" ><a href="filedApplicationTable.jsp">查看场地申请</a> </button>
    <button name="checkFiledApplication" ><a href="filedAddForm.jsp">添加场地</a> </button>
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

        <tr bgcolor="#f0f8ff" >
            <td align="center">12345678 </td>
            <td align="center">123456</td>
            <td align="center">0123456789abc</td>
            <td align="center">1234</td>
            <td align="center">17841566742</td>
            <td align="center">100.00</td>
            <td align="center" >
                <a href="filedForm.jsp">修改</a>
                <a href="filedManagerCheckTable.jsp">删除</a>
            </td>
        </tr>

    </table>
</div>


<footer align="right">
    GGMS场地管理员
</footer>
</div>
</body>
</html>
