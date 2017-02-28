
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>SalleDeParis.jsp</title>
        <link href="/CinescopeFO/css/principal.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <%@include file="../jsp/_entete.jsp" %>
        <%@include file="../jsp/_rechercher.jsp" %>
        <%@include file="../jsp/_sommaire.jsp" %>
     

        <div id="centre">

            <h3>Salle de Paris</h3>
            
            <hr>
            ${arrondissement.nomArrondissement} 
            <hr>
            
            <ul>
                 <li>
                ${cinema.nomCinema}
                </li>
            </ul>
                
            <hr>
            ${secArrondissement.nomArrondissement}  
            <hr>
            
            <ul>
                <li>
                ${secCinema.nomCinema}
                </li>
            </ul>
            
           
            
         
        </div>
    </body>
</html>