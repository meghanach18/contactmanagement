<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact List</title>


		
<!-------------Bootstrap------------>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


<!----------JQUERY------------>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>

<!----------JQUERY Data Tables for CSS--------------->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.23/datatables.min.css" />

<link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.6.5/css/buttons.dataTables.min.css">
<link rel="stylesheet" href = "https://cdn.datatables.net/select/1.3.1/css/select.dataTables.min.css">
<!-- Font awesome -->
<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" />
<!-- -------JQUERY Data tables for JS -->
<script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.10.23/datatables.min.js"></script>
<script src = "https://cdn.datatables.net/select/1.3.1/js/dataTables.select.min.js"></script>
<!------CDN links for export files -->
<script src="https://cdn.datatables.net/buttons/1.6.5/js/dataTables.buttons.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
<script src="https://cdn.datatables.net/buttons/1.6.5/js/buttons.html5.min.js"></script>
<!--Print Button -->
<script src="https://cdn.datatables.net/buttons/1.6.5/js/buttons.print.min.js"></script>
<!--Column Visibility -->
<script src="https://cdn.datatables.net/buttons/1.6.5/js/buttons.colVis.min.js"></script>
<style type="text/css" >
<style>
    #bttn{
    padding-bottom: 100px;
    } 




</style>
	

</head>
<body>
	<div class="container">
		<h2 align="center">Contact List </h2>
		 <a class=btn btn-primary href="/addContact">Add Contact</a>
		 <table class="table table-striped" id="my_table" >

		
		
			<thead>
			<th scope="row">Id</th>
    <th scope="row">Name</th>
    <th scope="row">Age</th>
   <th scope="row">Address</th>
    <th scope="row">Gender</th>
    <th scope="row">Interested in IT</th>
        <th scope="row">Courses Interested</th>
      <th scope="row">Percentage</th>
      <th scope="row">percentageinWords</th>
      <th scope="row">Ip</th>
        <th scope="row">Location</th>
    <th scope="row">Update</th>
    <th scope="row">Delete</th>
    
    


  
			</thead>
			<tbody>
				<c:forEach items="${contactList}" var="contact">
					<tr>

						<td>${contact.id }</td>
						<td>${contact.name }</td>
						<td>${contact.age }</td>
						<td>${contact.address }</td>
						<td>${contact.gender }</td>
						<td>${contact.interestedinIT }</td>
						<td>${contact.coursesinterested }</td>
						<td>${contact.percentage}</td>
						<td>${contact.percentageinWords}</td>
						<td>${contact.ip}</td>
						<td>${contact.location}</td>
						
						
			          
						   <td><a class ="btn btn-success"href="/updateContact/${contact.id}">Update</a></td>
                           <td><a class= "btn btn-danger" href="/deleteContact/${contact.id}">Delete</a></td>
						
					</tr>       
				</c:forEach>

			</tbody>
		</table>
		</div>
		
		



<script>
$(document).ready(function() {
	   $('tr:odd').css('background-color', '#c5ecfa');
	  $('tr:even').css('background-color', 'white');
	    $('#my_table').DataTable({
	        
	     dom: 'Bfrtip',
	        buttons: [
	            'csv', 'excel'
	        ]
	    } );
	    });


</script>
		

</body>
</html>





 




