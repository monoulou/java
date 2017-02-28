/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pascal
 */
public class Connexion {

//    private Connection icn;

    /**
     * 
     * @param asServeur
     * @param asBD
     * @param asPort
     * @param asUT
     * @param asMDP
     * @return 
     */
    public static Connection getConnexionMySQL(String asServeur, String asBD, String asPort, String asUT, String asMDP) {
        Connection lcn = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            String lsDSN = "jdbc:mysql://" + asServeur + ":" + asPort + "/" + asBD;
            lcn = DriverManager.getConnection(lsDSN, asUT, asMDP);
            lcn.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return lcn;
    }

} /// getConnexionMySQL







