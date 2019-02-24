<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
 
<div class="container">
 
    <h1> Profile</h1>
      <hr>
    <div class="row">
      <!-- left column -->
      <div class="col-md-3">
        <div class="text-center">
         <!--  <img src="//placehold.it/100" class="avatar img-circle" alt="avatar"> -->
         <!--  <input type="file" class="form-control"> -->
        </div>
      </div>
        <spring:form   action="profiles"  class="form-horizontal" role="form" modelAttribute="profile" >
       
      <div class="col-md-9 personal-info">
      <jstl:if test="${profile !=null}">
        
        <h3 align="center">Personal info</h3>  
       
        
        <span class="border-top"><a href="/update">edit</a></span>
        <div class="form-group">
            <label class="col-lg-3 control-label">Profile Id:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="${message.profileId }" name="profileId" readonly="readonly">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Full name:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="${message.fullName}" name="fullName" readonly="readonly">
            </div>
          </div>
          
         <%--  <div class="form-group">
            <label class="col-lg-3 control-label">Gender:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="${profile.gender}" name="gender">
            </div>
          </div> --%>
          <div class="form-group">
            <label class="col-lg-3 control-label">ContactNumber:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="${message.contactNumber}" name="contactNumber" readonly="readonly">
            </div>
          </div>
          <%-- <div class="form-group">
            <label class="col-lg-3 control-label">DateOfBirth:</label>
            <div class="col-lg-8">
              <input class="form-control" type="date" value="${profile.dateOfBirth}" name="dateOfBirth" >
            </div>
              </div> --%>
          <div class="form-group">
            <label class="col-lg-3 control-label">Email:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="${message.emailId}" name="emailId" readonly="readonly">
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-3 control-label">UserName:</label>
            <div class="col-md-8">
              <input class="form-control" type="text" value="${message.userName}" name="userName" readonly="readonly">
            </div>
            </div>
      <%--       <div class="form-group">
            <label class="col-lg-3 control-label">Street name:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="${profile.address.streetName}" name="streetName" >
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Street no:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="${profile.address.streetNo}" name="streetNo" >
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">City:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="${profile.address.city}" name="city" >
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">PinCode:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="${profile.address.pincode}" name="pincode" >
            </div>
          </div> --%>
            </jstl:if>          
          <!-- <div class="form-group">
            <label class="col-md-3 control-label"></label>
            <div class="col-md-8">
              <input type="button" class="btn btn-primary" value="Save Changes">
              <span></span>
              <input type="reset" class="btn btn-default" value="Cancel">
 
            </div>
            
          </div> -->
      </div>
      </spring:form>
  </div>
  
 </div>
<hr>
</body>
</html>