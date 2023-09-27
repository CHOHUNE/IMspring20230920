<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-23
  Time: 오후 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%-- c라는 접두사를 이용하여 태그 라이브러리를 사용하는 태그
JSTL 라이브러리를 사용하는데 java serverpage standardTagLibrary 이다.
jsp 페이지 내에서 반복문, 조건문, 변수 설정 등과 같은 기본적인 작업을 더 쉽게
수행 가능케 해준다.

<c:/forEach var="" items="" begin="1" end="3">
</c:forEach>
<c:/if test="${condition}" >
    <p> 관리자 권한이 있습니다 </p>
<c:/if>
<c:if test="${condtion}">
    <p> 관리 권한이 있습니다 </p>

c:choose - c:when -c:otherwise

--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
forEach 사용 예제 1
1~3까지 반복되는 forEach 문을 이용하여
foodList 배열요소 모두 호출
--%>
<c:forEach begin="1" end="3" var="i">
    <p>
            ${foodsList[i]}
    </p>

</c:forEach>

<c:forEach begin="1" end="3" var="num" items="num">
    <p>
        ${foodList[num]}
    </p>
</c:forEach>
<%--
items 는 실질적으로 담을 요소
var 는 반복문 내에서 호칭할 이름
--%>


</body>
</html>


<%--

--%>