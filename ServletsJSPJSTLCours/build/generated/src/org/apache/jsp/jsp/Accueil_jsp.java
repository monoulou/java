package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class Accueil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/jsp/Header.jsp");
    _jspx_dependants.add("/jsp/Nav.jsp");
    _jspx_dependants.add("/jsp/Footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/ServletsJSPJSTLCours/css/main.css\" />\n");
      out.write("        <title>Accueil.jsp</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            ");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("    Le site des servlets, de JSP, de JSTL et des JavaBeans …\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"/ServletsJSPJSTLCours/ControleurPrincipal\">Accueil</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        |\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"/ServletsJSPJSTLCours/Authentification\">Se connecter</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        |\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"/ServletsJSPJSTLCours/Catalogue\">Catalogue</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        |\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"/ServletsJSPJSTLCours/PanierCTRL?action=afficherPanier\">Panier</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        |\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"/ServletsJSPJSTLCours/Deconnexion\">Se déconnecter</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        |\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"/ServletsJSPJSTLCours/Inscription\">S'inscrire</a>\n");
      out.write("    </li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <article id=\"articleAccueil\">\n");
      out.write("            <h1>Accueil</h1>\n");
      out.write("            <br>\n");
      out.write("            <label class=\"messageOrange\">\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </label>\n");
      out.write("            <br><br><br><br>\n");
      out.write("            <img src=\"/ServletsJSPJSTLCours/images/elephant.jpg\" alt=\"Photo\" title=\"Photo\" width=\"300\"/>\n");
      out.write("        </article>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    SimpleDateFormat sdfJour = new SimpleDateFormat("EEEE dd MMMM yyyy");
    SimpleDateFormat sdfHeure = new SimpleDateFormat("HH:mm");
    String lsJour = sdfJour.format(new Date());
    String lsHeure = sdfHeure.format(new Date());
    out.print("Nous sommes le " + lsJour + " et il est " + lsHeure);

      out.write("\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
