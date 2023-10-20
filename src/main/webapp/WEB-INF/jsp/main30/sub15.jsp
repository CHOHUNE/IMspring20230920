<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-19
  Time: 오전 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>직원 조회</h3>
<form action="/main30/sub15">
    <input type="text" name="id" placeholder="고객정보">
    <button>조회</button>
</form>
<hr>
<div> <h4> ${message}</h4></div>
<h3> 고객 정보 수정</h3>
<form action="/main/sub16" method="post">
    <div>
        <input type="text" name="id" value="${customer.CustomerID}" readonly><%--빈의 프로퍼티명 --%>
    </div>
    <div>
        <input type="text" name="name" value="${customer.CustomerName}">
    </div>
    <div>
        <input type="text" name="contact" value="${customer.ContactName}">
    </div>
    <div>
        <input type="text" name="adress" value="${customer.Address}">
    </div>
    <div>
        <input type="text" name="city" value="${customer.City}">
    </div>
    <div>
        <button> 수정 </button>
    </div>
</form>
</body>
</html>
