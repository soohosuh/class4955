<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Todo LIST ( ${loginInfo} )</h1>

<ul>
  <li><a href="${pageContext.request.contextPath}/todo/read?no=1">1. 청소 </a> 2023-05-01 DONE</li>
  <li><a href="${pageContext.request.contextPath}/todo/read?no=2">2. 청소 </a> 2023-05-01 DONE</li>
  <li><a href="${pageContext.request.contextPath}/todo/read?no=3">3. 청소 </a> 2023-05-01 DONE</li>
  <li><a href="${pageContext.request.contextPath}/todo/read?no=4">4. 청소 </a> 2023-05-01 DONE</li>
  <li><a href="${pageContext.request.contextPath}/todo/read?no=5">5. 청소 </a> 2023-05-01 DONE</li>
  
</ul>

<div>
  ${todoList}
</div>

<a href="${pageContext.request.contextPath}/todo/register">Todo Register</a>

<c:if test="${loginInfo eq null}">
<a href="/app/login"> 로그인 </a>
</c:if>
<c:if test="${loginInfo ne null}">
<a href="/app/logout"> 로그아웃 </a>
</c:if>


</body>
</html>