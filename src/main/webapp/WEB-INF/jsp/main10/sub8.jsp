<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-25
  Time: 오전 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>EL USAGE : 비교 </title>

</head>
<body>
<h3> el 비교 연산자</h3>
<p> >, < , <= , >= , == , !=</p>
<p> lt, gt, le, ge, eq , ne</p>
<p> less than , greater than , less equal , grater eqaul, equal , not equeal</p>
<p>${a}<${b}=${a<b}</p>
<%-- true --%>
<h4> >< </h4>
<p> ${a} > ${b} = ${a>b}</p>
<%-- false --%>

<hr>
<p>${c > d }</p>
<p>${c < d}</p>
<p>${c >= d}</p>
<p>${c <= d}</p>
<p>${c == d}</p>
<p>${c != d}</p>

<hr>
<h3> el 논리 연산자</h3>
<h4>${true && true} </h4>
<h4>${true && false} </h4>
<h4>${true && true} </h4>
<h4>${true and true} </h4>
<p> ${false and false }</p>
<%-- true 쌍 외에 전부 false 양변이 모두 true여야 true --%>


<p>\${true and true } : ${ture && ture}</p>
<%-- 연산식 && 결과값 둘 다 출력하는 작성법 --%>
<h4> || or </h4>
<p>\${true || true } : ${true || true}</p>
<p>\${true || flase} : ${true || false}</p>
<p>\${true or ture} : ${true or true}</p>
<p>\${false or true}: ${false or true}}</p>

<h4> ! ( not )    </h4>
<p> \${! true}  :${! true} </p>
<p>\${! false}  :${! false} </p>
<p>\${not true} :${not true} </p>
<p>\${not false}:${not false} </p>
</body>
</html>
