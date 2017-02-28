/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;


import fr.pb.daos.ArrondissementDAO;
import fr.pb.daos.CinemaDAO;
import fr.pb.entities.Arrondissement;
import fr.pb.entities.Cinema;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;

//import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "SalleDeParisControlleur", urlPatterns = {"/SalleDeParisControlleur"})
public class SalleDeParisControleur extends HttpServlet {

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
            
            CinemaDAO cine = new CinemaDAO(lcnx);
            Cinema c = cine.selectOneByArr(34);
            Cinema d = cine.selectOneByArr(35);
            
            ArrondissementDAO arrondissement = new ArrondissementDAO(lcnx);
            Arrondissement a = arrondissement.selectOne(34);
            Arrondissement e = arrondissement.selectOne(35);
            
            request.setAttribute("arrondissement", a);
            request.setAttribute("cinema", c);
            
            request.setAttribute("secArrondissement", e);
            request.setAttribute("secCinema", d);
            

            getServletContext().getRequestDispatcher("/jsp/SalleDeParis.jsp").forward(request, response);

            lcnx.close();
        } catch (Exception e) {
        }

    } /// doGet

} /// class
