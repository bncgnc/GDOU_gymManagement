<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>器材管理员</title>
</head>
<body >
<div align="center"><button name="checkFiledMessage"><a href="equipmentManagerCheckTable.jsp">查看器材信息</a> </button>
    <button name="checkFiledApplication"><a href="equipmentApplicationTable.jsp">查看器材申请</a> </button>
    <button name="checkFiledApplication"><a href="equipmentAddForm.jsp">新建器材申请</a> </button>
</div>
<div >
    <table  width="800px" border="1px" align="center" >
        <tr bgcolor="#a9a9a9" >
            <th>器材编号 </th>
            <th>器材名称</th>
            <th>器材可用数量</th>
            <th>租金</th>
            <th >操作</th>
        </tr>

        <tr bgcolor="#f0f8ff" >
            <td>0123456789abc</td>
            <td>1234</td>
            <td>17841566742</td>
            <td>100.00</td>
            <td><a href="equipmentForm.jsp">修改</a> <a href="#">删除</a> </td>
        </tr>

    </table>
</div>


<footer align="right">
    GGMS器材管理员
</footer>
</body>
</html>
