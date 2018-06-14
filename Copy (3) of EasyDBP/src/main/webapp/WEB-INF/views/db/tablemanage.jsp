<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>TABLEMANAGE.JSP</title>
</head>
<body>

	<form action="/db/table" method="post">
		<table border=1>
		
			<c:forEach items="${tableinfolist }" var="vo" varstatus="st">

				<tr>
				<td>${st.index } : {st.end}</td>
				<%-- <td>${vo.tableName}: ${vo.columnNameList } :  </td> --%>

				</tr>

			</c:forEach>



		</table>

	</form>


</body>
</html>