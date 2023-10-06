<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-10
  Time: 오전 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h4>직원 조회
    <form action="">
        <div>
            검색 조건
            <select name="t" >
                <option value="lname" ${searchType == 'name1' ? 'selected' : ''}>Last Name</option>
                <option value="fname" ${searchType == 'name2' ? 'selected' : ''}>First Name</option>
                <option value="note" ${searchType =='note' ? 'selected' : ''}>Notes</option>
            </select>

<%--            select>option[value]*3 --%>
        </div>

        <div>
            검색어
<%--            input[name][value]--%>
            <input type="text" name="" value="${keyword}">
        </div>
        <div>
<%--            button{조회}--%>
            <button>조회</button>
        </div>
    </form>
</h4>
<hr>
<table>
    <tr>
        <th>name</th>
    </tr>
    <c:forEach items="${employee}" var="employee">
    <tr>
        <td>${employee.LastName} </td>
        <td>${employee.FirstName} </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
