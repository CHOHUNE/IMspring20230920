<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-25
  Time: 오후 2:01
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
            border: 1px solid black;
            width: 100%;
        }

        th {
            padding: 5px;
        }
        tr,td{
            font-size: large;
            font-style: italic;
            border: black 2px solid;

        }

    </style>
</head>

<body>
<%-- main11/sub7?show=true --%>
<%-- table 형식의 데이터 출력 --%>
<table>
<tr>
    <td>ID</td>
    <td>FIRST NAME</td>
    <td>LAST NAME</td>
    <td>ClassNamePhone</td>
</tr>

<c:choose>
    <c:when test="${param.show eq true}">
        <c:forEach items="${moving}" var="item">

            <tr>
                <td>${item.id}</td>
                <td>${item.firstName}</td>
                <td>${item.lastName}</td>
                <td>${item.classNamePhone}</td>
            </tr>
        </c:forEach>
    </c:when>
    <c:otherwise>
        <p> show value is false </p>
    </c:otherwise>
</c:choose>
</table>
</body>
</html>

<%-- 파라메터 값이 true와 equal 인가 외에 다른 방법
  moving이란 애트리뷰트 값이 비어있지 않은가?의 방법
<c:if test="${not empty moving}"
--%>
