<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-26
  Time: 오후 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> 암호 전송 </h1>

<%--
password 가 쿼리 스트링에 남지 않게 하는 예제

method :  어떻게 보낼 것인가?

form element 중 사용할 수 있는 attribute 중
get 방식: 주소에 쿼리 스트링으로 붙어서 전송:
브라우저 주소란 노출, 길이 제한

 post 방식: 요청 본문에 붙어서 전송
주소란 노출 X 길이제한 X 주로 파일 전송에 쓰임

주소란이 아니라 몸통에 붙음 브라우저 f12 headers와 payloade에

--%>

post
<form action="/main14/sub2" method="post">
    <div>
        id:
        <input type="text" name="id">
    </div>
    <div>
        password :
        <input type="password" name="password">
    </div>
    <button></button>
</form>
get
<form action="/main14/sub2" method="get">
    <div>
        id:
        <input type="text" name="id">
    </div>
    <div>
        password :
        <input type="password" name="password">
    </div>
    <button></button>
</form>
</body>
</html>
