
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Form</title>
</head>
<body>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		    integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		    crossorigin="anonymous"></script>
	<script
		    src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		    integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		    crossorigin="anonymous"></script>
	<script
		    src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		    crossorigin="anonymous"></script>

	<script
		    src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
	<link rel="stylesheet"
		    href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
		    integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
		    crossorigin="anonymous" />



	<style type="text/css">
.error {
	color: #F00;
}
</style>
<div align="center" class="card">
        <h2 style="background-color:DodgerBlue;">Contact Information </h2>
        <form:form action="register" method="post" modelAttribute="contact" cssClass="form" id="frm">
 <form:hidden path="id"/>

<table style="background-color:LightGray;width:100%;max-width:550px;border:0;" cellpadding="8" cellspacing="0">
<tr> <td>
<label for="name">Name*:</label>
</td> <td>
<input name="name" type="text" maxlength="60" style="width:100%;max-width:250px;" />
</td> </tr> <tr> <td>
<form:errors path="name"/> 

<label for="address">Address:</label>
</td> <td>
<input name="address" type="text" maxlength="43" style="width:100%;max-width:250px;" />
</td> </tr> <tr> <td>
<form:errors path="address"/> 

<label for="gender">Gender*:</label>
</td> <td>
<input type="radio" name="gender" value="male"> Male
<input type="radio" name="gender" value="female"> Female
</td> </tr> <tr> <td>
<form:errors path="gender"/> 
<label for="interestedinIT">InterestedInIT*:</label>
</td><td>
<input type="checkbox" name="interestedinIT" value="yes"> yes
</td> </tr> <tr> <td>
<form:errors path="interestedinIT"/> 
<label for="coursesinterested"> coursesinterested :</label>
</td><td>
<select name="coursesinterested" id="coursesinterested">
 <option value="">Select any option</option>
  <option value="java">java</option>
  <option value=".Net">.Net</option>
  <option value="React">React</option>
  <option value="Python">Python</option>
</select>
</td> </tr> <tr> <td>
<form:errors path="coursesinterested"/>

<label for="percentage">Percentage:</label>
</td> <td>
<input name="percentage" type="text" maxlength="43" style="width:100%;max-width:250px;" />
</td> </tr> <tr> <td>
<form:errors path="percentage"/> 

<!--  <label for="percentageinWords">percentageinWords:</label>
</td> <td>
<input name="percentageinWords" type="text" maxlength="43" style="width:100%;max-width:250px;" />
</td> </tr> <tr> <td>
<form:errors path="percentageinWords"/> -->



<input name="Submit" type="submit" value="Submit" />
</form:form>
</div>
</td> </tr>
</table>

<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js"></script>

	<script type="text/javascript">



		alert("addForm");
		$(document).ready(function(){
			$('#frm').validate({

				rules: {
					name: {
						required: true,
						minlength: 3,
						
					},
					address: {
						required:true,
						minlength:5,
						
					},
					gender: {
						required: true,
					},
					interestedinIT: {
						required:true,
						
					},
					coursesinterested: {
						required:true,
						
						
						
					},
					percentage: {
						required:true,
						
					},
					
					
				},
				messages: {
					
					name: {
						required: "please enter name",
						minlength: "Name should be contain  atleast 3 characters",
						
					},
					address: {
						required: "please enter address",
						minlength: "address should have atleast 5 characters",
					},
					gender:{
						required: "You must select at least one radiobutton",
					},
					interestedinIT: {
						required: "please select interestedinIT",
					},
					coursesinterested: {
						required: "select one option",
						
					},
					percentage: {
						required: "please enter percentage",
					},
					
				},
				submitHandler: function(form) {
					form.submit();
				}
			}
			);
			
			
		})
			
	
	</script>
</body>
</html>
		
