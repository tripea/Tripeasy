
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>
<title>Bootstrap datepicket demo</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script type='text/javascript' src='//code.jquery.com/jquery-1.8.3.js'></script>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker3.min.css">
<script type='text/javascript'
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.min.js"></script>
<script type='text/javascript'>
	$(function() {
		$('.input-group.date').datepicker({
			calendarWeeks : true,
			todayHighlight : true,
			autoclose : true
		});
	});
</script>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: silver;
}

* {
	box-sizing: border-box
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

.whiteText {
	color: green;
}

hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.required {
	color: red;
}

button:hover {
	opacity: 1;
}

/* Extra styles for the cancel button */
.cancelbtn {
	padding: 14px 20px;
	background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
	float: left;
	width: 50%;
}

/* Add padding to container elements */
.container {
	padding: 16px;
}

/* Clear floats */
.clearfix::after {
	content: "";
	clear: both;
	display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 100px) {
	.cancelbtn, .signupbtn {
		width: 100%;
	}
}
</style>



</head>
<body>
	<form action="saveHotel" method="get">

 		<div class="row">

			<div class="col-sm-8">
				<label class="whiteText" for="email"><b>Enter Email
						Address<span class="required">*</span>
				</b></label> <input type="text" placeholder="Enter Email"
					pattern="[^ @]*@[^ @]*" name="emailId" value="" required="required">

				<label class="whiteText" for="userName"><b>Enter Full
						Name<span class="required">*</span>
				</b></label> <input type="text" placeholder="Enter Full Name" name="fullName"
					required="required"> <label class="whiteText"
					for="userName"><b>Enter Number OF Guests<span
						class="required">*</span></b></label> <br> <input type="number"
					placeholder="Enter Number OF Guests" name="numberOfGuest"
					required="required">
			</div>

		</div>

 
		<table class="table">
			<thead>
				<tr>
					<th>Per Day Amount Of Room</th>
					<th>Check In Date</th>
					<th>Check Out Date</th>
					<th>Total Amount</th>

				</tr>
			</thead>

			<tr>

				<td><input type="number" id="roomPrice" readonly="readonly"
					value="${roomprice}"></td>
				<td><input type="date" pattern="\d{1,2}/\d{1,2}/\d{4}"
					id="checkIn" class="datepicker" name="checkInDate" value="" /></td>

				<td><input type="date" pattern="\d{1,2}/\d{1,2}/\d{4}"
					onchange="compute()" id="checkOut" class="datepicker"
					name="checkOutDate" value="" /></td>
				<td><input type="number" name="finalAmount" id="finalAmount"
					value="${roomprice}" readonly="readonly"></td>
			</tr>

		</table>

		<div class="clearfix">
			<button type="button" class="cancelbtn">Cancel</button>
			<button type="submit" class="signupbtn">Pay Now</button>
		</div>

		<script>
			function compute() {

				var a = document.getElementById("checkIn").value;
				var year = a.split("-")[0];
				var month = a.split("-")[1];
				var day = a.split("-")[2];
				var str = month + "/" + day + "/" + year;
				//alert(str);
				var b = document.getElementById("checkOut").value;
				var year1 = b.split("-")[0];
				var month1 = b.split("-")[1];
				var day1 = b.split("-")[2];
				var str1 = month1 + "/" + day1 + "/" + year1;

				var date1 = new Date(str);
				var date2 = new Date(str1);
				var timeDiff = Math.abs(date2.getTime() - date1.getTime());
				var diffDays = Math.ceil(timeDiff / (1000 * 3600 * 24));

				var roomPrice = document.getElementById("roomPrice").value;
				var amt = parseInt(diffDays * roomPrice);
				//alert(amt); 
				document.getElementById("finalAmount").value = amt;

			}
		</script>

	</form>
</body>

</html>
