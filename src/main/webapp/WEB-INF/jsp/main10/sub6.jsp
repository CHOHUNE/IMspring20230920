<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-22
  Time: 오후 4:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>

    <style>
        table{
            border-collapse: collapse;
            border: 1px solid black;
            width: 100%;
        }
        th{
            padding: 5px;
        }
        th, td{
            padding: 5px;

        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>ID</th>
        <th>FIRST NAME</th>
        <th>LAST NAME</th>
        <th>PHONE</th>
    </tr>
    <c:forEach items="${moving}"  var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.firstName}</td>
            <td>${item.lastName}</td>
            <td>${item.classNamePhone}</td>
        </tr>

    </c:forEach>
</table>

</body>
</html>

<%--테이블 예제 -->
테이블 row - tr
테이블 column td
<c:forEach itmes=" " var=" "



