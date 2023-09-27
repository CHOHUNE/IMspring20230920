<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-26
  Time: 오후 3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- button 클릭시 sub6 으로 해당 내용을 body에 저장해서 사용
 sub6 이동 후에는 controller에서 매핑된 메서드가 작동 --%>
<form action="/main/sub6" method="post">
    <div>
        id :
        <input type="text" name="username">
    </div>
    <div>
        ps
        <input type="password" name="password" >
        <button> 전송 </button>
    </div>
</form>
</body>
</html>
