<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>后台页面</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link rel="stylesheet" href="../css/global.css">
    <link rel="stylesheet" href="../icheck/minimal/red.css">
    <style>
        .hid{
            display: none;
        }
    </style>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <%@include file="/WEB-INF/header.jsp"%>
    </div>

    <div class="layui-side layui-bg-black">
        <%@include file="/WEB-INF/side.jsp"%>
    </div>

    <div id="1" class="layui-body cont">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <fieldset class="layui-elem-field">
                <legend>客户管理 - 客户列表</legend>
                <div class="layui-field-box">
                    <form class="layui-form" action="finduser" method="post">
                        <div class="layui-form-item" style="text-align:center;">
                            <div class="layui-inline">
                                <div class="layui-input-inline">
                                        <input autocomplete="off" class="layui-input" placeholder="请输入编号" type="text" name="id">
                                </div>
                            </div>
                            <div class="layui-inline" style="text-align:left;">
                                    <div class="layui-input-inline">
                                        <button type="submit" class="layui-btn"><i class="layui-icon">&#xe615;</i>查询</button>
                                    </div>
                            </div>
                        </div>
                    </form>
                    <hr>
                    <div class="layui-btn-group">
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/adduser2.jsp"
                                dw-title="新增">
                            <i class="layui-icon">&#xe61f;</i>新增
                        </button>
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/updateuser2.jsp"
                                dw-title="编辑">
                            <i class="layui-icon">&#xe642;</i>编辑
                        </button>
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/deleteuser2.jsp"
                                dw-title="删除">
                            <i class="layui-icon">&#xe640;</i>删除
                        </button>
                        <button class="layui-btn layui-btn-xs dw-refresh">
                            <i class="layui-icon">&#x1002;</i>刷新
                        </button>
                    </div>
                    <hr>
                    <table class="layui-table">
                        <colgroup>
                            <col width="150">
                            <col width="150">
                            <col width="200">
                            <col>
                            <col>
                        </colgroup>
                        <thead>
                        <tr>
                            <th>客户id</th>
                            <th>客户名</th>
                            <th>客户账号</th>
                            <th>客户地址</th>
                            <th>客户密码</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${users}" var="u">
                        <tr>
                            <td>${u.id}</td>
                            <td>${u.name}</td>
                            <td>${u.acc}</td>
                            <td>${u.addr}</td>
                            <td>${u.pwd}</td>
                        </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </fieldset>
        </div>
    </div>
    <div id="2" class="layui-body cont hid">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <fieldset class="layui-elem-field">
                <legend>团队管理 - 团队列表</legend>
                <div class="layui-field-box">
                    <form class="layui-form" action="findgroup" method="post">
                        <div class="layui-form-item" style="text-align:center;">
                            <div class="layui-inline">
                                <div class="layui-input-inline">
                                    <input autocomplete="off" class="layui-input" placeholder="请输入编号" type="text" name="gid">
                                </div>
                            </div>
                            <div class="layui-inline" style="text-align:left;">
                                <div class="layui-input-inline">
                                    <button type="submit" class="layui-btn"><i class="layui-icon">&#xe615;</i>查询</button>
                                </div>
                            </div>
                        </div>
                    </form>
                    <hr>
                    <div class="layui-btn-group">
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/addgroup2.jsp"
                                dw-title="新增">
                            <i class="layui-icon">&#xe61f;</i>新增
                        </button>
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/updategroup2.jsp"
                                dw-title="编辑">
                            <i class="layui-icon">&#xe642;</i>编辑
                        </button>
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/deletegroup2.jsp"
                                dw-title="删除">
                            <i class="layui-icon">&#xe640;</i>删除
                        </button>
                        <button class="layui-btn layui-btn-xs dw-refresh">
                            <i class="layui-icon">&#x1002;</i>刷新
                        </button>
                    </div>
                    <hr>
                    <table class="layui-table">
                        <colgroup>
                            <col width="150">
                            <col width="150">
                            <col width="200">
                            <col>
                            <col>
                        </colgroup>
                        <thead>
                        <tr>
                            <th>团队id</th>
                            <th>团队队长id</th>
                            <th>团队名</th>
                            <th>团队人数</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${groups}" var="g">
                            <tr>
                                <td>${g.gid}</td>
                                <td>${g.lid}</td>
                                <td>${g.name}</td>
                                <td>${g.num}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </fieldset>
        </div>
    </div>
    <div id="3" class="layui-body cont hid">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <fieldset class="layui-elem-field">
                <legend>团队管理 - 团队成员列表</legend>
                <div class="layui-field-box">
                    <form class="layui-form" action="findmem" method="post">
                        <div class="layui-form-item" style="text-align:center;">
                            <div class="layui-inline">
                                <div class="layui-input-inline">
                                    <input autocomplete="off" class="layui-input" placeholder="请输入编号" type="text" name="mid">
                                </div>
                            </div>
                            <div class="layui-inline" style="text-align:left;">
                                <div class="layui-input-inline">
                                    <button type="submit" class="layui-btn"><i class="layui-icon">&#xe615;</i>查询</button>
                                </div>
                            </div>
                        </div>
                    </form>
                    <hr>
                    <div class="layui-btn-group">
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/addmem2.jsp"
                                dw-title="新增">
                            <i class="layui-icon">&#xe61f;</i>新增
                        </button>
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/updatemem2.jsp"
                                dw-title="编辑">
                            <i class="layui-icon">&#xe642;</i>编辑
                        </button>
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/deletemem2.jsp"
                                dw-title="删除">
                            <i class="layui-icon">&#xe640;</i>删除
                        </button>
                        <button class="layui-btn layui-btn-xs dw-refresh">
                            <i class="layui-icon">&#x1002;</i>刷新
                        </button>
                    </div>
                    <hr>
                    <table class="layui-table">
                        <colgroup>
                            <col width="150">
                            <col width="150">
                            <col width="200">
                            <col>
                            <col>
                        </colgroup>
                        <thead>
                        <tr>
                            <th>成员id</th>
                            <th>成员名</th>
                            <th>团队id</th>
                            <th>成员账户</th>
                            <th>成员密码</th>
                            <th>成员职务</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${members}" var="m">
                            <tr>
                                <td>${m.mid}</td>
                                <td>${m.name}</td>
                                <td>${m.gid}</td>
                                <td>${m.acc}</td>
                                <td>${m.pwd}</td>
                                <c:set var="mp" value="${m.duty}"/>
                                    <c:if test="${mp==1}">
                                        <td>组长</td>
                                    </c:if>
                                    <c:if test="${mp!=1}">
                                        <td>组员</td>
                                    </c:if>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </fieldset>
        </div>
    </div>
    <div id="4" class="layui-body cont hid">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <fieldset class="layui-elem-field">
                <legend>申请订单- 申请列表</legend>
                <div class="layui-field-box">
                    <form class="layui-form" action="findapl" method="post">
                        <div class="layui-form-item" style="text-align:center;">
                            <div class="layui-inline">
                                <div class="layui-input-inline">
                                    <input autocomplete="off" class="layui-input" placeholder="请输入编号" type="text" name="fid">
                                </div>
                            </div>
                            <div class="layui-inline" style="text-align:left;">
                                <div class="layui-input-inline">
                                    <button type="submit" class="layui-btn"><i class="layui-icon">&#xe615;</i>查询</button>
                                </div>
                            </div>
                        </div>
                    </form>
                    <hr>
                    <div class="layui-btn-group">
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/updateapl2.jsp"
                                dw-title="更新">
                            <i class="layui-icon">&#xe61f;</i>任务派发
                        </button>
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/deleteapl2.jsp"
                                dw-title="删除">
                            <i class="layui-icon">&#xe640;</i>删除
                        </button>
                        <button class="layui-btn layui-btn-xs dw-refresh">
                            <i class="layui-icon">&#x1002;</i>刷新
                        </button>
                    </div>
                    <hr>
                    <table class="layui-table">
                        <colgroup>
                            <col width="150">
                            <col width="150">
                            <col width="200">
                            <col>
                            <col>
                        </colgroup>
                        <thead>
                        <tr>
                            <th>申请表id</th>
                            <th>申请表名</th>
                            <th>客户id</th>
                            <th>优先级</th>
                            <th>负责团队id</th>
                            <th>是否处理</th>
                            <th>申请日期</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${apls}" var="a">
                            <tr>
                                <td>${a.fid}</td>
                                <td>${a.fname}</td>
                                <td>${a.uid}</td>
                                <td>${a.propity}</td>
                                <td>${a.gid}</td>
                                <c:set var="ap" value="${a.pid}"/>
                                  <c:if test="${ap==1}">
                                    <td>已处理</td>
                                  </c:if>
                                  <c:if test="${ap!=1}">
                                    <td>未处理</td>
                                  </c:if>
                                <td>${a.datetime}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </fieldset>
        </div>
    </div>
    <div id="5" class="layui-body cont hid">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <fieldset class="layui-elem-field">
                <legend>项目评价- 评价列表</legend>
                <div class="layui-field-box">
                    <form class="layui-form" action="findeva" method="post">
                        <div class="layui-form-item" style="text-align:center;">
                            <div class="layui-inline">
                                <div class="layui-input-inline">
                                    <input autocomplete="off" class="layui-input" placeholder="请输入编号" type="text" name="eid">
                                </div>
                            </div>
                            <div class="layui-inline" style="text-align:left;">
                                <div class="layui-input-inline">
                                    <button type="submit" class="layui-btn"><i class="layui-icon">&#xe615;</i>查询</button>
                                </div>
                            </div>
                        </div>
                    </form>
                    <hr>
                    <div class="layui-btn-group">
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/addeva2.jsp"
                                dw-title="新增">
                            <i class="layui-icon">&#xe61f;</i>新增
                        </button>
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="../jsp/deleteeva2.jsp"
                                dw-title="删除">
                            <i class="layui-icon">&#xe640;</i>删除
                        </button>
                        <button class="layui-btn layui-btn-xs dw-refresh">
                            <i class="layui-icon">&#x1002;</i>刷新
                        </button>
                    </div>
                    <hr>
                    <table class="layui-table">
                        <colgroup>
                            <col width="150">
                            <col width="150">
                            <col width="200">
                            <col>
                            <col>
                        </colgroup>
                        <thead>
                        <tr>
                            <th>评价表id</th>
                            <th>负责团队id</th>
                            <th>客户id</th>
                            <th>评价内容</th>
                            <th>评价等级</th>
                            <th>申请表id</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${evas}" var="e">
                            <tr>
                                <td>${e.eid}</td>
                                <td>${e.gid}</td>
                                <td>${e.uid}</td>
                                <td>${e.content}</td>
                                <td>${e.grade}</td>
                                <td>${e.aid}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </fieldset>
        </div>
    </div>
    <div class="layui-footer">
        <!-- 底部固定区域 -->
        2021系统分析课设
    </div>
</div>
<script type="text/javascript" src="../javascript/jquery.min.js"></script>
<script type="text/javascript" src="../layui/layui.js"></script>
<script type="text/javascript" src="../icheck/icheck.js"></script>
<script type="text/javascript" src="../javascript/dw.js"></script>
<script type="text/javascript">
    let n='<%=request.getParameter("n")%>'
    if(n==1){
        $(".cont").css("display","none");
        $("#1").css("display","block");
    }
    if(n==2){
        $(".cont").css("display","none");
        $("#2").css("display","block");
    }
    if(n==3){
        $(".cont").css("display","none");
        $("#3").css("display","block");
    }
    if(n==4){
        $(".cont").css("display","none");
        $("#4").css("display","block");
    }
    if(n==5){
        $(".cont").css("display","none");
        $("#5").css("display","block");
    }
</script>
</body>
</html>
