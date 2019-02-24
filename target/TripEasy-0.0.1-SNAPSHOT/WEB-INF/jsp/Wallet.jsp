<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jstl/core_rt"%>
<%@ include file="Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
jQuery library
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
Latest compiled JavaScript
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> -->


<style>
.btn {
	float: right;
}

.table {
	width: 100%;
}
</style>
<title>Wallet UI</title>
</head>
<body>

	<br>
	<!-- <div class="panel panel-default">
    <div class="panel-body">A Basic Panel</div>
  </div> -->
	<div class="container">
		<div class="panel panel-default"
			style="background-color: #ffffff; border: 1px solid black;">
			<div style="text-align: center; border: 1px #5E4485">
				<h4 style="font-family: fantasy; font-size: 2vw; color: black;">My
					TripEasy Money</h4>
			</div>
			<div class="col-sm-6" style="float: right; font-size: 2vw">
				<jstl items="${currentBalance}">
				<tr>
					<td><h3>${wallet.currentBalance}</h3></td>
				</tr>
					</jstl>
			</div>
			<br>
			<div class="col-sm-6" style="float: left;">
				<a href="/wallet/addMoney" class="btn btn-info" role="button"
					style="background-color: black;">Add Money</a>

			</div>
		
			<br> <br> <br>
		</div>
		<h4>My Statement</h4>

		<table class="table table-hover">
			<thead>
				<tr>
					<!-- 		<th>Profile-ID</th> -->
					<th>Transaction Type</th>
					<th>Amount</th>
					<th>Transaction Remarks</th>
					<th>Transaction ID</th>
					<th>Date-Time</th>
				</tr>
			</thead>
			<tbody>
				<jstl:forEach var="statement" items="${wallet.statements}">
					<tr>
						<%-- 							<td>${statement.wallet.profileId}</td>
 --%>
						<td>${statement.transactionType}</td>
						<td>${statement.amount}</td>
						<td>${statement.transactionRemarks}</td>
						<td>${statement.transactionId}</td>
						<td>${statement.dateTime}</td>
					</tr>
				</jstl:forEach>
			</tbody>
		</table>


	</div>
</body>
</html>