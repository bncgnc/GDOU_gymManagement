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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script language="JavaScript" src="http://cdn.staticfile.org/moment.js/2.24.0/moment.js"></script>
<body style="background-image: url(${pageContext.request.contextPath}/images/jimon_haru.jpg)">
<div style="width: 100%;height:160px;background-image: url(${pageContext.request.contextPath}/images/bg2.png)">
    <h1 class="text-center text-primary">器材申请</h1>

</div>
<div style="height: 100%;width: 100%" id="app">
    <div class="container" style="margin-top: -60px;background:rgba(255,255,255,.2);height: 600px;box-shadow:5px 5px 8px 2px #666;" >
        <img src="${pageContext.request.contextPath}/images/sd2.png" class="position-absolute">
        <form class="container text-center" style="color: white;padding: 130px 0">
            <div class="row">
                <div class="col-6"><h3>器材名：{{equipmentName}}</h3></div>
                <div class="col-6"><h3>器材数量:{{canRent}}/{{equipmentNum}}</h3></div>
            </div>
            <div class="row">
                <div class="col-6"><h3>租借价格：{{equipmentRent}}</h3></div>
                <div class="col-6"><h3>损坏赔偿价格:{{equipmentBreakPrice}}</h3></div>
            </div>

            <div style="margin-bottom: 30px">
                <p><h3>选择租借天数</h3></p>
                <label style="display: block" class="form-label">
                    <span>租借天数：</span><input type="number" v-model="rentTime" class="form-control" style="width: 80px;display: inline">
                </label>
            </div>

            <div style="margin-bottom: 30px">
                <p><h3>选择租借数量</h3></p>
                <label style="display: block" class="form-label">
                    <span>租借数量：</span><input type="number" v-model="rentNum" class="form-control" style="width: 80px;display: inline">
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
                            <h4 class="text-dark">是否要申请该器材？</h4>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">关闭</button>
                            <button type="button" class="btn btn-primary" @click="doApplication()">确认</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
<script>
    const app = new Vue({
        el:'#app',
        data(){
            return {
                rentNum:1,
                equipmentName:'',
                equipmentId: 0,
                equipmentRent: 0,
                equipmentBreakPrice: 0,
                equipmentNum:0,
                rentTime:1,
                canRent:0
            }
        },
        watch:{
            rentNum(val,oldv){
                if(val>this.canRent){
                    alert("超过数量")
                    this.rentNum=oldv
                }
                if(val<1){
                    alert("数量不小于1")
                    this.rentNum=oldv
                }
            },
            rentTime(val,oldv){
                if(val<1){
                    alert("天数不小于1")
                    this.rentTime=oldv
                }
            }
        },
        methods:{
            doApplication() {
                const params = new URLSearchParams();
                params.append("equipmentid",this.equipmentId)
                params.append("num",this.rentNum)
                params.append("time",this.rentTime)
                axios.post('${pageContext.request.contextPath}/equipment/applicateEquipment',params).then(response=>{
                    const url = response.data
                    setTimeout(()=>{
                        alert("预约成功")
                        window.location.href = '${pageContext.request.contextPath}'+url
                    },1666)
                })
            }
        },
        mounted(){
            this.equipmentNum=${equipment.enums}
            this.equipmentId=${equipment.equipmentid}
            this.equipmentRent=${equipment.erent}
            this.equipmentBreakPrice=${equipment.ebreakprice}
            this.equipmentName='${equipment.ename}'
            const params = new URLSearchParams();
            params.append('equipmentid',this.equipmentId)
            axios.post('${pageContext.request.contextPath}/equipment/getCanRent',params).then(response=>{
                const item = response.data
                this.canRent=item || this.equipmentNum
            })
        }
    })
</script>
</body>
</html>