/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.pb.controls;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pascal
 */
@WebServlet(name = "JsonHein", urlPatterns = {"/JsonHein"})
public class JsonHein extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        response.setContentType("application/json;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = response.getWriter();
        
        
        String stringJSON = "{\n"
                    +"  \"prenom\": \"Annabelle\", \n"
                    +"  \"age\": 23\n"
                    +"}";
                    
       out.print(stringJSON);
       
    } /// doGet

} /// class
