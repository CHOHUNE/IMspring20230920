<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-06
  Time: 오후 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;

        }

        th {
            background-color: grey;
        }

        td, tr {
            border: 1px solid black;
            padding: 10px;
        }

        .active {
            background-color: aqua;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>id</th>
        <th>name</th>
    </tr>


    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
        </tr>

    </c:forEach>
</table>

<div>
    <c:if test="${prevPageNumber >0 }">
    <a href="/main22/sub3?p=${prevPageNumber}">이전 </a>
    </c:if>
    <c:forEach begin="${leftPageNumber}" end="${rightPageNumber}" var="pageNumber">
        <a
                <c:if test="${pageNumber == currentPage}">
                    class="active"
                </c:if>
                href="/main22/sub3?p=${pageNumber}">
                ${pageNumber}
        </a>
        <c:if test="${lastPageNumber >= nextPageNumber}">
        <a href="/main22/sub3?p=${nextPageNumber}">다음</a>
        </c:if>
    </c:forEach>
</div>


</body>
</html>
