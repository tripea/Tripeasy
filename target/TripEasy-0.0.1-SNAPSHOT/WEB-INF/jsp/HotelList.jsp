
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="jstl" uri="http://java.sun.com/jstl/core_rt"%>
<%@ page isELIgnored="false"%>
<%@ include file="Header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<style type="text/css">
.hotel {
	border: medium;
	background-color: gainsboro;
	margin: 10px
}

p.resort {
	width: 4em;
	border: 2px double salmon;
	color: indigo;
	border-right-style: double;
	word-wrap: break-word;
}

.hotelname {
	
}
</style>
</head>

<!-- <table class="table table-striped w-auto"> -->

<body style="background-color: #5E4485">
	<div class="container-fluid">
	<jstl:forEach var="hotelList" items="${hotelList}">
		<div style="width: auto; padding: 10px; position: relative;">
			

				<%-- <jstl:forEach var="photos" items="${hotelList.photos}"> --%>
				<div class = "row">
					<div class="<!-- row --> hotel">
						<%-- <a href ="/hotel/getHotel?hotelId=${hotelList.hotelId}"> --%>
						<div class="col-sm-5">
							<div class="container">
							<jstl:set var="first" value="${hotelList.photos[0]}"/>
								<br> <img class="img-responsive" src=${first}
									alt=${hotelList.hotelName} width="460"
									height="345">
									
									
									
									
							</div>

						</div>
						<a href="/hotel/getHotel?hotelId=${hotelList.hotelId}"><div
								class="col-sm-5">
								<div class="container hotelname text-left">
									<p class="resort">Resort</p>
									<h1>${hotelList.hotelName}</h1>
									<p>${hotelList.address.city}</p>
									<p>Area :${hotelList.address.area}</p>

								</div></a>

					</div>


					<div class="col-sm-2"
						;style="width: 70px; height: auto; background: #CC0000; color: #FFF; padding: 7px 1px; text-align: center; top: 4; position: absolute; right: 11;">

						<!--     <div class="col-sm-4" style="background-color:lavenderblush;"> -->
						<h4>INCLUDED IN THIS PRICE</h4>
						<%-- <jstl:forEach var="room" items="${hotelList.rooms}"> --%>
							 
							<jstl:set var="room" value="${hotelList.rooms[0]}"/>
							<h2>${room.price}</h2>
							<p>per night</p>
							<p>LOGIN & UNLOCK A SECRET DEAL!
							<p>
					<%-- 	</jstl:forEach> --%>

						<!-- </div> -->

					</div>
					</div>
		</div>


		</jstl:forEach>


		<%-- </jstl:forEach> --%>
		
	</div>
	</div>
</body>

</html>