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
<c:set var="m" value="${mem}"></c:set>
成员id：${m.mid}<br>
成员名:${m.name}<br>
所属团队id：${m.gid}<br>
成员账号:${m.acc}<br>
成员密码:${m.pwd}<br>
成员职务:${m.duty}<br>
</body>
</html>
