<%-- 
    Document   : rechercher
    Created on : 4 août 2014, 11:57:31
    Author     : pascal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<form action="RechercheResultats.jsp">-->
<div id="rechercher">
<form action="/CineScope2014FO/ControleurPrincipal?ressource=RechercheResultats.jsp" method="POST">
    <label class="etiquetteLongue">Rechercher (titre ou acteur ...) ? </label>
    <input type="search" name="recherche" value="Mistic" />
    <input type="submit" value="Rechercher" />
</form>
</div>
