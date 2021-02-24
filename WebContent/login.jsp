<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="navig" method="post">
	Nom :<input type="text" name="nom"/> </br>
	<input type="submit" value="Send!!"/>
</form></br>

<h4>
<%
String msg = (String) request.getAttribute("message");

if(msg != null)
{
out.println(msg);	
}

%> 
</h4>

</body>
</html>