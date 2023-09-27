<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-25
  Time: 오전 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
localhost:8080/main11/sub2?dan=2
localhost:8080/main11/sub2?dan=3
localhost:8080/main11/sub2?dan=4
param 단  예제
--%>
<c:if test="${(param.dan >=2) and (param.dan <= 9)}" var="okDan" >
<p>  구구단 ${param.단}</p>
<c:forEach begin="2" end="9" var="i">
        <p>
            ${param.dan} : ${i}=${param.dan * i}
        </p>
</c:forEach>
</c:if>
<c:if test= "${not okDan}">
    <h3> 구구단의 수를 2~9 사이의 값으로 입력 해주세요.</h3>
</c:if>
<%-- else 가 없어서 if 문을 두 번 삽입했다. --%>


</body>
</html>
