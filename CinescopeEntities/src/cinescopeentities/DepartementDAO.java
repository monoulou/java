package cinescopeentities;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pascal
 */
public class DepartementDAO implements IDAO<Departement> {

    private final Connection icnx;

    public DepartementDAO(Connection acn) {
        icnx = acn;
    }

    /**
     *
     * @param objet
     * @return
     */
    @Override
    public int insert(Departement objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("INSERT INTO departement(code_departement, nom_departement) VALUES(?,?)");
            lpst.setString(1, objet.getCodeDepartement());
            lpst.setString(2, objet.getNomDepartement());
            liAffecte = lpst.executeUpdate();
            lpst.close();
        } catch (SQLException e) {
            liAffecte = -1;
        }
        return liAffecte;
    } /// insert

    /**
     * 
     * @return 
     */
    @Override
    public List<Departement> selectAll() {

        List<Departement> liste = new ArrayList();
        try {
            PreparedStatement lpst = icnx.prepareStatement("SELECT * FROM departement");
            ResultSet lrs = lpst.executeQuery();
            Departement d;
            while (lrs.next()) {
                d = new Departement(lrs.getInt(1), lrs.getString(2), lrs.getString(3));
                liste.add(d);
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
        }
        return liste;
    } /// selectAll

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Departement selectOne(int id) {
        Departement d = null;
        try {
            PreparedStatement lpst = icnx.prepareStatement("SELECT * FROM departement WHERE id_departement = ?");
            lpst.setInt(1, id);
            ResultSet lrs = lpst.executeQuery();

            if (lrs.next()) {
                d = new Departement(lrs.getInt(1), lrs.getString(2), lrs.getString(3));
            } else {
                d = new Departement(0, "Introuvable", "");
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            /// est null
        }
        return d;
    } /// selectOne

    /**
     * 
     * @param objet
     * @return 
     */
    @Override
    public int delete(Departement objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("DELETE FROM departement WHERE id_departement = ?");
            lpst.setInt(1, objet.getIdDepartement());
            liAffecte = lpst.executeUpdate();
            lpst.close();
        } catch (SQLException e) {
            liAffecte = -1;
        }
        return liAffecte;
    } /// delete

    /**
     *
     * @param objet
     * @return
     */
    @Override
    public int update(Departement objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("UPDATE departement SET code_departement = ?, nom_departement = ? WHERE id_departement = ?");
            lpst.setString(1, objet.getCodeDepartement());
            lpst.setString(2, objet.getNomDepartement());
            lpst.setInt(3, objet.getIdDepartement());
            liAffecte = lpst.executeUpdate();
            lpst.close();
        } catch (SQLException e) {
            liAffecte = -1;
        }
        return liAffecte;
     } /// update

} /// class

