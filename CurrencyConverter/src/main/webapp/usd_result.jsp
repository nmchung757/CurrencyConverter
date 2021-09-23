<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USD Results</title>
</head>
<body>
<p>
${userUsdAmount.getUsd()} USD is   
${userUsdAmount.getEuro()} Euros
</p>
<a href="index.jsp">Select another currency to convert</a>
</body>
</html>