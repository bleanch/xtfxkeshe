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
                <legend>新增</legend>
                <div class="layui-field-box">
                    <form class="layui-form" action="addeva" method="post">
                        评价表id：<input type="text" name="eid"><br>
                        负责团队id：<input type="text" name="gid"><br>
                        客户id：<input type="text" name="uid"><br>
                        评价表内容：<input type="text" name="content"><br>
                        被评价的申请表id：<input type="text" name="aid"><br>
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button type="submit" class="layui-btn">添加</button>
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
