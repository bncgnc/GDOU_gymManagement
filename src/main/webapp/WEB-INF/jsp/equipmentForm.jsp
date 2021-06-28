<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>器材修改</title>
</head>
<body>
<div>
    <div>
        <form action="${pageContext.request.contextPath}/equipment/equipmentUpdate" method="post">
            <div align="center">
                器材id：<input name="equipmentid" id="equipmentid" type="text" readonly="readonly" value="${equipment.equipmentid}"/>
            </div>
            <div align="center">
                器材名称：<input name="ename" id="ename" type="text" value="${equipment.ename}"/>
            </div>
            <div align="center">
                器材可用数量：<input name="enums" id="enums" type="text" value="${equipment.getenums()}"/>
            </div>
            <div align="center">
                器材租金：<input name="erent" id="erent" type="text" value="${equipment.erent}"/>
            </div>
            <div align="center">
                器材赔偿价格：<input name="ebreakprice" id="ebreakprice" type="text" value="${equipment.ebreakprice}"/>
            </div>
            <div align="center">
                <input type="submit" value="确认修改"/>
            </div>
        </form>

    </div>
</div>

</body>
</html>
