<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style> 
body{

background-image: url('bg.jpg');
background-repeat: no-repeat;
background-attachment: fixed;
background-size: 100% 100%;

}
 
</style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <p class="navbar-text">Travel Booking Application</p>
     
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="booktickets">Book Ticket</a></li>
      <li><a href="viewtravelhistory">View Travel History</a></li>
      <li><a href="checktrains">Check Trains</a></li>
    </ul>
  </div>
</nav>



	<div class="container">
		<h1>Train details</h1>

		<c:forEach var="t" items="${trainlist}">
			<h2>${t.key}</h2>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Train Id</th>
						<th>Train Name</th>
						<th>Cost</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="train" items="${t.value}">
						<tr>
							<td>${train.trainId}</td>
							<td>${train.trainName}</td>
							<td>${train.cost}</td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
		</c:forEach>
	</div>
</body>
</html>