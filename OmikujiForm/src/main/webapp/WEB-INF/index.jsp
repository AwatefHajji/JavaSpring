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
<h1>Send an Omikuji! </h1>
<form action="/handelForm" method="post">
  <div class="mb-3">
    <label  class="form-label">Pick any number from 5 to 25 </label>
    <input  type="number" class="form-control" min="5" max="25"  name="num">
  
  </div>
  <div class="mb-3">
    <label  class="form-label">Enter the name of any city</label>
    <input  class="form-control" name="city" >
    
  </div>
  <div class="mb-3">
    <label  class="form-label">Enter the name of any real person</label>
    <input  class="form-control"  name="person">
  </div>
    <div class="mb-3">
    <label  class="form-label">Enter professional endeavor or hobby</label>
    <input  class="form-control" name="hobby">
  </div>
    <div class="mb-3">
    <label  class="form-label">Enter type of living thing</label>
    <input  class="form-control" name="thing">
  </div>
  <div class="mb-3">
  <label  class="form-label">Say any thing nice to someone</label>
  <textarea class="form-control"  rows="3" name="text"></textarea>
</div>
  <p>Send and show a friend</p>

  <button type="submit" class="btn btn-primary">Send</button>
</form>
</div>
</body>
</html>