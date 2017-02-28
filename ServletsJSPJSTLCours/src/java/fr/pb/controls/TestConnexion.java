/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.pb.controls;

import connexion.Connexion;
import java.sql.*;

/**
 *
 * @author formation
 */
        
public class TestConnexion {
    
    public static void main(String[] args) {
        Connection lcn = Connexion.getConnexionMySQL("127.0.0.1", "cours", "3306", "root", "");
        System.out.println(lcn); 
    }
   
}

