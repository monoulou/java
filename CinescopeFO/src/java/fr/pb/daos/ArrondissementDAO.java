package fr.pb.daos;


import cinescopeentities.IDAO;
import fr.pb.entities.Arrondissement;
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
public class ArrondissementDAO implements IDAO <Arrondissement> {

    private final Connection icnx;

    public ArrondissementDAO(Connection acn) {
        icnx = acn;
    }

    /**
     *
     * @param objet
     * @return
     */
    @Override
    public int insert(Arrondissement objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("INSERT INTO arrondissement(code_arrondissement, nom_arrondissement) VALUES(?,?)");
            lpst.setString(1, objet.getCodeArrondissement());
            lpst.setString(2, objet.getNomArrondissement());
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
    public List<Arrondissement> selectAll() {

        List<Arrondissement> liste = new ArrayList();
        try {
            PreparedStatement lpst = icnx.prepareStatement("SELECT * FROM arrondissement");
            ResultSet lrs = lpst.executeQuery();
            Arrondissement a;
            while (lrs.next()) {
                a = new Arrondissement(lrs.getInt(1), lrs.getString(2), lrs.getString(3));
                liste.add(a);
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
    public Arrondissement selectOne(int id) {
        Arrondissement a = null;
        try {
            PreparedStatement lpst = icnx.prepareStatement("SELECT * FROM arrondissement WHERE id_arrondissement = ?");
            lpst.setInt(1, id);
            ResultSet lrs = lpst.executeQuery();

            if (lrs.next()) {
                a = new Arrondissement(lrs.getInt(1), lrs.getString(2), lrs.getString(3));
            } else {
                a = new Arrondissement(0,"Introuvable", "");
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            /// est null
        }
        return a;
    } /// selectOne

    /**
     * 
     * @param objet
     * @return 
     */
    @Override
    public int delete(Arrondissement objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("DELETE FROM arrondissement WHERE id_arrondissement = ?");
            lpst.setInt(1, objet.getIdArrondissement());
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
    public int update(Arrondissement objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("UPDATE arrondissement SET code_arrondissement = ?, nom_arrondissement = ? WHERE id_arrondissement = ?");
            lpst.setString(1, objet.getCodeArrondissement());
            lpst.setString(2, objet.getNomArrondissement());
            lpst.setInt(3, objet.getIdArrondissement());
            liAffecte = lpst.executeUpdate();
            lpst.close();
        } catch (SQLException e) {
            liAffecte = -1;
        }
        return liAffecte;
     } /// update
    
 
} /// class