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
<script src="${pageContext.request.contextPath}/js/vue.js"></script>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<%--<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.css">--%>
<%--<script language="JavaScript" src="${pageContext.request.contextPath}/static/js/bootstrap.js"></script>--%>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script language="JavaScript" src="http://cdn.staticfile.org/moment.js/2.24.0/moment.js"></script>
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<body style="background-image: url('/images/jimon_haru.jpg')">
<div style="width: 100%;height:160px;background-image: url('/images/bg23.png')">
    <h1 class="text-center text-primary">场地申请</h1>

</div>
<div style="height: 100%;width: 100%" id="app">
    <div class="container"
         style="margin-top: -60px;background:rgba(255,255,255,.2);height: 600px;box-shadow:5px 5px 8px 2px #666;">
        <img src="/static/images/sd1.png" class="position-absolute">
        <form class="container text-center" style="color: white;padding: 130px 0">
            <div class="row ">
                <div class="col-6"><h3>场地名：${field.fname}</h3></div>
                <div class="col-6"><h3>场地位置:${field.flocation}</h3></div>
            </div>
            <div class="row">
                <div class="col-6"><h3>场地费用：${field.flocation}</h3></div>
                <div class="col-6"><h3>场地负责人:${field.fhost}</h3></div>
            </div>
            <div class="row">
                <div class="col-6"><h3>场地负责人联系方式：${field.fhostcall}</h3></div>
            </div>
            <div style="margin-bottom: 30px">
                <p>
                <h3>选择时间段</h3></p>
<%--                <label style="display: block">--%>
<%--                    <span class="badge bg-danger">已有预约</span><h5--%>
<%--                        style="display: inline;margin-right: 30px;margin-left: 30px">9：00~10：00</h5><input--%>
<%--                        type="checkbox" name="time" value="0">--%>
<%--                </label>--%>
<%--                <label style="display: block">--%>
<%--                    <span class="badge bg-success">可预约</span><h5--%>
<%--                        style="display: inline;margin-right: 30px;margin-left: 30px">9：00~10：00</h5><input--%>
<%--                        type="checkbox" name="time" value="1">--%>
<%--                </label>--%>
                <label v-for="(time,index) in times" style="display: block">
                    <span class="badge bg-success">可预约</span> <h5
                        style="display: inline;margin-right: 30px;margin-left: 30px">{{time.fdtimeStart | formatTime}}~{{time.fdtimeEnd | formatTime}}</h5><input
                        type="checkbox" name="time" :value="time.fieldTimetableid">
                </label>
            </div>
            <button type="button" class="btn btn-primary" id="a" data-bs-toggle="modal" data-bs-target="#staticBackdrop">提交</button>
            <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title text-warning" id="staticBackdropLabel">注意</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <h4 class="text-dark">是否要申请该场地？</h4>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">关闭</button>
                            <button type="button" class="btn btn-primary">确认</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
<script>
    Vue.filter('formatTime',(t)=>moment(t,"HH:mm:ss").format('k:mm'))
    const app = new Vue({
        el: '#app',
        data() {
            return {
                fieldName: '',
                fieldLocation: '',
                fieldId: 0,
                fieldCost: '',
                fieldRent: 0,
                fieldHost: '',
                fieldHostCall: '',
                times: []
            }
        },
        methods: {
        },
        mounted() {
            this.fieldid=${field.fieldid}
                this.fieldName = '${field.fname}'
                    this.fieldLocation='${field.flocation}'
                        this.fieldHost='${field.fhost}'
                            this.fieldHostCall='${field.fhostcall}'
                                this.fieldRent=${field.frent}


            const params = new URLSearchParams();
            params.append('fieldid', this.fieldid);
                    axios.post('http://localhost:8080/field/getTimes',params).then(response=>{
                        const item = response.data
                        this.times=item
                    })

        }
    })
</script>
</body>
</html>