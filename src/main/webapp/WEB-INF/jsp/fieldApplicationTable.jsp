<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>场地申请表格</title>
</head>
<body>
<div align="center">
    <button name="checkFiledMessage" ><a href="filedManagerCheckTable.jsp">查看场地信息</a> </button>
    <button name="checkFiledApplication"  ><a href="filedApplicationTable.jsp">查看场地申请</a></button>
    <button name="checkFiledApplication" ><a href="filedAddForm.jsp">添加场地</a> </button>
</div>
<div >
    <table width="800px" border="1px" align="center">
        <tr bgcolor="#a9a9a9" >
            <th>场地申请编号 </th>
            <th>场地名称</th>
            <th>场地地址</th>
            <th>开始时间</th>
            <th >结束时间</th>
            <th>操作</th>
        </tr>

        <tr bgcolor="#f0f8ff" >
            <td>0123456789abc</td>
            <td>1234</td>
            <td>17841566742</td>
            <td>100.00</td>
            <td>100.00</td>
            <td><a href="filedApplicationForm.jsp">审核</a> </td>
        </tr>

    </table>
</div>

</body>
</html>
