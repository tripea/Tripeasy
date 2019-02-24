<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</head>
<body>
    <h1>TRAVELLERS</h1>
    <form action="/flight/passengerDetails" method="get">
        <div id="passengers">
 
            <!--  First Name : <input type="text"  id=""/> <br />
      Last Name : <input type="text" id=""  /><br />
      Age : <input type="text" id=""  />  -->
            <table>
                <tr>
                    <td><label for="fName">First name:</label> <input type="text"
                        class="form-control" id="fName" name="firstName"></td>
                    <td><label for="lName">Last name:</label> <input type="text"
                        class="form-control" id="lName" name="lastName"></td>
                </tr>
                <tr>
                    <td><label for="age">Age: </label> <input type="number"
                        class="form-control" id="age" name="age"></td>
                    <td><label for="Gender">Gender:</label><select name="Gender"><option
                                value="Male">Male</option>
                            <option value="Female">Female</option>
                            <option value="Other">Other</option></select>
                </tr>
                <tr>
                    <td>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </td>
                </tr>
 
                <hr>
                </div>
            </table>
    </form>
    <div>
        <a href="bookingInformation">Booking Information</a>
    </div>
    <!-- <a href="bookingInformation">Submit</a> -->
    <!--   <form>
    <div id="passengers">
    
      First Name : <input type="text"  id=""/> <br />
      Last Name : <input type="text" id=""  /><br />
      Age :       <input type="text" id=""  /> 
    <hr>
    </div>        
  </form>
 -->
 
    <script type="text/javascript">
    var participantsField = document.getElementById("passengers"),
        form = document.getElementsByTagName("form")[0],
        ContestantNum =  ${numberOf},i;
    for(i=1; i<ContestantNum; i++){
      var clone = participantsField.cloneNode(true);
      form.appendChild(clone);
    }
  </script>
</body>
</html>
 