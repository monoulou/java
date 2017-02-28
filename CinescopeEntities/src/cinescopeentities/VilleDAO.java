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
public class VilleDAO implements IDAO<Ville> {

    private final Connection icnx;

    public VilleDAO(Connection acn) {
        icnx = acn;
    }

    /**
     *
     * @param objet
     * @return
     */
    @Override
    public int insert(Ville objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("INSERT INTO ville(cp, nom_ville, id_departement) VALUES(?,?,?)");
            lpst.setString(1, objet.getCp());
            lpst.setString(2, objet.getNomVille());
            lpst.setInt(3, objet.getIdDepartement());
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
    public List<Ville> selectAll() {

        List<Ville> liste = new ArrayList();
        try {
            PreparedStatement lpst = icnx.prepareStatement("SELECT * FROM ville");
            ResultSet lrs = lpst.executeQuery();
            Ville o;
            while (lrs.next()) {
                o = new Ville(lrs.getInt(1), lrs.getString(2), lrs.getString(3), lrs.getInt(4));
                liste.add(o);
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
    public Ville selectOne(int id) {
        Ville o = null;
        try {
            PreparedStatement lpst = icnx.prepareStatement("SELECT * FROM ville WHERE id_ville = ?");
            lpst.setInt(1, id);
            ResultSet lrs = lpst.executeQuery();

            if (lrs.next()) {
                o = new Ville(lrs.getInt(1), lrs.getString(2), lrs.getString(3), lrs.getInt(4));
            } else {
                o = new Ville(0, "Introuvable", "", 0);
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            /// est null
        }
        return o;
    } /// selectOne

    /**
     *
     * @param objet
     * @return
     */
    @Override
    public int delete(Ville objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("DELETE FROM ville WHERE id_ville = ?");
            lpst.setInt(1, objet.getIdVille());
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
    public int update(Ville objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("UPDATE ville SET cp = ?, nom_ville = ?, id_departement = ? WHERE id_ville = ?");
            lpst.setString(1, objet.getCp());
            lpst.setString(2, objet.getNomVille());
            lpst.setInt(3, objet.getIdDepartement());
            lpst.setInt(4, objet.getIdVille());
            liAffecte = lpst.executeUpdate();
            lpst.close();
        } catch (SQLException e) {
            liAffecte = -1;
        }
        return liAffecte;
    } /// update

} /// class

