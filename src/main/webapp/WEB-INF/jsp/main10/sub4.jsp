<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-22
  Time: 오후 2:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> forEach tag</h1>
<p> 콘텐츠 반복 출력</p>
<p> 주요 attribute : begin,end, var, items, varStatus</p>

<%--<c:forEach begin="" end="">--%>
<%--    &lt;%&ndash;    begin 부터 end 까지 반복 1.2.3 end 도 포함--%>
<%--            begin은 1부터 시작--%>
<%--    &ndash;%&gt;--%>
<%--    <li>Lorem ipsum.</li>--%>
<%--</c:forEach>--%>

<hr>
<c:forEach begin="0" end="2" var="num">
    <li> num : ${num} </li>
</c:forEach>

<hr>

<c:forEach begin="0" end="2" var="num">
    <li> car: ${myList[num]} </li>
</c:forEach>

<hr>
<c:forEach items="${myList}" var="item">
    <li>car: ${item}</li>
</c:forEach>
</body>
</html>
