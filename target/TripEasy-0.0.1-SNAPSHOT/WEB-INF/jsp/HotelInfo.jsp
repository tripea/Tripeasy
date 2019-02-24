<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="jstl" uri="http://java.sun.com/jstl/core_rt"%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
table, th, td {
    padding: 5px;
    height: 80px;
    width: 1100px;
    font-size: 20px;
    text-align: center;
    font-family: inherit;
}
 
th, td {
    padding: 1px;
    background-color: lightblue
}
</style>
 
<body>

	<div>
		<table>
			<tr>
				<th>Hotel Name</th>
				<th>Address</th>
				<th>Review</th>
				<th>Rooms</th>
				<th>Photos</th>
				<th>Facilities</th>
				<th>Description</th>
				<th>Availability</th>
			</tr>
 		 
				<tr>
					<td>${hotel.hotelName}</td>
					<td> landMark : ${hotel.address.landMark} <br>
						city : ${hotel.address.city}<br>
						pincode : ${hotel.address.pincode}<br>
						state: ${hotel.address.state}<br>
						nation : ${hotel.address.nation}<br>
					
					</td> 
					<td>${hotel.review}</td>
					<td>${hotel.photos}</td>
					<td>${hotel.rooms}</td>
					<td>${hotel.facilities}</td>
					<td>${hotel.description}</td>
					
					<jstl:if test="${hotel.totalAvailableRooms==0}">
					<td>No Rooms Available</td>
					</jstl:if>
					<jstl:if test="${hotel.totalAvailableRooms != 0}">
					<td>Available Rooms :${hotel.totalAvailableRooms}<br>
					<a href ="bookingForm">Book Room </a></td>
					
					</jstl:if>
					
	
				</tr>
			 

		</table>

	</div>

</body>
</html> --%>





<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="jstl" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page isELIgnored="false"%>
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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>


<style>
.carousel-inner img {
	width: 100%; /* Set width to 100% */
	min-height: 200px;
}

@media ( max-width : 600px) {
	.carousel-caption {
		display: none;
	}
}

.
body {
	font: 400 15px Lato, sans-serif;
	line-height: 1.8;
	color: #818181;
}

.panel {
	border: 1px solid #f4511e;
	border-radius: 0 !important;
	transition: box-shadow 0.5s;
}

.h2 {
	font-size: 24px;
	text-transform: uppercase;
	color: #303030;
	font-weight: 600;
	margin-bottom: 30px;
}

.h4 {
	font-size: 19px;
	line-height: 1.375em;
	color: #303030;
	font-weight: 400;
	margin-bottom: 30px;
}

.navbar {
	margin-bottom: 0;
/* 	background-color: #c0c0c0; */
	z-index: 9999;
	border: 0;
	font-size: 12px !important;
	line-height: 1.42857143 !important;
	letter-spacing: 4px;
	border-radius: 0;
	font-family: Montserrat, sans-serif;
}

.navbar li a, .navbar .navbar-brand {
	color: #fff !important;
}

.navbar-nav li a:hover, .navbar-nav li.active a {
	color: #f4511e !important;
	background-color: #fff !important;
}

.navbar-default .navbar-toggle {
	border-color: transparent;
	color: #fff !important;
}

.slideanim {
	visibility: hidden;
}

.slide {
	animation-name: slide;
	-webkit-animation-name: slide;
	animation-duration: 1s;
	-webkit-animation-duration: 1s;
	visibility: visible;
}

@
keyframes slide { 0% {
	opacity: 0;
	transform: translateY(70%);
}

100%
{
opacity


:

 

1;
transform


:

 

translateY


(0%);
}
}
@
-webkit-keyframes slide { 0% {
	opacity: 0;
	-webkit-transform: translateY(70%);
}

100%
{
opacity


:

 

1;
-webkit-transform


:

 

translateY


(0%);
}
}
@media screen and (max-width: 768px) {
	.col-sm-4 {
		text-align: center;
		margin: 25px 0;
	}
	.btn-lg {
		width: 100%;
		margin-bottom: 35px;
	}
}

@media screen and (max-width: 480px) {
	.logo {
		font-size: 150px;
	}
}

.thumbnail {
	padding: 0 0 15px 0;
	border: none;
	border-radius: 0;
}

.thumbnail img {
	width: 100%;
	height: 100%;
	margin-bottom: 10px;
}

.carousel-control.right, .carousel-control.left {
	background-image: none;
	color: #f4511e;
}

.carousel-indicators li {
	border-color: #f4511e;
}

.carousel-indicators li.active {
	background-color: #f4511e;
}

.item h4 {
	font-size: 19px;
	line-height: 1.375em;
	font-weight: 400;
	font-style: italic;
	margin: 70px 0;
}

.item span {
	font-style: normal;
}

@
keyframes slide { 0% {
	opacity: 0;
	transform: translateY(70%);
}

100%
{
opacity






:



 



1;
transform






:



 



translateY






(0%);
}
}
@
-webkit-keyframes slide { 0% {
	opacity: 0;
	-webkit-transform: translateY(70%);
}
100%
{
opacity






:



 



1;
-webkit-transform






:



 



translateY






(0%);
}
}
</style>
<!-- <body style="background-color: #5E4485"> -->

<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="60">
	
	<br>
	
	
	<div class="container-fluid">
		<div class="row"><br><br>
			<div class="col-sm-5">
				<div id="myCarousel" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
					</ol>


					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<jstl:set var="first" value="${hotel.photos[0]}" />
							<img src="${first}" alt="Image">
							<div class="carousel-caption">
								<h3>See More Photos</h3>

							</div>
						</div>

						<jstl:forEach var="photos" items="${hotel.photos}">
							<div class="item">
								<img src="${photos}" alt="Image">

							</div>
						</jstl:forEach>
					</div>

					<!-- Left and right controls -->
					<a class="left carousel-control" href="#myCarousel" role="button"
						data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a> <a class="right carousel-control" href="#myCarousel" role="button"
						data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
			</div>

			<div class="col-sm-3 col-xs-12">
				<div class="col-sm-3 col-xs-12"></div>
				<div class="panel panel-default text-center">
					<div class="panel-heading">
						<h1>Google map</h1>
					</div>
				</div>
				<a href="#"><img src="${first}" class="img-responsive"
					style="width: 100%" alt="Image"></a>
				<div class="carousel-caption">
					<h3>See More Room Photos</h3>

				</div>
			</div>
			<div class="row slideanim">
				<div class="col-sm-3 col-xs-12">
					<div class="panel panel-default text-center">
						<div class="panel-heading">
							<p>Hurry! Last few rooms remaining for your dates</p>
						</div>
						<div class="panel-body">
							<p>
								<jstl:if test="${hotel.totalAvailableRooms==0}">
										<strong>No Rooms Available</strong>
							       </jstl:if>
							<jstl:if test="${hotel.totalAvailableRooms != 0}">
							 <strong> Only ${hotel.totalAvailableRooms} rooms are available</strong> 
							 	
							 	<jstl:forEach items="${hotel.rooms}" var="roomNumber">
							 	<jstl:if test="${roomNumber.roomNumber==1}">
										 <p>${roomNumber.price}</p>
										 
										 <div class="panel-footer">
									<!-- <a href="bookingForm">
						
										<button class="btn btn-lg">Book Now</button></a> -->
							</div>
							       </jstl:if>
							 		
							 	</jstl:forEach>
							 
								</jstl:if>
							</p>
 


						</div>
						   
						   
						   
					</div>
				</div>

				<div class="col-sm-3 col-xs-12">
					<div class="panel panel-default text-center">
						<div class="panel-body">
							<p>
								<strong>Reviews ${fn:length(hotel.review)}</strong>
							</p>
							<p class="text-left">
								<jstl:forEach items="${hotel.review}" var="current">
									<jstl:if test="${current.key==1}">
										${current.value}<br>
									</jstl:if>
								</jstl:forEach>
							</p>

							<div class="col-sm-6"></div>
							<div class="col-sm-6 ">
								<p>

									<a href="#reviews"><strong>More Reviews </strong><br></a>
								</p>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	
	
	
	 
		<div class="row">
			<div class="col-sm-12">
			
	<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
         <span class="icon-bar"></span>
       </button>
      <a class="navbar-brand" href="#myPage"></a>
    </div>
   <div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav navbar-center">
						<li><a href="http://localhost:8764/">HOME</a></li>
						<li><a href="#rooms"> ROOMS</a></li>
						<li><a href="#facilities">FACILITIES</a></li>
						<li><a href="#location">LOCATION</a></li>
						<li><a href="#description">DESCCRIPTION</a></li>
						<li><a href="#reviews">USER REVIEWS</a></li>
					</ul>
				</div>
  </div>
</nav>
</div>
</div>


<div class="jumbotron text-center">
  <h1>Hotel ${hotel.hotelName} </h1> 
  <p>We are happy to help you</p> 
  <form>
    <div class="input-group">
      
       
    </div>
  </form>
</div>

<div id="rooms" class="container-fluid">
  <div class="row">
    <div class="col-sm-12">
      
     	 <h2>Rooms formation</h2>
					<br>


					<table class="table">
						<thead>
							<tr>
								<th>ROOM TYPE</th>
								<th>OPTIONS AND BEDCOUNTS</th>
								<th>INCLUDED IN THIS PRICE</th>
								<th>PRICE</th>
							</tr>
						</thead>
						<jstl:forEach items="${hotel.rooms}" var="room">
							<tbody>
								<tr>
									<td>${room.roomType}</td>
									<td>

										<table>
											<tbody>
												<tr>
													<td>Break Fast Available</td>
												</tr>
												<tr>
													<td>Number Of Beds Are ${room.bedCount}</td>
												</tr>
											</tbody>
										</table>
									</td>
									<td>

										<table>
											<tbody>
												<tr>
													<td>Type Of Beds Are ${room.bedType}</td>
												</tr>
												<tr>
													<jstl:if test="${room.miniBar==true}">
														<td>Also Minibar Is Available</td>
													</jstl:if>
													<jstl:if test="${room.miniBar==false}">
														<td>Minibar Is Not Available</td>
													</jstl:if>
												</tr>
											</tbody>
										</table>
									</td>
									<td>${room.price}<a href="bookingForm/?roomprice=${room.price}"> <br>Book Room
									</a></td>

								</tr>
							</tbody>

						</jstl:forEach>



					</table>

				</div>
      
      
    </div>
     
  </div>
 

 <br><br>


<div id="facilities" class="container-fluid">
   <h2>Facilities at ${hotel.hotelName}</h2>
 		<div class="col-sm-12 col-xs-12">
			
				<div class="panel panel-default ">
				<div class = "row">
				<jstl:forEach items="${hotel.facilities}" var="facility">
				
					<div class=" col-sm-3">
						<div class="panel-heading">
							<h3>${facility.key}</h3>
						</div>
					</div>
					</jstl:forEach>
						</div>
					</div>
					<div class = "row"> 
					<jstl:forEach items="${hotel.facilities}" var="facility">
					
					
					
					 	<div class="col-sm-3">
					 	<table>
									 
								<tr>	<jstl:forEach items="${facility.value}" var="fac">
												<tr><td>${fac}</td></tr>
											</jstl:forEach>	
										 </tr>
						</table>
						 </div>
						 
					 </jstl:forEach>
					</div>
					
					
					
			
				 
			</div>
</div>

 <br><br> <br><br>

<div id="location" class="container-fluid   bg-grey">
  <h2>Address</h2><br>
  <div class="row   slideanim">
    <div class="col-sm-4">
      
         <p>Area  : ${hotel.address.area}</p>
        <p>landMark: ${hotel.address.landMark}</p>
         <p>City  :${hotel.address.city}</p>
         <p>Pincode :${hotel.address.pincode}</p>
        
      
    </div>
    <div class="col-sm-4">
    
        <p>State  : ${hotel.address.state}</p>
        <p>Country: ${hotel.address.nation}</p>
        
      </div>
     
  </div><br>
 <br><br> <br><br> <br><br>
<div id="description" class="container-fluid   bg-grey">
  <h2>Hotel Policies of ${hotel.hotelName}</h2><br>
  <div class="row   slideanim">
    <div class="col-sm-12">
      
         <p> ${hotel.description}</p>
        
      </div>
     
     
  </div><br>
    <br><br>
  
  <h2>What our customers say</h2>
  <div id="reviews">
  <div id="myCarousel" class="carousel slide text-center" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <h4>"" </h4>
      </div>
      <jstl:forEach var="review" items="${hotel.review}">
      <div class="item">
        <h4>"${review.value}"</span></h4>
      </div>
      </jstl:forEach>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  </div>
</div>




<script>
$(document).ready(function(){
  // Add smooth scrolling to all links in navbar + footer link
  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {
    // Make sure this.hash has a value before overriding default behavior
    if (this.hash !== "") {
      // Prevent default anchor click behavior
      event.preventDefault();

      // Store hash
      var hash = this.hash;

      // Using jQuery's animate() method to add smooth page scroll
      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
      $('html, body').animate({
        scrollTop: $(hash).offset().top
      }, 900, function(){
   
        // Add hash (#) to URL when done scrolling (default click behavior)
        window.location.hash = hash;
      });
    } // End if
  });
  
  $(window).scroll(function() {
    $(".slideanim").each(function(){
      var pos = $(this).offset().top;

      var winTop = $(window).scrollTop();
        if (pos < winTop + 600) {
          $(this).addClass("slide");
        }
    });
  });
})
</script>
</body>
</html>





