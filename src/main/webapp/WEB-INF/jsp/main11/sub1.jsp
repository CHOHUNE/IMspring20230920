<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-25
  Time: 오전 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>implicit el objects</h1>
<%-- 객체가 만들지 않았는데 있는 (묵시적 el 객체) --%>
<h1>param el 객체 </h1>
<%--
예 > name=son&age=36
("name","son")
("age","33")
두 entry를 param 맵에 넣어둠
--%>
<p>request parameter </p>
<p> \${param.name} : ${param.name}</p>
<p> \${param.age} : ${param.age}</p>
<p>\${param.email} : ${param.email}</p>
<%-- 주소 창에 주소에 ?name=son&age=33 쿼리스트링을 spring boot가
쪼개서 request에 넣어 놓는데 앤퍼센드 기준으로  키밸류 상인 엔트리 단위로  param에 넣는다.

key=value 상을 request parameter라고 한다.
request name = request value 이것을 쪼개서 넣어놓고
map으로 만든 것은 el객체 ( model attribute에 넣어논 것을
parameter라고 한다 --%>
</body>
</html>
