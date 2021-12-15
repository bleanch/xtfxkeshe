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
<c:set var="a" value="${apl}"></c:set>
申请表id:${a.fid}<br>
申请表名:${a.fname}<br>
客户id:${a.uid}<br>
优先级:${a.propity}<br>
详细内容：${a.content}<br>
负责团队id:${a.gid}<br>
是否处理:${a.pid}<br>
申请日期:${a.datetime}<br>
</body>
</html>
