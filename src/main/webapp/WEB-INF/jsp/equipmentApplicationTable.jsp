<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center"><button name="checkFiledMessage"><a href="equipmentManagerCheckTable.jsp">查看器材信息</a> </button>
    <button name="checkFiledApplication"><a href="equipmentApplicationTable.jsp">查看器材申请</a> </button>
    <button name="checkFiledApplication"><a href="equipmentAddForm.jsp">新建器材申请</a> </button>
</div>
<div >
    <table width="800px" border="1px" align="center">
        <tr bgcolor="#a9a9a9" >
            <th>器材申请编号 </th>
            <th>申请人名称</th>
            <th>申请开始时间</th>
            <th>申请结束时间</th>
            <th>操作</th>
        </tr>

        <tr bgcolor="#f0f8ff" >
            <td>0123456789abc</td>
            <td>1234</td>
            <td>17841566742</td>
            <td>100.00</td>
            <td><a href="equipmentApplicationForm.jsp">审核</a> </td>
        </tr>

    </table>
</div>

</body>
</html>
