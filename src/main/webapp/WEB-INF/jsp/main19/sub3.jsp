<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-04
  Time: 오후 2:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
공급자 목록

<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>PHONE</td>
    </tr>
    <tr>
        <c:forEach items="${shippers}" var="supplier">
    <tr>
        <td>${shipper.id}</td>
        <td>${shipper.name}</td>
        <td>${shipper.phone}</td>
    </tr>
    </c:forEach>
    </tr>
</table>

</body>
</html>
