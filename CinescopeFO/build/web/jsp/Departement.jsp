<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Departement.jsp</title>
        <link href="/CinescopeFO/css/principal.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <%@include file="../jsp/_entete.jsp" %>
        <%@include file="../jsp/_rechercher.jsp" %>
        <%@include file="../jsp/_sommaire.jsp" %>
     

        <div id="centre">

            <h3>Liste des départements</h3>
            
            <select>
                
            <c:forEach var="departement" items="${listeDepartement}">
              
                    <option value="${departement.idDepartement}">${departement.nomDepartement}</option>
                  
            </c:forEach>
                    
            </select>  
           
       
        <%@include file="../jsp/_pied.jsp" %>
         </div>
    </body>
</html>
