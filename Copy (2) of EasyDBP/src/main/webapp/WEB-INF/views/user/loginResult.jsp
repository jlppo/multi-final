<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<script src="/easydb/resources/jquery-3.2.1.min.js"></script>


<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>로그인 결과</p>

<c:if test = "${empty userVo }">${loginFailMsg }</c:if>
<c:if test = "$${loginFailMsg }">?</c:if>


</body>
</html>