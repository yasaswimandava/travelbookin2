<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<h1>BOOKING</h1>

    <form:form  action="/getdetails" method="get" modelAttribute="users">
    
    User Id:&nbsp;
        
        <select name="userId">
            <c:forEach items="${users}" var="user">
                <option value="${user.userId}">
                    ${user.userId}
                </option>
            </c:forEach>
        </select>
<br><br>

<input type="submit" value="Show" />
</form:form>
</div>



<div align="center">
		<table border="10" cellpadding="5">
		<thead>
		<tr>
		
		<th>Source</th>
		<th>Destination</th>
		<th>Date</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="booking" items="${bookinglist}">
		<tr>
		
		<td>${booking.fromSource}</td>
		<td>${booking.toDestination}</td>
		<td>${booking.date}</td>
		</tr>
		</c:forEach>
		</tbody>
		</table>
		</div>
 


<%-- <div align="center">

		<h1>BOOKING DETAILS</h1>
		<br>
		<form:form action="/getbooking" method="post" modelAttribute="users">
		<th>User:</th>
		<br>
		<td><form:select path="userId" items="${users}" />  </td>
		<br>
		<br>
		<a><button type="submit">Get History</button></a>
		
		
		
		<table>
       <tr>
       <th>User Id:</th>
       <th>Traveling to:</th>
       <th>Traveling From:</th>
       <th>Action</th>
        </tr>
        
       <c:forEach var="t" items="${booklist}">
       
       <tr>
       <td>${t.userId}</td>
        <td>${t.destination}</td>
         <td>${t.fromSource}</td>
          <td><a href="/update/<c:out value="${t.userId}" />">Update</a></td>
       </c:forEach>
        
      </table>   
        
		
		
		
</form:form>
</div>
 --%>








</body>
</html>