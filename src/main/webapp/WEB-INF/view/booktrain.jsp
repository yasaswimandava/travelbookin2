<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
  <style> 
body{

background-image: url('train.jpg');
background-repeat: no-repeat;
background-attachment: fixed;
background-size: 100% 100%;

}
 
</style>
  
  
  
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <p class="navbar-text">Travel Booking Application</p>
     
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Home</a></li>
      <li><a href="/booktickets">Book Ticket</a></li>
      <li><a href="/viewtravelhistory">View Travel History</a></li>
      <li><a href="/checktrains">Check Trains</a></li>
    </ul>
  </div>
</nav>


<div align="center">

<form action="/save" method="post" modelattribute="user">
<label for="user">User Name:</label> 
<select name="userId">
<c:forEach items="${userList}" var="u">
<option value="${u.userId}">${u.userName}</option>

</c:forEach>
</select> <br />
<button type="submit">Book
</button>
</form>
</div>
</body>
</html>