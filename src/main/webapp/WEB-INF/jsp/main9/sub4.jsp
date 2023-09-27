<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-22
  Time: 오전 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>${attr3.name}</h3>
<h3>${attr3["name"]}</h3>
<h3>${attr3["my name"]}</h3>
<%--
<h3>${attr3.your-name}</h3>
<h3>${attr3.my name}</h3>
이름에 - 나 공백을 쓰려면 대괄호로 감싸야한다
연산자로 인식할 수 있기 때문 --%>
<h3>${attr3["your-name"]}</h3>

<%-- map 변수명이 아니라 attributeName 으로 추가 !!! ! !--%>
<h4>${phones["phone1"]}</h4>
<h4>${phonse["iphone"]}</h4>
<h4>${country.korea}</h4>
<h4>${country.ny}</h4>
<%--<h4>${map3.1st}</h4> 숫자로 시작하는 키 값들은 대괄호로 감싸야 한다 --%>
<h4>${foods["1st"]}</h4>





<h1>${map1}</h1>
<%-- toString 된 결과가 나온다
 출력 예시 : ("Key1",1,"Key2",2,"Key3",3);
 특정 Key값만 얻고 싶을 때 --%>
<h1>${map["Key1"]}</h1>
<h1>${map["Key2"]}</h1>
<h3>${map1.ke1}</h3>
<h3>${map1.ke2}</h3>
<%-- 두 가지 문법 --%>
<h3>${cityMap.seoul}</h3>
<h3>${cityMap.busan}</h3>
<h3>${color.red}</h3>
<h3>${color.blue}</h3>
<h3>${color.["black"]}</h3>


</body>
</html>
