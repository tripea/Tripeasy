<!-- Shubham Raut -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<title>Select Seats</title>
<style type="text/css">
body {
	background-color: #d2d2d2;
}

.seats {
	background-color: #f1f1f1;
}

.occupied {
	background-color: gray;
	padding: 10px;
}


.block1{
margin-top: 25px;
margin-bottom: 25px;
}

.block2{

margin-top: 25px;
margin-bottom: 25px;
}

.block3{

margin-top: 25px;
margin-bottom: 25px;
}
</style>

</head>
<body>
<h1 style="text-align: center;">Select Seats</h1>
   

<form action="/flight/selected">

        Flight Id : <input name="flightId" value=${flight.flightId } >

	<div class="container-fluid">
		<div class="row seats">
			<div class="col-lg-4">
				<img alt="cockpit"
					src="https://github.com/tripea/website-images/blob/master/cockpit.png?raw=true">
			</div>
			<div class="col-lg-4">

	<div class="block1">
				<div class="column-A">
					<jstl:forEach var="seat" items="${seats }">
					
										
						<jstl:if test="${seat.column eq 65}">

							<jstl:if test="${seat.available}">
								<input type="checkbox" name="cbseats" value="${seat.column} ${seat.row}">
							</jstl:if>
							<jstl:if test="${!seat.available}">
								<input class="occupied" type="checkbox" disabled="disabled">
							</jstl:if>


						</jstl:if>
					</jstl:forEach>
				</div>

				<div class="column-B">
					<jstl:forEach var="seat" items="${seats }">

						<jstl:if test="${seat.column eq 66}">

							<jstl:if test="${seat.available}">
								<input type="checkbox" name="cbseats" value="${seat.column} ${seat.row}">
							</jstl:if>
							<jstl:if test="${!seat.available}">
								<input class="occupied" type="checkbox" disabled="disabled">
							</jstl:if>

						</jstl:if>
					</jstl:forEach>

				</div>

				<div class="column-C">
					<jstl:forEach var="seat" items="${seats }">

						<jstl:if test="${seat.column eq 67}">

							<jstl:if test="${seat.available}">
								<input type="checkbox" name="cbseats" value="${seat.column} ${seat.row}">
							</jstl:if>
							<jstl:if test="${!seat.available}">
								<input class="occupied" type="checkbox" disabled="disabled">
							</jstl:if>

						</jstl:if>
					</jstl:forEach>

				</div>
</div>

<div class="block2">
				<div class="column-D">
					<jstl:forEach var="seat" items="${seats }">

						<jstl:if test="${seat.column eq 68}">

							<jstl:if test="${seat.available}">
								<input type="checkbox" name="cbseats" value="${seat.column} ${seat.row}">
							</jstl:if>
							<jstl:if test="${!seat.available}">
								<input class="occupied" type="checkbox" disabled="disabled">
							</jstl:if>

						</jstl:if>
					</jstl:forEach>

				</div>

				<div class="column-E">
					<jstl:forEach var="seat" items="${seats }">

						<jstl:if test="${seat.column eq 69}">

							<jstl:if test="${seat.available}">
								<input type="checkbox" name="cbseats" value="${seat.column} ${seat.row}">
							</jstl:if>
							<jstl:if test="${!seat.available}">
								<input class="occupied" type="checkbox" disabled="disabled">
							</jstl:if>

						</jstl:if>
					</jstl:forEach>

				</div>

				<div class="column-F">
					<jstl:forEach var="seat" items="${seats }">

						<jstl:if test="${seat.column eq 70}">

							<jstl:if test="${seat.available}">
								<input type="checkbox" name="cbseats" value="${seat.column} ${seat.row}">
							</jstl:if>
							<jstl:if test="${!seat.available}">
								<input class="occupied" type="checkbox" disabled="disabled">
							</jstl:if>

						</jstl:if>
					</jstl:forEach>

				</div>
</div>

<div class="block3">
				<div class="column-G">
					<jstl:forEach var="seat" items="${seats }">

						<jstl:if test="${seat.column eq 71}">

							<jstl:if test="${seat.available}">
								<input type="checkbox" name="cbseats" value="${seat.column} ${seat.row}">
							</jstl:if>
							<jstl:if test="${!seat.available}">
								<input class="occupied" type="checkbox" disabled="disabled">
							</jstl:if>

						</jstl:if>
					</jstl:forEach>

				</div>

				<div class="column-H">
					<jstl:forEach var="seat" items="${seats }">

						<jstl:if test="${seat.column eq 72}">

							<jstl:if test="${seat.available}">
								<input type="checkbox" name="cbseats" value="${seat.column} ${seat.row}">
							</jstl:if>
							<jstl:if test="${!seat.available}">
								<input class="occupied" type="checkbox" disabled="disabled">
							</jstl:if>

						</jstl:if>
					</jstl:forEach>

				</div>

				<div class="column-I">
					<jstl:forEach var="seat" items="${seats }">

						<jstl:if test="${seat.column eq 73}">

							<jstl:if test="${seat.available}">
								<input type="checkbox" name="cbseats" value="${seat.column} ${seat.row}">
							</jstl:if>
							<jstl:if test="${!seat.available}">
								<input class="occupied" type="checkbox" disabled="disabled">
							</jstl:if>

						</jstl:if>
					</jstl:forEach>
				</div>
</div>
			</div>
			<div class="col-lg-4">
				<img alt="tail"
					src="https://github.com/tripea/website-images/blob/master/tail.png?raw=true">
			</div>
		</div>

			<div class="row">
 
                <div class="col-lg-12">
                    <input class="btn btn-success" type="submit" value="Book Ticket" style="float: right;margin: 20px;">
                </div>
            </div>
	</div>
	</form>
</body>
</html>