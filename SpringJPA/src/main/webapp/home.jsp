<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="addUser">
		<input type="text" name="uid"><br> <input type="text"
			name="uname"><br> <input type="text" name="tech"><br>
		<input type="submit"><br>
	</form>
	
	<br>
	<br>
	<br>


	<form action="getUser">
		<input type="text" name="uid"><br> <input type="submit"><br>
	</form>
	
	<br>
	<br>
	<br>

	<form action="deleteUser">
		<input type="text" name="uid"><br>
		<input type="submit">Delete<br>
	</form>
	
	<br>
	<br>
	<br>
	
	<form action="updateUser">
		<input type="text" name="uid">
		<br> <input type="text" name="uname"><br> 
		<input type="text" name="tech"><br>
		<input type="submit"><br>
	</form>
	
	<form action="getCustomData">
		<input type="submit" value="Press me"><br>
	</form>
	
	<br>
	<br>
	<br>

</body>
</html>