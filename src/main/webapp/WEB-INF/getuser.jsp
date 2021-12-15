<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<c:set var="u" value="${user}"></c:set>
客户id：${u.id}<br>
客户名:${u.name}<br>
客户账号:${u.acc}<br>
客户地址:${u.addr}<br>
客户密码:${u.pwd}<br>
</body>
</html>
