<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Umleitung zur Startseite in 4 Sekunden...</h1>

	<script>
		setTimeout(() => {
			window.location.href = "pages/HomePage.jsp";
		}, 4000);
	</script>
</body>
</html>