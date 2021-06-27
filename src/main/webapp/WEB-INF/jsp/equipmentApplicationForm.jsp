<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>

    </style>
</head>
<body>
<div align="center"><button name="checkFiledMessage"><a href="equipmentManagerCheckTable.jsp">查看器材信息</a> </button>
    <button name="checkFiledApplication"><a href="equipmentApplicationTable.jsp">查看器材申请</a> </button>
    <button name="checkFiledApplication"><a href="equipmentAddForm.jsp">新建器材申请</a> </button>
</div>
<div>
    <form action="" method="post" name="filedForm">
        <div align="center">器材申请id：<input type="text" name="equipmentApplicationFormId"value="xxx" readonly="true"/>
            用户id：<input type="text" name="userId"value="xxx" readonly="true"/>
            用户名称：<input type="text" name="userName"value="xxx" readonly="true"/>
        </div>
        <div align="center">

        </div>
        <div align="center">

        </div>
        <div  >
            <table width="800px" border="1px" align="center">
                <tr bgcolor="#a9a9a9" >
                    <th>器材申请编号 </th>
                    <th>器材名称 </th>
                    <th>数量 </th>
                    <th>申请开始时间</th>
                    <th>申请结束时间</th>
                </tr>

                <tr bgcolor="#f0f8ff" >
                    <td>0123456789abc</td>
                    <td>17841566742</td>
                    <td>100.00</td>
                    <td>2333333 </td>
                    <td>23333333</td>
                </tr>

            </table>
        </div>

        <div align="center">
            <button name="allow">审核通过</button>  <button name="refuse">审核拒绝</button>  <button name="return">返回</button>
        </div>
    </form>

</div>

</body>
</html>
