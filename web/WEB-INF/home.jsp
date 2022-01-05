<%-- 
    Document   : home
    Created on : 5 janv. 2022, 10:11:15
    Author     : joelg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        
        <div class="container">
             <h1>Hello ${user.prenom} ${user.nom} !</h1>
        </div>
    
    </body>
</html>
