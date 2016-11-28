<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수강신청</h1>
	<form method="get" action="${pageContext.request.contextPath}/doregister">
		<table>
			<tr>
				<td>년도</td>
				<td><input type="text" name="year" value="2016"/></td>
			</tr>
			<tr>
				<td>학기</td>
				<td><input type="text" name="term" value="2"/></td>
			</tr>
			<tr>
				<td>교과코드</td>
				<td><input type="text" name="code" /></td>
			</tr>
			<tr>
				<td>교과목명</td>
				<td><input type="text" name="subject" /></td>
			</tr>
			<tr>
				<td>구분</td>
				<td><input type="text" name="division" /></td>
			</tr>
			<tr>
				<td>학점</td>
				<td><input type="text" name="grade" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수강신청"/></td>
			</tr>
		</table>
	</form>
</body>
</html>