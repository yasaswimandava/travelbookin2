<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="com.mindtree.travelbookingapplication.entity.Booking"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>

form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}


body{

background-image: url('b.jpg');
background-repeat: no-repeat;
background-attachment: fixed;
background-size: 100% 100%;

}
</style>



<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

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
		<h1>Ticket BOOKING</h1>

    <form:form   action="/search" method="post" modelAttribute="searchDTO" style="margin:auto;max-width:300px">
    
    Select Source:&nbsp;
        
        <select name="source">
            <c:forEach items="${trains}" var="trains">
                <option value="${trains.source}">
                    ${trains.source}
                </option>
            </c:forEach>
        </select>
<br><br>

Select Destination:&nbsp;
        
        <select name="destination">
            <c:forEach items="${trains}" var="trains">
                <option value="${trains.destination}">
                    ${trains.destination}
                </option>
            </c:forEach>
        </select>
        
        <br><br>
        <input type="submit" value="Search" />
        </form:form>
        </div>
</body>
</html>