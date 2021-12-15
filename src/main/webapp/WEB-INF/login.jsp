<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="../layui/css/layui.css" media="all" />
    <link rel="stylesheet" type="text/css" href="../css/login.css" />
</head>
<body class="beg-login-bg">
<div class="beg-login-box">
    <header>
        <h1>后台管理系统</h1>
    </header>
    <div class="beg-login-main">
        <form action="login" class="layui-form" method="post">
            <div class="layui-form-item">
                <label class="beg-login-icon">
                    <i class="layui-icon">&#xe612;</i>
                </label>
                <input type="text" lay-verify="required" name="acc" autocomplete="off" placeholder="这里输入账号" class="layui-input" lay-verType="tips">
            </div>
            <div class="layui-form-item">
                <label class="beg-login-icon">
                    <i class="layui-icon">&#xe642;</i>
                </label>
                <input type="password" lay-verify="required" name="pwd" autocomplete="off" placeholder="这里输入密码" class="layui-input" lay-verType="tips">
            </div>
            <div class="layui-form-item">
                <div class="beg-pull">
                    <button type="submit" class="layui-btn layui-btn-normal" style="width:100%;">
                        登　　录
                    </button>
                </div>
            </div>
        </form>
    </div>
    <footer>
        <p>2021 东北林业大学系统分析课设 © </p>
    </footer>
</div>
<script type="text/javascript" src="../javascript/jquery.min.js"></script>
<script type="text/javascript" src="../layui/layui.js"></script>
<script type="text/javascript" src="../javascript/login.js"></script>
</body>
</html>
