<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Test 수정</h1>

  <form method="post">
  
  번호 : <input type="text" name="no" value="${}"> <br>
  할일 : <input type="text" name="test" value="${}"> <br>
  날짜 : <input type="date" name="duedate" value="${}"> <br>
  완료 : <input type="checkbox" name="complete" ${test.complete == 'done' ? 'checked' : ''}> <br> 
  
  
  
  
  
  
  
  
  
  </form>



</body>
</html>