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
<c:set var="e" value="${eva}"></c:set>
评价表id:${e.eid}<br>
负责团队id:${e.gid}<br>
客户id:${e.uid}<br>
详细内容：${e.content}<br>
评价等级:${e.grade}<br>
被评价申请表id:${e.aid}<br>
</body>
</html>
