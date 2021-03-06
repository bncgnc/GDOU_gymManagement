<%--
  Created by IntelliJ IDEA.
  User: 56247
  Date: 2021/6/23
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户主界面</title>
</head>
<script src="https://cdn.bootcss.com/vue/2.5.22/vue.js"></script>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
<script language="JavaScript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script language="JavaScript" src="http://cdn.staticfile.org/moment.js/2.24.0/moment.js"></script>
<style>
    .active {
        color: red !important;
    }
</style>
<body style="background-image: url(${pageContext.request.contextPath}/images/jimon_haru.jpg)">
<div id="test" style="color: white">
    <h1 class="row-cols-3 offset-1">场馆公告:</h1>
    <list-item-post :posts="posts" class="offset-2"></list-item-post>
    <div class="container mt-3">
        <div class="row offset-2">
            <div class="col-4">
                <button :class="{active:nowQuery===0}" @click="changeState(0)" class="btn btn-dark">查询场地</button>
            </div>
            <div class="col-4">
                <button :class="{active:nowQuery===1}" @click="changeState(1)" class="btn btn-dark">查询器材</button>
            </div>
            <div class="col-4">
                <button :class="{active:nowQuery===2}" @click="changeState(2)" class="btn btn-dark">查询赛事</button>
            </div>
        </div>
        <div class="row text-center">
            <list-item-field v-show="nowQuery===0" :fields="fields"></list-item-field>
            <list-item-equipment v-show="nowQuery===1" :equipments="equipments"></list-item-equipment>
            <list-item-competition v-show="nowQuery===2" :competitions="competitions"></list-item-competition>
        </div>
        <div style="margin: 0 auto;width: 350px">
            <button class="btn btn-primary" @click="goPrev()">上一页</button>
            <span>共{{totalPage}}页,当前是第{{currentPage+1}}/{{totalPage}}页</span>
            <button class="btn btn-primary" @click="goNext()">下一页</button>
        </div>
        <button class="btn btn-danger" onclick="window.location.href='${pageContext.request.contextPath}/user/userApplication'">查询我的申请</button>

    </div>
</div>

<template id="ListItemField">
    <table class="table  table-striped table-hover">
        <thead class="table-dark">
        <tr style="font-size: 21px" class="text-info">
            <th scope="col">场地名</th>
            <th scope="col">场地位置</th>
            <th scope="col">场地负责人</th>
            <th scope="col">场地负责人电话</th>
            <th scope="col">场地收费</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="(field,index) in fields" :key="index" class="text-warning">
            <td>{{field.fieldName}}</td>
            <td>{{field.fieldLocation}}</td>
            <td>{{field.fieldHost}}</td>
            <td>{{field.fieldHostCall}}</td>
            <td>{{field.fieldRent}}</td>
            <td><a :href="'${pageContext.request.contextPath}/field/fieldApplication/'+field.fieldId">申请</a></td>
        </tr>
        </tbody>
    </table>
</template>

<template id="ListItemEquipment">
    <table class="table  table-striped table-hover">
        <thead class="table-dark">
        <tr style="font-size: 21px" class="text-info">
            <th scope="col">器材名</th>
            <th scope="col">器材数量</th>
            <th scope="col">器材租借费</th>
            <th scope="col">器材损坏费用</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="(equipment,index) in equipments" :key="index" class="text-warning">
            <td>{{equipment.equipmentName}}</td>
            <td>{{equipment.equipmentNum}}</td>
            <td>{{equipment.equipmentRent}}</td>
            <td>{{equipment.equipmentBreakPrice}}</td>
            <td>
                <a :href="'${pageContext.request.contextPath}/equipment/equipmentApplication/'+equipment.equipmentId">申请</a>
            </td>
        </tr>
        </tbody>
    </table>
</template>

<template id="ListItemCompetition">
    <div>
        <table class="table  table-striped table-hover">
            <thead class="table-dark">
            <tr style="font-size: 21px" class="text-info">
                <th scope="col">比赛名</th>
                <th scope="col">比赛裁判</th>

            </tr>
            </thead>
            <tbody>
            <tr v-for="(competition,index) in competitions" :key="index" class="text-warning">
                <td>{{competition.competitionName}}</td>
                <td>{{competition.competitionJudge}}</td>

            </tr>
            </tbody>
        </table>
        <button type="button" class="btn btn-primary"
                onclick="window.location.href='/competition/competitionApplication'">我要申请赛事
        </button>
    </div>
</template>



<template id="listItemPost">
    <div>
        <p v-for="(post,index) in posts" :key="index">
            <span>{{post.postMsg}}</span>
        </p>
    </div>
</template>
<script>
    Vue.component('ListItemField', {
        template: '#ListItemField',
        props: ['fields']
    })

    Vue.component('ListItemEquipment', {
        template: '#ListItemEquipment',
        props: ['equipments']
    })
    Vue.component('ListItemCompetition', {
        template: '#ListItemCompetition',
        props: ['competitions']
    })

    Vue.component('listItemPost', {
        template: '#listItemPost',
        props: ['posts']
    })
    const app = new Vue({
        el: '#test',
        data: {
            nowQuery: 0,
            currentPage: 0,
            totalPage: 3,
            fieldss: [],
            equipmentss: [],
            competitionss: [],
            posts: [{postMsg: '我是一条公告'}, {postMsg: '我是一条公告'}, {postMsg: '我是一条公告'}]
        },
        computed: {
            nextPage() {
                return (this.currentPage + 1) % this.totalPage
            },
            prePage() {
                return (this.currentPage - 1 + this.totalPage) % this.totalPage
            },
            fields() {
                return this.fieldss.filter((item, index) => {
                    if (this.currentPage < this.totalPage)
                        return index >= this.currentPage * 2 && index < (this.currentPage + 1) * 2
                })
            },
            equipments() {
                return this.equipmentss.filter((item, index) => {
                    if (this.currentPage < this.totalPage)
                        return index >= this.currentPage * 2 && index < (this.currentPage + 1) * 2
                })
            },
            competitions() {
                return this.competitionss.filter((item, index) => {
                    if (this.currentPage < this.totalPage)
                        return index >= this.currentPage * 2 && index < (this.currentPage + 1) * 2
                })
            },

        }
        ,
        methods: {
            getFieldData() {
                axios.get('${pageContext.request.contextPath}/field/getFields').then(response => {
                    const result = response.data
                    const fields = result.map(item => ({
                        fieldId: item.fieldid,
                        fieldName: item.fname,
                        fieldHost: item.fhost,
                        fieldHostCall: item.fhostcall,
                        fieldLocation: item.flocation,
                        fieldRent: item.frent
                    }))
                    this.fieldss = fields
                    this.totalPage = Math.ceil(fields.length / 2)
                })

            },
            getEquipmentData() {
                axios.get('${pageContext.request.contextPath}/equipment/getEquipments').then(response => {
                    const result = response.data
                    const equipments = result.map(item => ({
                        equipmentId: item.equipmentid,
                        equipmentName: item.ename,
                        equipmentRent: item.erent,
                        equipmentBreakPrice: item.ebreakprice,
                        equipmentNum: item.enums

                    }))
                    this.equipmentss = equipments
                })
            },
            getCompetitionData() {
                axios.get('${pageContext.request.contextPath}/competition/getCompetitions').then(response => {
                    const result = response.data
                    const competitions = result.map(item => ({
                        competitionId: item.competitionid,
                        competitionName: item.cname,
                        competitionJudge: item.cjudge,


                    }))
                    this.competitionss = competitions
                })
            },
            getPersonApplication() {

            },
            changeState(index) {
                this.nowQuery = index
                this.currentPage = 0
                switch (index) {
                    case 0:
                        this.totalPage = Math.ceil(this.fieldss.length / 2)
                        break;
                    case 1:
                        this.totalPage = Math.ceil(this.equipmentss.length / 2)
                        break;
                    case 2:
                        this.totalPage = Math.ceil(this.competitionss.length / 2)
                        break;
                    case 3:
                        this.totalPage = Math.ceil(this.applicationss.length / 2)
                }
            },
            goPrev() {
                this.currentPage = this.prePage
            },
            goNext() {
                this.currentPage = this.nextPage
            }
        },
        mounted() {
            this.getFieldData()
            this.getEquipmentData()
            this.getCompetitionData()

        }
    })

</script>
</body>
</html>