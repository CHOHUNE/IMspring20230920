<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-05
  Time: 오전 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<h4> 국가별 스트링으로 고객 조회 하기</h4>
<form action="/main19/sub13">

  국가
  <section name="country" id="">
    <c:forEach items="${countryList}" var="country">
        <option value="${country}">${country}</option>
    </c:forEach>
  </section>
    <button>조회</button>
</form>
</body>
</html>
