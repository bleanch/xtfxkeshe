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
<c:set var="g" value="${group}"></c:set>
团队详情<br>
团队id：${g.gid}<br>
团队领导者id：${g.lid}<br>
团队名：${g.name}<br>
团队人数：${g.num}<hr>
团队成员<br>
<table>
    <tr>
        <th>成员id</th>
        <th>成员名</th>
        <th>团队id</th>
        <th>成员账户</th>
        <th>成员密码</th>
        <th>成员职务</th>
    </tr>
    <c:forEach items="${mems}" var="m">
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
</table>
</body>
</html>
