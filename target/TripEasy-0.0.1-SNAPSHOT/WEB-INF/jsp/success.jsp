<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<%-- <h1>${message} </h1> --%>
<h1>Balance Deducted and Ticket Booked Successfully</h1>
 <%-- <jstl:forEach  var="seat" items="${message.flight.seats}">
     ${seat.flightClass }
 </jstl:forEach> --%>
</body>
</html>


<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h1>${message} </h1>
<h1>Booked Success full</h1>

 <jstl:forEach  var="seat" items="${message.flight.seats}">
 	${seat.flightClass }
 </jstl:forEach>
</body>
</html> --%>