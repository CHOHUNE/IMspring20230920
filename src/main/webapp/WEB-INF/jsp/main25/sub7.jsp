<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-11
  Time: 오전 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> 직원 정보 변경 </h3>
<div style="border:"></div>
<form action="/main25/sub7">
  변경할 직원 번호
  <input type="number" name="id">
  <button> 조회 </button>
</form>
<hr>
<form action="/main25/sub7" method="post">
  <div>
    직원번호
    <input type="number" name="id" value="${employee.employeeId}">
  </div>
  <div>
    Last Name
    <input type="text" name="lastName" value="${employee.firstName}">
  </div>
  <div>
    Birth Date
    <input type="date" name="birthDate" value="${employee.birthDate}">
  </div>
  <div>
    Photo
    <input type="text" name="photo" value="${employee.photo}">
  </div>
  <div>
    Notes
    <textarea name="notes" id="" cols="30" rows="10">${employee.notes}</textarea>
  </div>
  <div>
    <button>수정</button>
  </div>
</form>
</body>
</html>