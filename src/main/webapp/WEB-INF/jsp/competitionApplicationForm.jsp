<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>审核申请</title>
</head>
<body>
<div>
    <form action="" method="post" name="filedForm">
        <div align="center">赛事申请id：<input type="text" name="name"value="xxx" readonly="true"/>
            赛事名称：<input type="text" name="name"value="xxx" readonly="true"/>
            负责人：<input type="text" name="name"value="xxx" readonly="true"/>
            裁判：<input type="text" name="name"value="xxx" readonly="true"/>
        </div>


        <div >
            <table width="800px" border="1px" align="center">
                <tr bgcolor="#a9a9a9" >
                    <th>场地申请编号 </th>
                    <th>场地名称</th>
                    <th>场地地址</th>
                    <th>开始时间</th>
                    <th >结束时间</th>
                </tr>

                <tr bgcolor="#f0f8ff" >
                    <td>0123456789abc</td>
                    <td>1234</td>
                    <td>17841566742</td>
                    <td>100.00</td>
                    <td>100.00</td>
                </tr>

            </table>
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


        <div align="center"><button name="allow">审核通过</button>  <button name="refuse">审核拒绝</button>  <button name="return">返回</button> </div>
    </form>
</div>

</body>
</html>
