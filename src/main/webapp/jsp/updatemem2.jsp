<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<base href="/">
<head>
    <meta charset="UTF-8">
    <title>修改</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
</head>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-col-lg12">
            <fieldset class="layui-elem-field">
                <legend>修改</legend>
                <div class="layui-field-box">
                    <form class="layui-form" action="updatemem" method="post">
                        成员id：<input type="text" name="mid"><br>
                        所属团队id：<input type="text" name="gid"><br>
                        成员名字：<input type="text" name="name"><br>
                        成员账户：<input type="text" name="acc"><br>
                        成员密码：<input type="text" name="pwd"><br>
                        成员职务：<input type="text" name="duty"><br>
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button type="submit" class="layui-btn">修改</button>
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
