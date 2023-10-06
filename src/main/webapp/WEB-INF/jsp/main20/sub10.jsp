<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-10-05
  Time: 오후 4:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4> 공급자 조회 </h4>
<form action="/main20/sub11">
<button> 조회</button>
    <button type="button" name="addButton"> +</button>
    <select name="country" class="select1">
        <c:forEach var="country" items="${countryList}">
        <option value="${countryList}">${countryList}</option>
        </c:forEach>
    </select>
</form>


<script>
    document.querySelector("#addButton").addEventListener("click",function(){
        const seleElem = document.querySelector(".select1");
            const copyElem= seleElem.cloneNode(true);

            seleElem.before(copyElem);
            seleElem.befroe(document.createElement("br"));
    });
</script>
</body>
</html>

 <%--

 1
 양식(form) 정의:

HTML <form> 요소를 사용하여 양식을 정의합니다.
action 속성을 통해 양식이 제출될 URL(/main20/sub11)을 지정합니다.
조회 버튼과 추가 버튼 추가:

2
"조회" 버튼과 "추가" 버튼을 양식 내에 추가합니다.
"조회" 버튼은 양식을 제출하는 역할을 합니다.
"추가" 버튼은 JavaScript 이벤트 처리를 위해 type="button"으로 설정되어 있습니다.
3
줄바꿈(<br>) 요소 추가:

<br> 요소를 사용하여 줄바꿈을 양식 내에 추가합니다. 이것은 시각적으로 요소들을 나누는 역할을 합니다.
4
국가 선택 드롭다운 생성:

<select> 요소를 사용하여 국가 선택 드롭다운을 정의합니다.
name 속성은 양식에서 데이터를 식별하는 데 사용됩니다.
class 속성은 CSS 스타일을 적용하기 위해 "select1" 클래스를 지정합니다.
5
"추가" 버튼 클릭 이벤트 처리:
"추가" 버튼이 클릭되면 아래 단계가 실행됩니다.

6국가 선택 드롭다운 요소 선택:
HTML에서 클래스 이름이 "select1"인 국가 선택 드롭다운 요소를 선택합니다.
7
국가 선택 드롭다운 복제:

8선택한 국가 선택 드롭다운을 깊은 복사하여 새로운 요소로 복제합니다. (하위 요소와 속성을 모두 복사)
복제한 드롭다운과 줄바꿈(<br>) 요소 추가:

복제한 국가 선택 드롭다운을 원래 국가 선택 드롭다운 바로 위에 추가합니다.
각 국가 선택 드롭다운 아래에 줄바꿈(<br>) 요소를 추가하여 시각적으로 구분합니다.
이 코드를 사용하면 "추가" 버튼을 클릭할 때마다 국가 선택 드롭다운과 줄바꿈 요소가 복제되어 추가되며, 웹 페이지에서 사용자가 여러 국가를 선택할 수 있게 됩니다.

 --%>