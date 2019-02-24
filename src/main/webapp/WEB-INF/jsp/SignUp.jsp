<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ include file="Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;background-color: gray;}
* {box-sizing: border-box}

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
.whiteText{
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
.required  {
     color:red;
      }
button:hover {
  opacity:1;
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

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
	</head>
<body>

<form action="signup" method="GET" >
   
  <div class="container">
    <h1 class="whiteText">Sign Up</h1>
    <p class="whiteText">Please fill in this form to create an account.</p>
    <hr>

    <label class="whiteText"  for="emailId"><b>Email<span class="required">*</span></b></label>
    <input type="text" placeholder="Enter Email"  pattern="[^ @]*@[^ @]*" name="emailId" value="" required="required">
      <label class="whiteText"  for="userName"><b>UserName<span class="required">*</span></b></label>
    <input type="text" placeholder="Enter userName" name="userName" required="required">
     
    <label class="whiteText" for="password"><b>Password<span class="required">*</span></b></label>
    <input type="password" id="txtPassword" placeholder="Enter Password" name="password" value="" required="required">

    <label class="whiteText"  for="password"><b>Confirm Password<span class="required">*</span></b></label>
    <input type="password" id="txtConfirmPassword" placeholder="Confirm Password" name="password" value="" required="required">
    
    <label class="whiteText">
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>
    
    <p class="whiteText">By creating an account you agree to our <a href="/TermsAndPrivacy.jsp" style="color:dodgerblue">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn" onclick="return Validate()">Sign Up</button>
    </div>
  </div>

</form>
<script type="text/javascript">
    function Validate() {
        var password = document.getElementById("txtPassword").value;
        var confirmPassword = document.getElementById("txtConfirmPassword").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }
</script>

</body>
</html>
