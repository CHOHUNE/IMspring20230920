<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-10
  Time: 오후 3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>    공급자 입력 </h3>
<form action="/main24/sub2" method="post">
<%--    div*8>input[name]--%>
    <div>
        <input type="text" name="supplierName">
    </div>
    <div>
        <input type="text" name="contactName">
    </div>
    <div>
        <input type="text" name="address">
    </div>
    <div>
        <input type="text" name="city">
    </div>
    <div>
        <input type="text" name="country">
    </div>
    <div>
        <input type="text" name="phone">
    </div>
    <div>
        <input type="text" name="postalCode">
    </div>
    <div>
        <input type="text" name="등록">
    </div>

</form>
</body>
</html>
