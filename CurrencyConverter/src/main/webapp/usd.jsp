<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USD to Euro</title>
</head>
<body>
	<h1>USD to Euro Converter</h1>
	
	<form action="getUsdServlet" method="post">
	Enter the value of the USDs to convert:
	<input type="text" name="userUsd" size="10">
	<input type="submit" value="Calculate Euro" />
	</form>
</body>
</html>