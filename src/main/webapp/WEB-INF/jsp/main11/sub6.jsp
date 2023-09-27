<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-25
  Time: 오후 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:choose>
    <c:when test="${pagam.age ge 20}">
        <p> 투표 가능 합니다</p>
    </c:when>

    <c:when test="${param.age le 20 }">
        <p> 투표 불가능 합니다</p>
    </c:when>

    <c:otherwise>
        <p>age 값을 입력 해주세요 </p>
    </c:otherwise>
</c:choose>

</body>
</html>
