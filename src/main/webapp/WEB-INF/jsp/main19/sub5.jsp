<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-04
  Time: 오후 3:38
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
            width: 100%;
        }
        td,th{
          border: 1px solid black;
        }
        th{
            background-color: grey;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>번호</th>
        <th>상품명</th>
        <th>단위</th>
        <th>가격</th>
    </tr>
    <c:forEach items="${productList}" var="products">
    <tr>
        <th>${productList.id}</th>
        <th>${productList.name}</th>
        <th>${producList.unit}</th>
        <th>${productList.price}</th>
    </tr>
    </c:forEach>
</table>
*
</body>
</html>
