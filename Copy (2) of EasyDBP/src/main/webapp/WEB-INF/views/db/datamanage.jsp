<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	DATAMANAGE
	<h1> excel
	<button> import </button>
	<button> export </button>
	</h1>
	<br>
	
	<table border=1>
		<!-- Table Column name -->
		<tr>
		<c:forEach items="${columnList }" var="column">
			<td>
				${column }
			</td>
		</c:forEach>
		<td>
			
		</td>
		</tr>
		<c:forEach items="${tableList }" var="vo">
			<tr>
				<c:forEach items="${fn:split(vo, ',') }" var="cell">
					<td><input value=${cell}  size="5" ></td>
				</c:forEach>

				<td>
					<input type=button value="수정">
				</td>

				<td>
					<input type=button value="삭제">
				</td>

			</tr>
		</c:forEach>
	</table>
	

</body>
</html>