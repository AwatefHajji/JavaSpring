<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	your Gold:
	<input type="text" name="gold" value="${gold}">
	<div id="place" style="display: flex; justify-content: space-evenly;">
		<div>
			<form action="/" method="post">
				<input type="hidden" name="farm" value="farm" />
				<h3>Farm</h3>
				<p>(earns 10-20 golds)</p>
				<br> <input type="submit" value="Find Gold!" />
			</form>


		</div>
		<div>
			<form action="/" method="post">
				<input type="hidden" name="cave" value="cave" />
				<h3>Cave</h3>
				<p>(earns 5-10 golds)</p>
				<br> <input type="submit" value="Find Gold!" />
			</form>


		</div>
		<div>
			<form action="/" method="post">
				<input type="hidden" name="house" value="house" />
				<h3>House</h3>
				<p>(earns 2-5 golds)</p>
				<br> <input type="submit" value="Find Gold!" />
			</form>


		</div>
		<div>
			<form action="/" method="post">
				<input type="hidden" name="quest" value="quest" />
				<h3>Quest</h3>
				<p>(earns/takes 0-50 golds)</p>
				<br> <input type="submit" value="Find Gold!" />
			</form>
		</div>


	</div>
	<div>
		<form action="/reset" method="post">
			<button>Reset the Game</button>
		</form>

	</div>
	<h2>Activities:</h2>
	<iframe src="/activities" style="width: 600px; "> </iframe>


</body>
</html>