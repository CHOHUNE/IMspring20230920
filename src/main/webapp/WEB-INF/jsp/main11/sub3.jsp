<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-25
  Time: 오전 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<body>
<%-- if 태그 - test attribute 값이 true이면 출력 --%>
<c:if test="true">
    <p>출력 </p>
</c:if>
<c:if test="false">
    <p>출력 안됨 </p>
</c:if>

<hr>
<%--name 파라메터가 son이라면 hello son 출력 --%>
<c:if test="${param.name eq 'son'}">
    <p>hello son</p>
</c:if>

<hr>
<h3> var 속성 : test 연산 결과 저장 </h3>
<c:if test="${param.name eq 'son'}" var="isSon">
    <p>hello son</p>
</c:if>
<c:if test="${isSon}">
    <p>여전히 son</p>
</c:if>
<%-- isSon에 연산결과가 저장된다.
 var를 사용하면 복잡한 연산식을 적을 필요 없이 if에 not만 기입하면 된다  --%>
<c:if test="${not isSon}">
    <p> son 이 아님 </p>
</c:if>
</body>
<head>
    <title>Title</title>
</head>
</html>
