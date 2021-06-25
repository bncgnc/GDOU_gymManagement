<%--
  Created by IntelliJ IDEA.
  User: 56247
  Date: 2021/6/23
  Time: 20:56
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
<link type="text/css" rel="stylesheet" href="/css/bootstrap.css">
<script language="JavaScript" src="/js/bootstrap.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script language="JavaScript" src="http://cdn.staticfile.org/moment.js/2.24.0/moment.js"></script>
<body style="background-image: url('/images/jimon_haru.jpg')">
<div style="width: 100%;height:160px;background-image: url('/images/bg2.png')">
    <h1 class="text-center text-primary">器材申请</h1>

</div>
<div style="height: 100%;width: 100%">
    <div class="container" style="margin-top: -60px;background:rgba(255,255,255,.2);height: 600px;box-shadow:5px 5px 8px 2px #666;" >
        <img src="/images/sd2.png" class="position-absolute">
        <form class="container text-center" style="color: white;padding: 130px 0">
            <div class="row">
                <div class="col-6"><h3>器材名：xxx</h3></div>
                <div class="col-6"><h3>器材数量:xxx</h3></div>
            </div>
            <div class="row">
                <div class="col-6"><h3>租借价格：xxx</h3></div>
                <div class="col-6"><h3>损坏赔偿价格:xxxx</h3></div>
            </div>

            <div style="margin-bottom: 30px">
                <p><h3>选择租借数量</h3></p>
                <label style="display: block" class="form-label">
                    <span>租借数量：</span><input type="number" class="form-control" style="width: 80px;display: inline">
                </label>
            </div>
            <button type="submit" class="btn btn-primary">提交</button>
        </form>
    </div>
</div>
</body>
</html>