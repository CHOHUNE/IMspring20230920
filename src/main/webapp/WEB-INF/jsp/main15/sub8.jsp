<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-27
  Time: 오전 9:43
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
    <ul>
    <c:forEach var="food"  items="${foodList}">
        <li>${food}</li>
    </c:forEach>
    </ul>
</h1>
<a href="/main15/sub9">sub9 page</a>
</body>
</html>

