<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-27
  Time: 오전 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <li>
        <c:forEach items="${sessionScope.items}" var="fL">
            ${fL}
        </c:forEach>
    </li>
    <li>
        <c:forEach items="${requestScope.items}" var="sL">
            ${sL}
        </c:forEach>
    </li>
</ul>

</body>
</html>

<%--
model에서 꺼낼 경우엔 requestScope를 적지 않아도 된다
--%>