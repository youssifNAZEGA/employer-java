<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nouvelle employé</title>
</head>
<body>
	<h1>Enregistrer un employé</h1>
	
	<form action="${pageContext.request.contextPath}/employee" method="post">
		<p>
			<label for="prenom">Prenom : </label>
			<input type="text" id="prenom" name="prenom" required>
		</p>
		<p>
			<label for="nom">Nom : </label>
			<input type="text" id="nom" name="nom" required>
		</p>
		<p>
			<label for="email">Email : </label>
			<input type="email" id="email" name="email" required>
		</p>
		<p>
			<label for="departement">Departemant : </label>
			<input type="text" id="departement" name="departement" required>
		</p>
		<p>
			<button type="submit">Enregistrer</button>
		</p>
		
	</form>
</body>
</html>