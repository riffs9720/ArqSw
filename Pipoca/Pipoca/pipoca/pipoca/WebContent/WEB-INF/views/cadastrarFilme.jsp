<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Filme</title>
</head>
<body>
	<h1>Hello</h1>
	<form action="/cadastrar" method='post'>
		<label>Titulo:</label>
		<input type='text' name='filme.titulo'>
		<label>Ano Lançamento:</label>
		<input type='number' name='filme.anoLancamento'>
		<input type='submit' value='Cadastrar'>		
	</form>
</body>
</html>