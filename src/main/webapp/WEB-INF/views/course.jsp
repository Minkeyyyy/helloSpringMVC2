<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수강과목 목록</h1>
	<c:forEach var="courses" items="${courses}">

		<c:if test="${param.year==courses.year&&param.term==courses.term}">
			<c:out value="${courses.subject}"></c:out>
			<br />
		</c:if>
	</c:forEach>
</body>
</html>

