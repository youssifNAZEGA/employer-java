<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Première Servlet</title>
</head>
<body>
	<h1>Résultat de ma servlet</h1>
	<p>${message}</p>
	<a href="${pageContext.request.contextPath}/">
	Retour à l'accueil</a>
</body>
</html>