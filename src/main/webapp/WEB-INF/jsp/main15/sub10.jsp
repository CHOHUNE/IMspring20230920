<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-27
  Time: 오전 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>\${modelAttr1} : ${modelAttr1}</h1>
<h1>\${sessionAttr1} : ${sessionAttr1}</h1>

<h1>\${}:${sessionScope.attr1}</h1>
</body>
</html>

<%--el에서 이미 만들어진 오브젝트 객체
sessionScope : 이미 session에 추가된 attribute 들이 map으로 만들어져 있음
model attribute와 이름이 겹치거나 모호한 상활일 때 sessionScope를 쓰면 간편하게
key( attribute name) 을 넣어서 사용할 수 있다.

model은 하나의 리퀘스트
session은 여러 리퀘스트

El ${}에서 리퀘스트를 하면 좁은 영역 ( model) 에서 먼저 찾는다.
model 과 session의 add된 attribute가 중복된 이름일 때, model 에서 부터 값을 찾아온다

page -> request(model) -> session -> application
--%>