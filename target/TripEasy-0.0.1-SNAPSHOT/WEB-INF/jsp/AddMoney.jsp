<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Money</title>
</head>
<body>
	<div class="container">
		<form action="add">
		
		
			<div style="text-align: center; border: 1px #5E4485">
				<h4
					style="font-family: Arial, Helvetica, sans-serif; font-size: 2vw; color: black;">
					Add Money</h4>
				<div class="form-group" style="font-size: 2vw;">
					<label for="usr">
					<table>
					<tr>
				<td>
					Enter profile Id:<input type="number"  class="form-control" name="profileId">
					</td></tr>
					<tr>
					<td>
					Transaction Remarks:<input type="text"  class="form-control" name="transactionRemarks">
					</td></tr>
					<tr>
					<td>
					Transaction Type:<input type="text"  class="form-control" name="transactionType"></td></tr>
					<tr>
					<td>
					Enter Amount(In Rupees):
					</td>
					</tr>
					</table></label> <input
						type="text" class="form-control" id="usr" name="amount">
						
				</div>
				<br> <br>
				<button class="btn btn-info" role="button"
					style="background-color: black; color: white; size: 100px;">Submit</button>

			</div>
		</form>
	</div>
</body>
</html>