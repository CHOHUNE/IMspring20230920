<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-25
  Time: 오후 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

    <title>Title</title>
</head>
<body>
<div>
  <button onclick="ajax2()"> button2 </button>
  <script>
    function ajax2(){
      axios.get("/main39/sub2")
              .then(()=>console.log("성공"))
              .catch(()=>console.log("실패"))
    }
  </script>


</div>
</body>
</html>
