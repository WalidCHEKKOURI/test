<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List" %>
    
    <%@ page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Bienvenue</h3></br>
<h2>Test JSP</h2>

    <%@ include file="/menu.jsp" %>



<!--  
<%!
public int somme(int a, int b)
{
	return a+b;
}
%>

<%

List<String> listUsers=new ArrayList<String>();
String user="testUser1";
listUsers.add(user);

	String nom="Walid";
	int numero=122;
	out.println("Nom: "+nom+", numero: "+numero);
	int res=somme(50,200);
%>
</br>
<%= nom %></br>
<b><%= res %></b></br>
<b><%=listUsers.get(0) %></b>
-->
</body>
</html>