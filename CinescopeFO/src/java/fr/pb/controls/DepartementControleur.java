/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import cinescopeentities.Departement;
import cinescopeentities.DepartementDAO;
//import fr.pb.daos.DAOGeneriqueSimple;
import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "DepartementControleur", urlPatterns = {"/DepartementControleur"})
public class DepartementControleur extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        Connection lcnx = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            lcnx = DriverManager.getConnection("jdbc:mysql://172.26.55.55:3306/cinescope2014", "p", "b");
            
            DepartementDAO dao = new DepartementDAO(lcnx);
            //String[] tCols = {"NOM_DEPARTEMENT"};
            //Map<String, String> mapOrder = new HashMap();
            //mapOrder.put("TOTAL_ENTREES", "DESC");
            List<Departement> listeDepartement = dao.selectAll();

            request.setAttribute("listeDepartement", listeDepartement);
            getServletContext().getRequestDispatcher("/jsp/Departement.jsp").forward(request, response);

            lcnx.close();
        } catch (Exception e) {
        }

    } /// doGet

} /// class