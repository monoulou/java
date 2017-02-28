<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>BoxOffice.jsp</title>
        <link href="/CinescopeFO/css/principal.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <%@include file="../jsp/_entete.jsp" %>
        <%@include file="../jsp/_rechercher.jsp" %>
        <%@include file="../jsp/_sommaire.jsp" %>
     

        <div id="centre">

            <h3>Box office</h3>
            
            <table>
                <thead>
                    <tr>
                        <td> Titre Film</td>
                        <td> Nombre Entrée</td>
                    </tr>
                </thead>
            
                <tbody>
            <c:forEach var="ligne" items="${TBO}">
                <tr>
                <c:forEach var="champ" items="${ligne}">
                       
                         <td> ${champ} </td>
                 
                </c:forEach>
                </tr>   
            </c:forEach>
                            
        </tbody>
        </table>
        </div>

        <%@include file="../jsp/_pied.jsp" %>
    </body>
</html>