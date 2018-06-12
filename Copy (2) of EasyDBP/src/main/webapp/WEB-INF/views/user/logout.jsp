<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<script src="/easydb/resources/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(Document).ready(function(){
	alert("Logout.");
	location.replace('login');
});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Main에서 로그아웃 클릭하면 여기로 넘어오고, Login 페이지로 다시 가게끔 하자.
</body>
</html>