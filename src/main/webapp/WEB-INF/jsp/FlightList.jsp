<!-- Shubham Raut -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Header.jsp" %>

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

<title>Flight</title>

<style type="text/css">
.flight {
	background-color: #ddd;
	margin: 10px;
	padding: 20px;
}

body {
	
}
</style>

</head>
<body>


	<div class="container">
		
		<jstl:forEach var="flight" items="${ flights}">

			<div class="row flight">
				<div class="col-lg-2">
					<img alt="flight_logo"
						src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAHgAAAB4CAMAAAAOusbgAAAAZlBMVEX///8AAAB7e3vR0dHU1NTLy8vY2NjIyMgLCwsQEBDu7u7y8vK7u7t1dXXn5+fh4eEiIiL5+fk1NTU9PT2hoaGpqambm5uBgYFeXl6JiYkvLy8VFRVqampZWVlPT0+QkJBFRUWysrJAXP1lAAAEQUlEQVRogcWb56KiMBCFQREQkCIr9sL7v+SiXhWSmZTJGM/PXfSTkGkn3CDwrnh/PPzzj00u4V2eyU3Rhk/VPrH5Zh2+tPSHLa91+NHeG3YVThT7wWanKTa8+OHGoajEC3cucVs/3KUELrxwjxJ33fjgyvfrJW3J+2rIWtlvuOH1R9yw/BF39XWuHL8PVV/nAvt50OnrXDl+H5pu6SaOq4w1rCP4fsNo+utuwz8dLrtVV0RlljNw4X0VhovJVcnk/47tbrXfJGXusAIIN51WpQS+Kqwvq31XxIQFiFP4G824Hx12265fmMc9ZZ3Vak/Xvoh1qTZCPj2fXFVZcN+qz9tNsajgh4DEr8ANVvBVJlrWh9sQB4u4HG9DLH4FboD8PCvV7WW33ww/IMfjV+QGNXwdScv15YR830LkBltGMKoU6CpLH2Cwm61a/QcdJa/zU7HY5zNL2lej9d7/hjuo6db6r/gC944uLj/h3jXfsXOxfSUqniEFjSYofjFlHSPachrtmdLo0nSdP1qwPGxSIyt6FhQR/Ybs6rria2q7mm9uTuCUPqw4JhUnT2nuUEEcvZ2K3Cts3MDDw/5HA3P4hgWlXdgxgEkPm8s4LLeWabxlG3wzu3ahZrRZ8t4mqfCaw8nZGGxfntSKTYsXt1lamZYPZg8Pm39l8VpL2PwLiNUQx+ZfSAdGLjb/gqo5nKunMF8FlkMrIHItkybXaYstlyuQrblMpw/m8fvWloNrEb9vcVRkJH6PyrzNcEwcIXkjVluDzlzMBx7mbuUtGx0xVd0MFVyPHvOg0oWNtNQg6JRrBt7vs9CrehKDQCYYP3/+RqG4RN/TE8aF1zI2ip5b29OrfrWGGwSKQUPbCti7XKNtk+ElWluRXbjK58QMTqeNq8IC1oHtLA/Jz8HnKt0wkdtwU6lRxwuXthXILe4ZGBDQJGIwnDedWd07QmkQDcdOD75/3GQsmoEftbtaVqVfcfirNsjVZ0OwwQwMgxvkaptWIFe7W8jiYUXGAjwoOuENJQLGkojtMFGivjW2XZAkYtIKCOrhcoeBkSTS24OHPT6zAAdwLBKHc4CMguHmi2jvAc0rCm7AvEl1BeTIwnNRD4FvRJdNTsI4OD8A4JRq70mVQ5F9wQ6Z6gpInZwCnEFgqiuQibesqjdQ+JFdAbFeqcBQ3iQP5+K8pqywwARHH87PFmDgrTX6q3KFBTiQI8q8FRAlzEZqcC+ByQduYkRpuii5mtLf/8xSC7A8wTkcEMwswFLcm70mAKuyAMsTHKkV+NPOAixVUhefPrEAS82Xk08/cn20LYWYRJxO+kZ7VX+YJKQ6aivw0GdQMHhiQqo7OL3I/Yook5Qv2kBOPv3f5G6W8YUkQujpx+ShLteGZ+DCBOfp70/uuo65fKe5ek2aL+6jTaVG/ZKXPwN5K/4R92MD+ea+SoVLZSKqXKXhCQ+k/xd1M1WVfO2QAAAAAElFTkSuQmCC"
						width="40px" height="30px" style="margin: 5px">
				</div>
				<div class="col-lg-2">
					${flight.airline}<br> ${flight.flightName }
				</div>

				<div class="col-lg-3">
					${flight.source} <br> ${flight.time}
				</div>

				<div class="col-lg-2">${flight.destination}</div>

				<div class="col-lg-1">Price</div>


				<a class="col-lg-2" href="selectSeats?flightId=${flight.flightId}">Book</a>


			</div>

		</jstl:forEach>

	</div>



</body>
</html>