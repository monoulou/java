<%--
    Document : Authentification.jsp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/ServletsJSPJSTLCours/css/main.css" />
        <title>Authentification</title>
    </head>
    <body>
        <header>
            <%@ include file="Header.jsp" %>
        </header>
        <nav>
            <%@ include file="Nav.jsp" %>
        </nav>
        <article>

            <h1>Se Connecter</h1>
            <br>

            <form action="/ServletsJSPJSTLCours/AuthentificationValidation" method="POST">
                <label class="etiquette">Pseudo : </label>
                <input type="text" name="pseudo" value="Casta" />
                <br>
                <label class="etiquette">Mot de passe : </label>
                <input type="password" name="mdp" value="mdp123" /> 
                <br>
                <label class="etiquette">&nbsp;</label>
                <button type="submit" name="btSubmit" id="btSubmit">
                    <img src="/ServletsJSPJSTLCours/icones/connect_gris.jpg" alt="Valider" title="Valider" width="48"/>
                </button>
                <input type="hidden" name="action" value="validerConnexion" />
            </form>

            <br>
            <label>
                ${message}
            </label>

        </article>
