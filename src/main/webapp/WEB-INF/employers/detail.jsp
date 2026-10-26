<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fiche employé</title>
</head>
<body>
	<h1>Fiche de l'employé</h1>
	<p>Prénom : ${employee.prenom}</p>
	<p>Nom : ${employee.nom}</p>
	<p>Email : ${employee.email}</p>
	<p>Departement : ${employee.departement}</p>
	
	<a href="${pageContext.request.contextPath}/employee">
		Enregistrer un autre employé
	</a>
</body>
</html>