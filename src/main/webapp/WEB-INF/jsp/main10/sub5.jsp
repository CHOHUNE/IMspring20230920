<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-22
  Time: 오후 2:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<body>
<c:forEach begin="0" end="3" var="i">
    <p>${foodList[i]}</p>

    <%-- var에 쓰이는 키워드는 태그 내에서 쓰이는 단어와 같기만 하면
     임의로 자유롭게 설정이 가능하다--%>
</c:forEach>

<hr>
<c:forEach begin="1" end="3" var="num">
    <p>${num}</p>
</c:forEach>
<c:forEach begin="1" end="4" items="names " var="name">
    <p>${name}</p>
</c:forEach>

<%-- var status : 반복문의 상태 --%>
<style>
    .box {
        border: 1px solid black;
        margin: 5px;
        padding: 10px;
        display: flex;
        justify-content: space-between;
    }

    .box > div {
        border: 2px solid orange;
    }
</style>
<%-- varStatus : 반복문의 상태 --%>
<c:forEach begin="0" end="3" var="n" varStatus="status">
    <%--div.box>div.content1+div.content2--%>
    <div class="box">
        <div class="content1">
            n : ${n}
        </div>
        <div class="content2">
            <div>count : ${status.count}</div>
            <div>index : ${status.index}</div>
            <div>current : ${status.current}</div>
            <div>first : ${status.first}</div>
            <div>last : ${status.last}</div>
        </div>
    </div>
</c:forEach>

<hr>
<%-- status 에 커서 올린 후 looptagstatus 검색 후 메서드 힌트 얻기--%>
<c:forEach items="${names}" var="name" varStatus="status">
    <div>
        <div>count : ${status.count}</div>
        <div>index : ${status.index}</div>
        <div>current : ${status.current}</div>
        <div>first : ${status.first}</div>
        <div>last : ${status.last}</div>
    </div>
</c:forEach>


<hr>
<c:forEach begin="1" end="4" items="${foods}" var="food" varStatus="status">

<ul>
    <li>1 : ${status.count}: ${food}</li>
</ul>

</c:forEach>


</body>
</html>

