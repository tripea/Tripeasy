<!DOCTYPE html>
<html lang="en">
<head>
<title>Header</title>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
<style>
.navbar-header {
	float: none;
}

ul{margin:0;}
a {padding: 10px 10px; display:inline-block;}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">

			<ul class="nav navbar-nav">
				<li ><a href="#"><img
						src="https://raw.githubusercontent.com/kanaksoni714/MyProject/master/logoo.jpg"
						alt="TripEasy" style="width: 100px;"></a></li>

				<li><a href="/search/searchFlights"><!-- <span class="fab fa-avianex" style='margin-right:10px;font-size:24px;color:white;'></span> -->Flight Booking</a></li>
				<li><a 	href="/search/searchHotels">Hotel Booking</a></li>
				<li><a href="/bookings/profileId">Booking History</a></li>
				
			</ul>
			<ul class="nav navbar-nav navbar-right">

				<li><a href="/profiles"><span class="glyphicon glyphicon-user"></span>Profile</a></li>

			<li><a href="/wallet/wallet?profileId=3"><span class="glyphicon glyphicon-credit-card"></span>
						Wallet</a></li>
				<!-- <li><a href="/signUpPage"><span class="glyphicon glyphicon-user"></span>

						Sign Up</a></li> -->
			<!-- 	<li><a href="logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a></li> -->
						<li>

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <p style="color: white">Welcome ${pageContext.request.userPrincipal.name}  <a onclick="document.forms['logoutForm'].submit()">Logout</a></p>

    </c:if>

</li>
			</ul>
		</div>
		
		<%-- <div class="container">

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>

    </c:if>

</div> --%>
		
	</nav>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
