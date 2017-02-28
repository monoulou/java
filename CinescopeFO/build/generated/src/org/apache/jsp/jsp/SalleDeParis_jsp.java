package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SalleDeParis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/jsp/../jsp/_entete.jsp");
    _jspx_dependants.add("/jsp/../jsp/_rechercher.jsp");
    _jspx_dependants.add("/jsp/../jsp/_sommaire.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>SalleDeParis.jsp</title>\n");
      out.write("        <link href=\"/CinescopeFO/css/principal.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header id=\"entete\">\n");
      out.write("    <p>Site BO</p>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<form action=\"RechercheResultats.jsp\">-->\n");
      out.write("<div id=\"rechercher\">\n");
      out.write("<form action=\"/CineScope2014FO/ControleurPrincipal?ressource=RechercheResultats.jsp\" method=\"POST\">\n");
      out.write("    <label class=\"etiquetteLongue\">Rechercher (titre ou acteur ...) ? </label>\n");
      out.write("    <input type=\"search\" name=\"recherche\" value=\"Mistic\" />\n");
      out.write("    <input type=\"submit\" value=\"Rechercher\" />\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav id=\"sommaire\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"/CinescopeFO/ControleurPrincipal?ressource=AccueilFO.jsp&chemin=jsp\">Accueil</a></li>\n");
      out.write("\n");
      out.write("        <li><a href=\"/CineScopeFO/ControleurPrincipal?ressource=FilmsTous.jsp\">Tous les films</a></li>\n");
      out.write("\n");
      out.write("        <li><a href=\"/CineScopeFO/ControleurPrincipal?ressource=FilmsNouveaux.jsp\">Nouveaux films</a></li>\n");
      out.write("        <li><a href=\"/CineScopeFO/ControleurPrincipal?ressource=FilmsAutres.jsp\">Autres films</a></li>\n");
      out.write("        <li><a href=\"/CineScopeFO/ControleurPrincipal?ressource=FilmsReprises.jsp\">Reprises</a></li>\n");
      out.write("\n");
      out.write("        <li><a href=\"/CinescopeFO/BoxOffice\">Box Office</a></li>\n");
      out.write("        <li><a href=\"/CinescopeFO/DepartementControleur\">Liste départements</a></li>\n");
      out.write("        <li><a href=\"/CineScopeFO/ControleurPrincipal?ressource=HitParadeDuPublic.jsp\">Hit parade</a></li>\n");
      out.write("        <li><a href=\"/CineScopeFO/ControleurPrincipal?ressource=AvisDesCritiques.jsp\">Avis des critiques</a></li>\n");
      out.write("\n");
      out.write("        <li><a href=\"/CineScopeFO/SalleDeParisControleur\">Salles de Paris</a></li>\n");
      out.write("        <li><a href=\"/CineScopeFO/SallePeripherieControleur\">Salles de la périphérie</a></li>\n");
      out.write("\n");
      out.write("        <li><a href=\"/CineScopeFO/ControleurPrincipal?ressource=RechercheAvancee.jsp\">Recherche avancée</a></li>\n");
      out.write("\n");
      out.write("        <li><a href=\"/CineScopeFO/ControleurPrincipal?ressource=Articles.jsp\">Les articles</a></li>\n");
      out.write("        <li><a href=\"/CineScopeFO/ControleurPrincipal?ressource=AvantPremieres.jsp\">Avant-premières</a></li>\n");
      out.write("        <li><a href=\"/CineScopeFO/ControleurPrincipal?ressource=Festivals.jsp\">Festivals</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("        <div id=\"centre\">\n");
      out.write("\n");
      out.write("            <h3>Salle de Paris</h3>\n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstArrondissement.nomArrondissement}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <ul>\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${secArrondissement.nomArrondissement}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </ul>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
