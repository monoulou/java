package cinescopeentities;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DepartementDAOTests {

    /**
     *
     * @param cn
     * @param dao
     */
    private static void testerAjouter(Connection cn, DepartementDAO dao) {
        // Test insert
        int liAffecte = 0;
        try {
            Departement di = new Departement("24", "Dordogne");
            liAffecte = dao.insert(di);
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
    private static void testerSupprimer(Connection cn, DepartementDAO dao) {
        // Test delete
        int liAffecte = 0;
        try {
            Departement dd = new Departement(10, "24", "Dordogne");
            liAffecte = dao.delete(dd);
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
    private static void testerModifier(Connection cn, DepartementDAO dao) {
        // Test update
        int liAffecte = 0;
        try {
            Departement du = new Departement(10, "24", "DORDOGNE");
            liAffecte = dao.update(du);
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
            DepartementDAO dao = new DepartementDAO(cn);

            List<Departement> liste = dao.selectAll();

            for (int i = 0; i < liste.size(); i++) {
                Departement departement = liste.get(i);
                System.out.println(departement.getIdDepartement());
                System.out.println(departement.getCodeDepartement());
                System.out.println(departement.getNomDepartement());
            }
            // Test insert
//            testerAjouter(cn, dao);

            // Test delete
            testerSupprimer(cn, dao);

            // Test update
//            testerModifier(cn, dao);
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    } /// main

} /// class

