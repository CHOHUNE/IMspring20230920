<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-25
  Time: 오후 2:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> form 요소 </h1>
<form>
    <%--어떤 리퀘스트 파라메터로 값이 넘어갈지 name을 곡 기입 해줘야 쿼리스트링에 잘 표기된다--%>
    <%-- 여러개 나오려면 여러개를 추가하면 된다. --%>
    <input type="text" name="param1">
    <br>
    <input type="text" name="param2">
    <br>
    <%-- sub1?param1=text1&param2=text2 --%>
    <%-- select (option), textarea --%>
    <button>전송버튼</button>
</form>

<form>
    폼2
    <br>
    <%-- 전송 버튼 클릭시
        ?name=lee&age=44&address=seoul&email=abc@gmail.com--%>
    <input type="text" name="name">
    <br>
    <input type="text" name="age">
    <br>
    <input type="text" name="address">
    <br>
    <input type="text" name="email">
    <br>
    <button>전송버튼</button>
</form>
<%-- @ 은 queryString 으로 표기시 url encoding 되어 다른 문자로 나오기도 한다. --%>
<h3>action 어튜리뷰트 속성 : request 파라미터들을 어디로 보낼 지 결정</h3>
<%-- ? 의 앞 부분을 지정해주는 것 --%>

<p> action 속성이 없거나 빈 문자열일 경우 현재경로 </p>
<form action="https://www.naver.com">
    <input type="text" name="query">
    <br>
    <button>전송</button>
</form>
<form action="https://google.com/search">
    <input type="text" name="q">
    <br>
    <button>전송</button>
</form>

<form action="https://search.daum.net/search">
    <input type="text" name="d">
    <br>
    <button>전송</button>
</form>

<%-- input 클릭시 /main12/sub2로 연결되는 예제 --%>
<form action="/main12/sub2">
    <input type="text" name="age">
    <button>전송</button>
</form>


<hr>
<h1>action 속성 값 : / 도 아니고 protocol (scheme) 이 아니면 현재 페이지의 상대 경로 </h1>
<h1>path 에서 마지막 / 기준 </h1>
<form action="main12/sub2">
    <input type="text" name="email">
    <button>전송 </button>
</form>
<form action="..">
    <input type="text" name="age">
    <button>전송 </button>
</form>
</body>
</html>
