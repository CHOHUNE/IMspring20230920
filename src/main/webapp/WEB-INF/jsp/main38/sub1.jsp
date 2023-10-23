<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-24
  Time: 오후 4:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <button onclick="ajax()"> button</button>
    <script>
        function ajax(){
            axios.get("/main38/sub1")
                .then(function response(){
                    console.log(response.data)
                    console.log(response.headers)
                    console.log(response.config)
                    console.log(response.status)
            })
        }
    </script>
</div>
<%-- 응답된 data를 js object로 파싱 --%>

<div>
    <button onclick="ajax4()">button4</button>
    <script>
        function ajax4(){
            ajax.get("/main38/sub4")
                .then(function (response){
              const data=response.data;
              console.log()
            })
        }
    </script>
</div>

</body>
</html>
