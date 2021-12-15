<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<base href="/">
<head>
    <meta charset="UTF-8">
    <title>新增</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
</head>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-col-lg12">
            <fieldset class="layui-elem-field">
                <legend>修改</legend>
                <div class="layui-field-box">
                    <form class="layui-form" action="deleteapl" method="post">
                        id：<input type="text" name="fid"><br>
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button type="submit" class="layui-btn">删除</button>
                                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                            </div>
                        </div>
                    </form>
                </div>
            </fieldset>
        </div>
    </div>
</div>
<script type="text/javascript" src="../javascript/jquery.min.js"></script>
<script type="text/javascript" src="../layui/layui.js"></script>
<script type="text/javascript" src="../javascript/dw_form_submit.js"></script>
</body>
</html>
