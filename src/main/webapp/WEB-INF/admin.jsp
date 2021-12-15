<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<c:forEach items="${admins}" var="a">
    id：${a.id};
    name:${a.name};<br>
</c:forEach>
<form action="/Addadmin" method="post">
    新id：<input type="text" name="id"><br>
    新名字：<input type="text" name="name"><br>
    新账户：<input type="text" name="acc"><br>
    新密码：<input type="text" name="pwd"><br>
    <button type="submit">提交</button>
</form><hr>
<form action="/updateadmin" method="post">
    新id：<input type="text" name="id"><br>
    新名字：<input type="text" name="name"><br>
    新账户：<input type="text" name="acc"><br>
    新密码：<input type="text" name="pwd"><br>
    <button type="submit">提交</button>
</form><hr>
<form action="/deleteadmin" method="post">
    删除id：<input type="text" name="id"><br>
    <button type="submit">提交</button>
</form>
</body>
</html>
