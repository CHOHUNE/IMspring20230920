<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-25
  Time: 오후 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 요청 파라미터 age --%>
<%-- age가 20보다 크거나 같으면 --%>
<c:if test="${not empty age}">
<c:if test="${(param.age ge 20)}" var="age">
    <p>투표 가능 합니다.</p>
</c:if>
</c:if>
<%--그렇지 않으면 --%>
<c:if test="${(not age)}">
    <p>투표 불가능 합니다. </p>
</c:if>


</body>
</html>
