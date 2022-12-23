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
        <h2>Rest  Succeeded!</h2>
        <span>Action:</span><span>${rest.action}</span><br>
        <span>Path:</span><span>${rest.path}</span><br/>
        <span>Save_date:</span><span>${rest.save_date}</span><br/>
        <span>Save_user:</span><span>${rest.save_user}</span><br/>
          
       
             
    </div>
</body>
</html>