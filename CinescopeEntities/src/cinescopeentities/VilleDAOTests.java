package cinescopeentities;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class VilleDAOTests {

    /**
     *
     * @param cn
     * @param dao
     */
    private static void testerAjouter(Connection cn, VilleDAO dao) {
        // Test insert
        int liAffecte = 0;
        try {
            Ville i = new Ville("94600", "Saint-Mandé", 7);
            liAffecte = dao.insert(i);
            if (liAffecte == 1) {
                cn.commit();
            }
        } catch (SQLException e) {
            liAffecte = -1;
        }
        System.out.println("Ajouté : " + Integer.toString(liAffecte));
    } /// testerAjouter

    /**
     *
     * @param cn
     * @param dao
     */
    private static void testerSupprimer(Connection cn, VilleDAO dao) {
        // Test delete
        int liAffecte = 0;
        try {
            Ville d = new Ville(4, "", "",0);
            liAffecte = dao.delete(d);
            if (liAffecte == 1) {
                cn.commit();
            }
        } catch (SQLException e) {
            liAffecte = -1;
        }
        System.out.println("Supprimé : " + Integer.toString(liAffecte));
    } /// testerSupprimer

    /**
     *
     * @param cn
     * @param dao
     */
    private static void testerModifier(Connection cn, VilleDAO dao) {
        // Test update
        int liAffecte = 0;
        try {
            Ville u = new Ville(2, "24200", "SARLAT", 1);
            liAffecte = dao.update(u);
            if (liAffecte == 1) {
                cn.commit();
            }
            System.out.println("Modifié : " + Integer.toString(liAffecte));
        } catch (SQLException e) {
        }
    } /// testerModifier

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

//        int liAffecte = 0;
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://172.26.55.55:3306/cinescope2014", "p", "b");
            cn.setAutoCommit(false);
            VilleDAO dao = new VilleDAO(cn);

            List<Ville> liste = dao.selectAll();

            for (int i = 0; i < liste.size(); i++) {
                Ville ville = liste.get(i);
                System.out.println(ville.getIdVille());
                System.out.println(ville.getCp());
                System.out.println(ville.getNomVille());
                System.out.println(ville.getIdDepartement());
            }
            // Test insert
//            testerAjouter(cn, dao);

            // Test delete
//            testerSupprimer(cn, dao);
            // Test update
//            testerModifier(cn, dao);
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    } /// main

} /// class

