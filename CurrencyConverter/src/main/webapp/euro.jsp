<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Euro to USD</title>
</head>
<body>
	<h1>Euro to USD Converter</h1>
	
	<form action="getEuroServlet" method="post">
	Enter the value of the Euros to convert:
	<input type="text" name="userEuro" size="10">
	<input type="submit" value="Calculate USD" />
	</form>
</body>
</html>