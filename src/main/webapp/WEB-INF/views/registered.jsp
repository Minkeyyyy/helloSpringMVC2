<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수강신청 과목</h1>
	<table>
		<tr>
			<th>년도</th>
			<th>학기</th>
			<th>교과코드</th>
			<th>교과목명</th>
			<th>구분</th>
			<th>학점</th>
		</tr>
		<tr>
			<td><c:out value="${course.year}"></c:out></td>
			<td><c:out value="${course.term}"></c:out></td>
			<td><c:out value="${course.code}"></c:out></td>
			<td><c:out value="${course.subject}"></c:out></td>
			<td><c:out value="${course.division}"></c:out></td>
			<td><c:out value="${course.grade}"></c:out></td>
		</tr>
	</table>
</body>
</html>