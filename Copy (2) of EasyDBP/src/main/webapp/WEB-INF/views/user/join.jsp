<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<script src="/easydb/resources/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#btn").click(function(){
	$.ajax({
	
		type : "GET",
		url : "idconfirm",
		data : { "id" : $('.id').val() },
		
		success : function(result) {
			if (result == "") {
				alert("사용가능한 ID 입니다.");
			}
			else if(result == " "){
				alert("ID를 입력해 주세요.");
			}
			else{
			alert("이미 사용중인 ID 입니다.");
			}
		}

		});
	});
	
});
</script>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<form action = "join" method = "post"> 
ID    <input type = "text"  class = "id" name = "id">
<input type = "button" id = btn name = "check" value = "중복확인"><br>
<!-- <input type = "submit" id = btn name = "check" value = "중복확인"> <br>-->
PW<input type = "text" name = "pw"><br>
<input type = "submit" id = db value = "회원가입">
</form> 

</body>

</html>