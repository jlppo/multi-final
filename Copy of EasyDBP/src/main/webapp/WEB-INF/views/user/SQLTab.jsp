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
		
		var text = $("#ta1").val();
		/* var DB 값 = text; */
		/* 	$("#ta2").val(DB 값); */

		
		$("#ta2").val(text);
		
	});
});

</script>
 
<meta charset="UTF-8">
<title>SQL TAB</title>
</head>
<body>
SQL : <br>
<textarea rows="20" cols="100" id = ta1></textarea><br>
<div align="center">
<input type = button id = btn name = do value = "실행"><br>
</div>
Result : <br>
<textarea rows="20" cols="100" id = ta2></textarea><br>

</body>
</html>