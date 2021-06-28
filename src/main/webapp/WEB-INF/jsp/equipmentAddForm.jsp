<%--
  Created by IntelliJ IDEA.
  User: xpw
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加器材</title>
</head>
<body>
<div align="center">
    <form action="${pageContext.request.contextPath}/equipment/equipmentAdd" method="post">
        <div align="center">
            器材名称：<input name="ename" id="ename" type="text"/>
        </div>
        <div align="center">
            器材可用数量：<input name="enums" id="enums" type="text"/>
        </div>
        <div align="center">
            器材租金：<input name="erent" id="erent" type="text"/>
        </div>
        <div align="center">
            器材赔偿价格：<input name="ebreakprice" id="ebreakprice" type="text"/>
        </div>
        <div align="center">
            <input type="submit" value="确认添加"/>
        </div>
    </form>
    <div align="center">
        <button onclick="location='${pageContext.request.contextPath}/equipment/equipmentSelect'">返回</button>
    </div>
</div>

</body>
</html>
