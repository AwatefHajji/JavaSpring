<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<div class="container">
<h1>Here's Your  Omikuji! </h1>
<div class="card w-50">
  <div class="card-body" >
    <p class="card-text">In ${number } years, you will live in ${city } with ${person } as your roommate, 
    ${hobby }.</p>
      <p class="card-text">The next time you see a  ${thing }, you will have a good luck.${text } </p>
   
    
  </div>
</div>
</div>
</body>
</html>