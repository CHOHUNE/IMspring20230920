<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-27
  Time: 오전 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    여전히 세션에서 꺼낸 음식
</h1>
<ul>
    선택 한 음식은
    <c:forEach  var="food" items="${foodList}">
      ${food}
    </c:forEach>
    입니다
</ul>
<a href="/main15/sub7"> 선택 화면으로 다시 돌아가기 </a>
</body>
</html>

