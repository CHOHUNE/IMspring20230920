<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-25
  Time: 오전 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>EL USAGE</title>
</head>
<>
<h3> el (안)에서 사용할 수 있는 연산자 </h3>
<h4>산술 연산자 </h4>
<h4>+ - * / % </h4>
<hr>
<h5>+ </h5>

<p> ${a}+${b} = ${a + b}</p>
<%--8+ 9 = 17 --%>
<p>${c}+${d}=${c+d}}</p>
<%-- "8"+ "9" = 17 자바와 EL은 달리 취급된다  --%>

<p>${a}-${b}=${a-b}</p>
<p>${c}-${d}=${c+d}}</p>
<%-- 8-9= -1--%>

<%--나누기--%>
<p>${a}/${b}=${a/b}</p>
<p>${c}/${d}=${c/d}</p>
<%-- 마찬가지로 문자 데이터도 EL에서는 숫자와 동일취급 된다 --%>
<p>${c}/${d}=${c div d}</p>
<%-- 명령어로도 나누기가 가능하다 --%>
<%-- 나누기는 자바와 달리 나머지가 나온다. 0.88888 --%>

<c:forEach begin="2" end="9" var="i">
    <c:forEach begin="1" end="9" var="j">
        <p> ${i}X${j}=${i * j}</p>
    </c:forEach>
</c:forEach>

<c:forEach begin="1" end="8" var="i">
    <c:forEach begin="1" end="9" var="j">
        <p>${10-i} X ${j} = ${10-i} * ${j}</p>
    </c:forEach>
</c:forEach>

<h5> 나머지 연산 : 명령어 (mod) (modulo, remainder)</h5>
<p> ${b} % ${a} = ${a % b}</p>
<p> ${d} % ${a} = ${c mod a}</p>

<h6> () : 우선 순위 높음 </h6>
<p> ${a * b - c}</p>
<p> ${a * (b - c)}</p>
<p> ${(a * b) - c)}</p>

</body>
</html>
