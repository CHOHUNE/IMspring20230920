<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-23
  Time: 오후 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Table-Ex</title>
    <style>
        tabe{
            border-collapse: collapse;
            border: 1.5px solid black;
        }
        tr{
            padding: 5px;
        }
        tr,td{
            padding: 5px;
        }
    </style>
</head>
<body>
<table>
    <capion>테이블 예제</capion>

    <header>
        <th>
        <tr>
            <td>ID</td>
            <td>FIRST NAME</td>
            <td>LASTNAME</td>
            <td>CLASSNAMEPHONE</td>
        </tr>
        </th>
    </header>

    <c:forEach items="${moving}" var="item">
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

<%--
<table> 시작 태그 ( 아래 태그들을 전부 감싼다 )
<tr> 행
<th> 헤더셀
<td> 데이터셀
<thread> 헤더 - tr과 th를 감싼다
<tfoot> 푸터 - tr과 th를 감싼다
<caption> 테이블의 제목


    private String id;
    private String firstName;
    private String lastName;
    private String classNamePhone;

--%>
