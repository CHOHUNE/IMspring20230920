<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-25
  Time: 오전 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>empty</h2>
<p> null, 빈 문자열, </p>

<p>\${empty a} : ${empty a}</p>
<p>\${empty b} : ${empty b}</p>
<p>\${empty c} : ${empty c}</p>
<p>\${empty d} : ${empty d}</p>
<p>\${empty e} : ${empty e}</p>
<p>\${empty f} : ${empty f}</p>
<p>\${empty g} : ${empty g}</p>

<%-- 객체가 비었는지 안비었는지 유무 판단
   model.addAttribute("a","java");
    model.addAttribute("b","");
    model.addAttribute("c",List.of(3,4));
    model.addAttribute("d",List.of());
    model.addAttribute("e",Map.of("name","son"));
    model.addAttribute("f",Map.of());
    model.addAttribute("g",null);
--%>

<p>\$not empty a} :  ${ not empty a}</p>
<p>\${not empty b} :  ${ not empty b}</p>
<p>\${not empty c} :  ${ not empty c}</p>
<p>\${not empty d} :  ${ not empty d}</p>
<p>\${not empty e} :  ${ not empty e}</p>
<p>\${not empty f} :  ${ not empty f}</p>
<p>\${not empty g} :  ${ not empty g}</p>

</body>
</html>
