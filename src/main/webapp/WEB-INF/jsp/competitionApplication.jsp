<%--
  Created by IntelliJ IDEA.
  User: 56247
  Date: 2021/6/23
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<script src="https://cdn.bootcss.com/vue/2.5.22/vue.js"></script>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
<script language="JavaScript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script language="JavaScript" src="http://cdn.staticfile.org/moment.js/2.24.0/moment.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
<body style="background-image: url(${pageContext.request.contextPath}/images/jimon_haru.jpg)">
<div style="width: 100%;height:160px;background-image: url(${pageContext.request.contextPath}/images/bg3.png)">
    <h1 class="text-center text-primary">比赛申请</h1>

</div>
<div style="height: 100%;width: 100%">
    <div class="container" style="margin-top: -60px;background:rgba(255,255,255,.2);height: 600px;box-shadow:5px 5px 8px 2px #666;" >
        <img src="${pageContext.request.contextPath}/images/sd3.png" class="position-absolute">
        <form class="container text-center" style="color: white;padding: 130px 0">
            <div class="row">
                <div class="col-6"><h3 style="display: inline">比赛名：</h3>
                    <label>
                        <input type="text" class="form-control" style="width: 120px;display: inline">
                    </label>
                </div>
                <div class="col-6"><h3 style="display: inline">裁判:</h3>
                    <label>
                        <input type="text" class="form-control" style="width: 120px;display: inline">
                    </label>
                </div>
            </div>


            <div style="margin-bottom: 30px">
                <p><h3>选择比赛场地</h3></p>
                <label style="display: block" class="form-label">
                    <span>场地：</span><select class="form-select" style="width: 300px;display: inline">
                    <option selected>Open this select menu</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
                </label>
            </div>
            <div style="margin-bottom: 30px">
                <p><h3>选择比赛器材</h3></p>
                <label style="display: block" class="form-label">
                    <span>器材：</span><select class="form-select" style="width: 300px;display: inline">
                    <option selected>Open this select menu</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
                </label>
            </div>

            <button type="submit" class="btn btn-primary">提交</button>
        </form>
    </div>
</div>
</body>
</html>