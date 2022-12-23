<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
    span {
        display: inline-block;
        width: 200px;
        text-align: right;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Contact Succeeded!</h2>
        <span>Id:</span><span>${contact.id}</span><br>
        <span>Name:</span><span>${contact.name}</span><br/>
        <span>Address:</span><span>${contact.address}</span><br/>
        <span>Gender:</span><span>${contact.gender}</span><br/>
           <span>interestedinIT:</span><span>${contact.interestedinIT}</span><br/>
       <span>coursesinterested:</span><span>${contact.coursesinterested}</span><br/>
       <span>Percentage:</span><span>${contact.percentage}</span><br/>
             
    </div>
</body>
</html>