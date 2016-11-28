<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Minki's 수강과목</h1>
	<table>
		<tr>
			<th>년도</th>
			<th>학기</th>
			<th>총학점</th>
			<th>상세보기</th>
		</tr>
		<c:forEach var="courses" items="${courses}">
			<tr>
				<td><c:out value="${courses.year}"></c:out></td>
				<td><c:out value="${courses.term}"></c:out></td>
				<td><c:out value="${courses.grade}"></c:out></td>
				<td><a href="${pageContext.request.contextPath}/course?year=${courses.year}&term=${courses.term}">버튼</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<br />

	<table>
		<tr>
			<c:forEach var="course2" items="${course2}">
				<th><c:out value="${course2.division}"></c:out></th>
			</c:forEach>
		</tr>
		<tr>
			<c:forEach var="course2" items="${course2}">
				<td><c:out value="${course2.grade}"></c:out></td>
			</c:forEach>
		</tr>
	</table>

	<br />

	<a href="${pageContext.request.contextPath}/register">수강신청</a>


</body>
</html>
