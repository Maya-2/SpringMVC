<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	Welcome to Telusko
 	
 	<form action="addAlien">
 		Enter your id : <input type="text" name="id"><br>
 		Enter your name : <input type="text" name="name"><br>
 		<input type="submit">
 	</form>
 	<form action="getAlien" method="get">
 		Enter your id : <input type="text" name="id"><br>
 		<input type="submit">
 	</form>
</body>
</html>