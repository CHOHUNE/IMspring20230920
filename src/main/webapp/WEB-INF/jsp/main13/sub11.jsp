<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-26
  Time: 오후 2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main13/sub12">
    div*2>label[for=input$]+input#input
    <div>
        <label for="input1">이름</label>
        <input type="text" id="input1">
    </div>
    <div>
        <label for="input2">주소</label>
        <input type="text" id="input2">
    </div>
<%--    div>label[for=textarea1]+textarea#textarea1[name]--%>
    <div>
        <label for="textarea1"></label>
        <textarea name="" id="textarea1" cols="30" rows="10"></textarea>
    </div>
</form>
</body>
</html>
