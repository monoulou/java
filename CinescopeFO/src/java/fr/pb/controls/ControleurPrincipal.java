/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.pb.controls;

import connexion.Connexion;
import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pascal
 */
@WebServlet(name = "ControleurPrincipal", urlPatterns = {"/ControleurPrincipal"})
public class ControleurPrincipal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lsURL = "AccueilFO.jsp";
        
        Connection lcn = Connexion.getConnexionMySQL("127.0.0.1", "cours", "3306", "root", "");
        
        
        getServletContext().getRequestDispatcher("/jsp/" + lsURL).forward(request, response);
    } /// doGet

} /// class

