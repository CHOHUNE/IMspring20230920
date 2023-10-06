<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-04
  Time: 오후 3:19
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
        }
        th,td{
            border: 1px solid black;
        }
        th{
            background-color: grey;
        }
    </style>
</head>
<body>
<h4> 고객 목록 </h4>
<table>
    <tr>
        <td>CustomerID</td>
        <td>CustomerName</td>
        <td>City</td>
        <td>Country</td>
    </tr>
    <tr>
        <c:forEach items="${customers}" var="customer">
    <tr>
    <td>${customer.id}</td>
    <td>${cutomer.name}</td>
    <td>${customer.city}</td>
    <td>${customer.country}</td>
    </tr>
        </c:forEach>
    </tr>


</table>
</body>
</html>

