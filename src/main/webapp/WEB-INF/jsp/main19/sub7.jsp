<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-04
  Time: 오후 4:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>UNIT</th>
        <th>PRICE</th>
    </tr>
    <c:forEach var="pd" items="productList">
    <tr>
        <td>${pd.id}</td>
        <td>${pd.name}</td>
        <td>${pd.unit}</td>
        <td>${pd.price}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>

<%--        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid black;
        }

        th {
            background-color: aqua;
        }

    </style>
</head>
<body>
<h4>고객 목록</h4>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>address</th>
        <th>country</th>
    </tr>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.address}</td>
            <td>${customer.country}</td>
        </tr>
    </c:forEach>--%>