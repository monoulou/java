package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Authentification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/jsp/Header.jsp");
    _jspx_dependants.add("/jsp/Nav.jsp");
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
      out.write("        <title>Authentification</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("        <article>\n");
      out.write("\n");
      out.write("            <h1>Se Connecter</h1>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <form action=\"/ServletsJSPJSTLCours/AuthentificationValidation\" method=\"POST\">\n");
      out.write("                <label class=\"etiquette\">Pseudo : </label>\n");
      out.write("                <input type=\"text\" name=\"pseudo\" value=\"Casta\" />\n");
      out.write("                <br>\n");
      out.write("                <label class=\"etiquette\">Mot de passe : </label>\n");
      out.write("                <input type=\"password\" name=\"mdp\" value=\"mdp123\" /> \n");
      out.write("                <br>\n");
      out.write("                <label class=\"etiquette\">&nbsp;</label>\n");
      out.write("                <button type=\"submit\" name=\"btSubmit\" id=\"btSubmit\">\n");
      out.write("                    <!--<img src=\"/ServletsJSPJSTLCours/icones/connect_gris.jpg\" alt=\"Valider\" title=\"Valider\" width=\"48\"/>-->\n");
      out.write("                </button>\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"validerConnexion\" />\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <label>\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </label>\n");
      out.write("\n");
      out.write("        </article>\n");
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
