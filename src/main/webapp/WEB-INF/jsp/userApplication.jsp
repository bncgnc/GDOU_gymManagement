<%--
  Created by IntelliJ IDEA.
  User: 56247
  Date: 2021/6/27
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户个人预约页面</title>
</head>
<script src="https://cdn.bootcss.com/vue/2.5.22/vue.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script language="JavaScript" src="http://cdn.staticfile.org/moment.js/2.24.0/moment.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
<style>
    .active:hover{
        cursor: pointer;
    }
    .nav-link:hover{
        cursor: pointer;
    }
    a:hover{
        cursor: pointer!important;
    }
</style>
<body style="background-image: url(${pageContext.request.contextPath}/images/bg4.jpg)">
<div id="app" class="container text-center">
    <h1 class="text-warning">查询个人申请</h1>
    <div>
        <ul class="nav nav-pills">
            <li class="nav-item">
                <a class="nav-link" :class="{active:nowQuery===0}" @click.prevent="changeState(0)">场地申请</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" :class="{active:nowQuery===1}" @click.prevent="changeState(1)">器材申请</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" :class="{active:nowQuery===2}" @click.prevent="changeState(2)">赛事申请</a>
        </ul>
    </div>
    <list-item-field v-show="nowQuery===0" :fieldpage="fieldpage" @deletefield="deletefield"></list-item-field>
    <list-item-equipment v-show="nowQuery===1" :equipmentpage="equipmentpage" @deleteequipment="deleteequipment"></list-item-equipment>
    <list-item-competition v-show="nowQuery===2" :competitionpage="competitionpage" @deletecompetition="deletecompetition"></list-item-competition>
    <div style="margin: 0 auto;width: 350px">
        <button class="btn btn-primary" @click="goPrev()">上一页</button>
        <span>共{{totalPage}}页,当前是第{{currentPage+1}}/{{totalPage}}页</span>
        <button class="btn btn-primary" @click="goNext()">下一页</button>
    </div>
</div>

<template id="ListItemField">
    <table class="table table-light  table-striped table-hover">
        <thead class="table-dark">
        <tr style="font-size: 21px" class="text-light">
            <th scope="col">场地名</th>
            <th scope="col">预约日期</th>
            <th scope="col">预约时间</th>
            <th scope="col">审核状态</th>
            <th scope="col">场地负责人电话</th>
            <th scope="col">场地收费</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="(field,index) in fieldpage" :key="index" class="text-dark">
            <td>{{field.name}}</td>
            <td>{{field.date}}</td>
            <td>{{field.start | formatTime}}~{{field.end | formatTime}}</td>
            <td v-if="field.ispermit===0" class="text-danger">正在审核</td>
            <td v-else class="text-success">审核通过</td>
            <td>{{field.hostcall}}</td>
            <td>{{field.rent}}</td>
            <td><a @click.prevent="deletefield(field.id)" style="color: #0a53be">删除</a></td>
        </tr>
        </tbody>
    </table>
</template>
<template id="ListItemEquipment">
    <table class="table table-light  table-striped table-hover">
        <thead class="table-dark">
        <tr style="font-size: 21px" class="text-light">
            <th scope="col">器材名</th>
            <th scope="col">预约天数</th>
            <th scope="col">预约数量</th>
            <th scope="col">预约价格</th>
            <th scope="col">总共价格</th>
            <th scope="col">审核状态</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody>
                <tr v-for="(equipment,index) in equipmentpage" :key="index" class="text-dark">
                    <td>{{equipment.name}}</td>
                    <td>{{equipment.time}}</td>
                    <td>{{equipment.num}}</td>
                    <td>{{equipment.rent}}元</td>
                    <td>{{equipment.rent*equipment.num}}元</td>
                    <td v-if="equipment.ispermit===0" class="text-danger">正在审核</td>
                    <td v-else class="text-success">审核通过</td>
                    <td><a @click.prevent="deleteequipment(equipment.id)" style="color: #0a53be">删除</a>
                        <a :href="'${pageContext.request.contextPath}/user/updateApplicationEquipment/'+equipment.id">修改</a>
                    </td>
                </tr>
        </tbody>
    </table>
</template>
<template id="ListItemCompetition">
    <table class="table table-light  table-striped table-hover">
        <thead class="table-dark">
        <tr style="font-size: 21px" class="text-light">
            <th scope="col">赛事名</th>
            <th scope="col">赛事日期</th>
            <th scope="col">赛事时间</th>
            <th scope="col">裁判</th>
            <th scope="col">使用场地</th>
            <th scope="col">使用器材</th>
            <th scope="col">审核状态</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody>
                <tr v-for="(competition,index) in competitionpage" :key="index" class="text-dark">
                    <td>{{competition.name}}</td>
                    <td>{{competition.date}}</td>
                    <td>{{competition.start | formatTime}}~{{competition.end | formatTime}}</td>
                    <td>{{competition.judge}}</td>
                    <td>{{competition.fname}}</td>
                    <td>{{competition.ename}}</td>
                    <td v-if="competition.ispermit===0" class="text-danger">正在审核</td>
                    <td v-else class="text-success">审核通过</td>
                    <td><a @click.prevent="deletecompetition(competition.id)" style="color: #0a53be">删除</a>
                        <a :href="'${pageContext.request.contextPath}/user/updateApplicationCompetition/'+competition.id">修改</a>
                    </td>
                </tr>
        </tbody>
    </table>
</template>
<script>
    Vue.filter('formatTime',(t)=>moment(t,"HH:mm:ss").format('k:mm'))

    Vue.component('ListItemField', {
        template: '#ListItemField',
        props: ['fieldpage'],
        methods: {
            deletefield(id) {
                this.$emit('deletefield',id)
            }
        }
    })

    Vue.component('ListItemEquipment', {
        template: '#ListItemEquipment',
        props: ['equipmentpage'],
        methods:{
            deleteequipment(id){
                this.$emit('deleteequipment',id)
            }
        }
    })
    Vue.component('ListItemCompetition', {
        template: '#ListItemCompetition',
        props: ['competitionpage'],
        methods:{
            deletecompetition(id){
                this.$emit('deletecompetition',id)
            }
        }
    })
    const app = new Vue({
        el:'#app',
        data:{

                nowQuery:0,
                fields:[],
                equipments:[],
                competitions:[],
                currentPage:0,
                totalPage:0,

        },
        methods:{
            goPrev() {
                this.currentPage = this.prePage
            },
            goNext() {
                this.currentPage = this.nextPage
            },
            deletefield(id){
                let s = window.confirm("确认删除吗？")
                if(s===true){
                    const params = new URLSearchParams();
                    params.append('id',id)
                    axios.post('${pageContext.request.contextPath}/user/deleteApplicateField',params).then(response=>{
                        const state = response.data
                        setTimeout(()=>{
                            if(state===0){
                               alert("删除失败,该场地已经被某个比赛使用，请先删除比赛！")
                            }
                            if(state===1){
                                alert("删除成功")
                                this.fields=this.fields.filter(field=>field.id!==id)
                                this.changeState(this.nowQuery)
                            }
                        },1666)
                    })

                }
            },
            deleteequipment(id){
                let s = window.confirm("确认删除吗？")
                if(s===true){
                    const params = new URLSearchParams();
                    params.append('id',id)
                    axios.post('${pageContext.request.contextPath}/user/deleteApplicateEquipment',params).then(response=>{
                        const state = response.data
                        setTimeout(()=>{
                            if(state===0){
                                alert("删除失败,该器材已经被某个比赛使用，请先删除比赛！")
                            }
                            if(state===1){
                                alert("删除成功")
                                this.equipments=this.equipments.filter(eq=>eq.id!==id)
                                this.changeState(this.nowQuery)
                            }
                        },1666)
                    })

                }
            },
            deletecompetition(id){
                let s = window.confirm("确认删除吗？")
                if(s===true){
                    const params = new URLSearchParams();
                    params.append('id',id)
                    axios.post('${pageContext.request.contextPath}/user/deleteApplicateCompetition',params).then(response=>{
                        setTimeout(()=>{
                                alert("删除成功")
                                this.competitions=this.competitions.filter(cp=>cp.id!==id)
                                this.changeState(this.nowQuery)

                        },1666)
                    })

                }

            },
            changeState(index) {
                this.nowQuery = index
                this.currentPage = 0
                switch (index) {
                    case 0:
                        this.totalPage = Math.ceil(this.fields.length / 4)
                        break;
                    case 1:
                        this.totalPage = Math.ceil(this.equipments.length / 4)
                        break;
                    case 2:
                        this.totalPage = Math.ceil(this.competitions.length / 4)
                        break;
                }
            },
            getApplicationField(){
                axios.get('${pageContext.request.contextPath}/user/getApplicationField').then(response=>{
                    const data = response.data
                    const fields = data.map(item => ({
                        name: item.fname,
                        date: item.fapdate,
                        ispermit: item.fapermit,
                        start: item.fdtimeStart,
                        end: item.fdtimeEnd,
                        id: item.fieldApplicationid,
                        hostcall: item.fHostCall,
                        rent: item.frent,
                    }))
                    this.fields=fields
                    this.totalPage = Math.ceil(fields.length / 4)
                })
            },
            getApplicationCompetition(){
                axios.get('${pageContext.request.contextPath}/user/getApplicationCompetition').then(response=>{
                    const data = response.data
                    const competitions = data.map(item => ({
                        fname: item.fname,
                        start: item.start,
                        end: item.end,
                        id: item.competitionid,
                        ename: item.equipmentname,
                        name: item.competitionname,
                        judge: item.judgename,
                        ispermit: item.isPermit,
                        date: item.date,
                    }))
                    this.competitions=competitions
                })
            },
            getApplicationEquipment(){
                axios.get('${pageContext.request.contextPath}/user/getApplicationEquipment').then(response=>{
                    const data = response.data
                    const equipments = data.map(item => ({
                        id: item.equipmentApplicationid,
                        num: item.eanum,
                        ispermit: item.eapermit,
                        name: item.ename,
                        rent: item.erent,
                        iebreakpriced: item.ebreakprice,
                        time:item.eaplantime
                    }))
                    this.equipments=equipments
                })
            },
        },
        computed:{
            nextPage() {
                return (this.currentPage + 1) % this.totalPage
            },
            prePage() {
                return (this.currentPage - 1 + this.totalPage) % this.totalPage
            },
            fieldpage(){
                return this.fields.filter((item, index) => {
                    if (this.currentPage < this.totalPage)
                        return index >= this.currentPage * 4 && index < (this.currentPage + 1) * 4
                })
            },
            equipmentpage(){
                return this.equipments.filter((item, index) => {
                    if (this.currentPage < this.totalPage)
                        return index >= this.currentPage * 4 && index < (this.currentPage + 1) * 4
                })
            },
            competitionpage(){
                return this.competitions.filter((item, index) => {
                    if (this.currentPage < this.totalPage)
                        return index >= this.currentPage * 4 && index < (this.currentPage + 1) * 4
                })
            }
        },
        mounted(){
            this.getApplicationField()
            this.getApplicationEquipment()
            this.getApplicationCompetition()
        }
    })
</script>
</body>
</html>
