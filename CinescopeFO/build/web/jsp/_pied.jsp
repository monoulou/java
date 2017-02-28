<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.Date,java.text.SimpleDateFormat"%>

<footer id="pied">
<%
    SimpleDateFormat dfJour = new SimpleDateFormat("dd MMMM yyyy");
    SimpleDateFormat dfHeure = new SimpleDateFormat("HH:mm");
    out.print("A Paris nous sommes le " + dfJour.format(new Date()));
    out.println(" et il est " + dfHeure.format(new Date()));
%>
</footer>
