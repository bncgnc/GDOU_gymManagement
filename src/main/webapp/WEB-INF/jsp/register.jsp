<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>用户注册页面</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/register.css">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

</head>

<body>

<div class="rg_layout">
    <div class="rg_left">
        <p class="p_reg">用户注册</p>
    </div>

    <div class="rg_center">
        <div class="re_form">

            <form action="userRegister" method="post" >
                <table>
                    <tr>
                        <td class="td_left"><label for="userid">用户名</label></td>
                        <td class="td_right"><input type="text" name="userid" id="userid" placeholder="请输入账号"></td>
                    </tr>

                    <tr>
                        <td class="td_left"><label for="upassword">密码</label></td>
                        <td class="td_right"><input type="password" name="upassword" id="upassword" placeholder="请输入密码"></td>
                    </tr>

                    <tr>
                        <td class="td_left"><label for="uunit">班级/单位</label></td>
                        <td class="td_right"><input type="text" name="uunit" id="uunit" placeholder="请输入班级/单位"></td>
                    </tr>

                    <tr>
                        <td class="td_left"><label for="uname">姓名</label></td>
                        <td class="td_right"><input type="text" name="uname" id="uname" placeholder="请输入真实姓名"></td>

                    </tr>

                    <tr>
                        <td class="td_left"><label for="uphone">手机号</label></td>
                        <td class="td_right"><input type="text" name="uphone" id="uphone" placeholder="请输入您的手机号"></td>

                    </tr>
                    <tr>

                        <td  colspan="2" align="center"><input type="submit" id="btn_sub"  value="注册"></td>

                    </tr>

                </table>

            </form>

        </div>

    </div>


    <div class="rg_right">
        <p>已有账号？<input type="button" onclick="location='toUserLogin'" value="立即登录"/></p>
    </div>
</div>


</body>

</html>
