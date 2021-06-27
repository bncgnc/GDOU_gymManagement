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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script language="JavaScript" src="http://cdn.staticfile.org/moment.js/2.24.0/moment.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
<body style="background-image: url(${pageContext.request.contextPath}/images/jimon_haru.jpg)">
<div style="width: 100%;height:160px;background-image: url(${pageContext.request.contextPath}/images/bg3.png)">
    <h1 class="text-center text-primary">比赛申请</h1>

</div>
<div id="app" style="height: 100%;width: 100%">
    <div class="container" style="margin-top: -60px;background:rgba(255,255,255,.2);height: 600px;box-shadow:5px 5px 8px 2px #666;" >
        <img src="${pageContext.request.contextPath}/images/sd3.png" class="position-absolute">
        <form class="container text-center" style="color: white;padding: 130px 0">
            <div class="row">
                <div class="col-6"><h3 style="display: inline">比赛名：</h3>
                    <label>
                        <input v-model="competitionname" type="text" class="form-control" style="width: 120px;display: inline">
                    </label>
                </div>
                <div class="col-6"><h3 style="display: inline">裁判:</h3>
                    <label>
                        <input v-model="judgename" type="text" class="form-control" style="width: 120px;display: inline">
                    </label>
                </div>
            </div>


            <div style="margin-bottom: 30px" class="row">
                <div class="col-6">
                    <p><h3>选择比赛场地</h3></p>
                    <label style="display: block" class="form-label">
                        <span>场地：</span><select class="form-select" v-model="nowSelectField" style="width: 300px;display: inline">
                        <option selected value="0">选择场地</option>
<%--                        <option value="1">One</option>--%>
<%--                        <option value="2">Two</option>--%>
<%--                        <option value="3">Three</option>--%>
                        <option :value="field.fieldid" v-for="(field,index) in simpleField" :key="field.fieldid">{{field.fieldName}}</option>
                    </select>
                    </label>
                </div>
                <div class="col-6">
                    <p><h3>选择比赛时间</h3></p>
                    <label style="display: block" class="form-label">
                        <span>场地：</span><select class="form-select" v-model="nowSelectFieldApplication"  style="width: 300px;display: inline">
                        <option selected>选择时间</option>
<%--                        <option value="1">One</option>--%>
<%--                        <option value="2">Two</option>--%>
<%--                        <option value="3">Three</option>--%>
                        <option v-if="field.fieldid===nowSelectField" :value="field.fieldApplicationid" v-for="(field,index) in fields">{{field.start | formatTime}}~{{field.end | formatTime}}</option>
                    </select>
                    </label>
                </div>
            </div>
            <div style="margin-bottom: 30px">
                <p><h3>选择比赛器材</h3></p>
                <label style="display: block" class="form-label">
                    <span>器材：</span><select class="form-select" v-model="nowSelectEquipment" style="width: 300px;display: inline">
                    <option selected value="0">选择器材</option>
<%--                    <option value="1">One</option>--%>
<%--                    <option value="2">Two</option>--%>
                    <option :value="equipment.equipmentApplicationid" v-for="(equipment,index) in equipments" :key="equipment.equipmentApplicationid">{{equipment.ename}}------{{equipment.eanum}}个</option>
                </select>
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
                            <h4 class="text-dark">是否要申请比赛？</h4>
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
    Vue.filter('formatTime',(t)=>moment(t,"HH:mm:ss").format('k:mm'))
    const app = new Vue({
        el:'#app',
        data(){
            return{
                nowSelectField:0,
                nowSelectFieldApplication:0,
                fields:[],
                nowSelectEquipment:0,
                equipments:[],
                judgename:'',
                competitionname:'',
                }

            },
        methods:{
            getSimpleField(){
                const params = new URLSearchParams();
                <%--params.append("userid",${user.userid})--%>
                params.append("userid","201811701316")
                axios.post('${pageContext.request.contextPath}/competition/getSimpleField',params).then(response=>{
                    const items = response.data
                    this.fields = items.map(item=>({
                        fieldid:item.fieldid,
                        fieldTimeid:item.fieldTimetableid,
                        fieldName:item.fname,
                        fapdate:item.fapdate,
                        start:item.fdtimeStart,
                        end:item.fdtimeEnd,
                        fieldApplicationid:item.fieldApplicationid,
                    }))
                })
            },
            getSimpleEquipment(){
                const params = new URLSearchParams();
                <%--params.append("userid",${user.userid})--%>
                params.append("userid","201811701316")
                axios.post('${pageContext.request.contextPath}/competition/getPermitEquipment',params).then(response=>{
                    const items = response.data
                    this.equipments = items.map(item=>({
                        equipmentApplicationid:item.equipmentApplicationid,
                        ename:item.ename,
                        equipmentid:item.equipmentid,
                        eanum:item.eanum,
                    }))
                })
            },
            doApplication(){
                    const params = new URLSearchParams();
                    params.append('equipmentApplicationid',this.nowSelectEquipment)
                    params.append("fieldApplicationid",this.nowSelectFieldApplication)
                    params.append("judge",this.judgename)
                    params.append("cname",this.competitionname)
                    axios.post('${pageContext.request.contextPath}/competition/applicateCompetition',params).then(response=>{
                        const url = response.data
                        setTimeout(()=>{
                            alert("预约成功")
                            window.location.href = '${pageContext.request.contextPath}'+url
                        },1666)
                    })
            }
        },
        mounted(){
            this.getSimpleField()
            this.getSimpleEquipment()
        },
        computed:{
            simpleField(){
                const map = new Map()
                // 去重
                return this.fields.filter((item)=>!map.has(item.fieldid) && map.set(item.fieldid,1))
            },
/*            simpleEquipment(){
                const map = new Map()
                // 去重
                return this.equipments.filter((item)=>!map.has(item.equipmentid) && map.set(item.equipmentid,1))
            }*/
        }

    })
</script>
</body>
</html>