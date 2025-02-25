<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello World!</h1>
	
	<%-- a comment --%>

	<%-- scriptlet: une balise permettant d'ecrire du java dans un fichier jsp --%>
	<ul>
	<% 
		for (int i = 0; i < 5; i++) {
			out.append("<li>list item " + i + "</li>");
		}
	%>
	</ul>



</body>
</html>