<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<script src="/easydb/resources/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#login").click(function(){
		alert("");

		
	});
});
	



</script>

<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

<form action = "login" method = "post"><!-- login페이지로 가는게 아니라 value = /login으로 적혀있는 컨트롤러로 간다. -->
<!-- 컨트롤러의 /login으로 가서 setViewName을 통해 그 페이지로 가는 것. -->
ID  <input type = "text" name = "id"><br>
PW<input type = "text" name = "pw"><br>
<input type = "submit" id = login value = "login">
</form>

<form action = "join" method = "get"><!-- 컨트롤러에서 join은 get방식으로 받았으니 get으로 해줘야함 -->
<input type = "submit" id = create value = "create">


</form>
</body>

</html>