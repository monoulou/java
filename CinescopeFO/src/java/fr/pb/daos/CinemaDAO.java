package fr.pb.daos;


import cinescopeentities.IDAO;
import fr.pb.entities.Cinema;
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
public class CinemaDAO implements IDAO <Cinema> {

    private final Connection icnx;

    public CinemaDAO(Connection acn) {
        icnx = acn;
    }

    /**
     *
     * @param objet
     * @return
     */
    @Override
    public int insert(Cinema objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("INSERT INTO cinema(nom_cinema, adresse_cinema) VALUES(?,?)");
            lpst.setString(1, objet.getNomCinema());
            lpst.setString(2, objet.getAdresseCinema());
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
    public List<Cinema> selectAll() {

        List<Cinema> liste = new ArrayList();
        try {
            PreparedStatement lpst = icnx.prepareStatement("SELECT * FROM cinema");
            ResultSet lrs = lpst.executeQuery();
            Cinema c;
            while (lrs.next()) {
                c = new Cinema(lrs.getInt(1), lrs.getInt(2), lrs.getInt(3), lrs.getString(4), lrs.getString(5), lrs.getString(6), lrs.getString(7), lrs.getString(8), lrs.getString(9), lrs.getString(10), lrs.getInt(11));
                liste.add(c);
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
    public Cinema selectOne(int id) {
        Cinema c = null;
        try {
            PreparedStatement lpst = icnx.prepareStatement("SELECT * FROM cinema WHERE id_cinema = ?");
            lpst.setInt(1, id);
            ResultSet lrs = lpst.executeQuery();

            if (lrs.next()) {
                c = new Cinema(lrs.getInt(1), lrs.getInt(2), lrs.getInt(3),lrs.getString(4), lrs.getString(5), lrs.getString(6), lrs.getString(7), lrs.getString(8), lrs.getString(9), lrs.getString(10), lrs.getInt(11));
            } else {
                c = new Cinema(0, 0, 0, "Introuvable", "Introuvable","","","","","",0);
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            /// est null
        }
        return c;
    } /// selectOne

    /**
     * 
     * @param objet
     * @return 
     */
    @Override
    public int delete(Cinema objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("DELETE FROM cinema WHERE id_cinema = ?");
            lpst.setInt(1, objet.getIdCinema());
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
    public int update(Cinema objet) {
        int liAffecte;
        try {
            PreparedStatement lpst = icnx.prepareStatement("UPDATE cinema SET nom_cinema = ?, adresse_cinema = ? WHERE id_cinema = ?");
            lpst.setString(1, objet.getNomCinema());
            lpst.setString(2, objet.getAdresseCinema());
            lpst.setInt(3, objet.getIdCinema());
            liAffecte = lpst.executeUpdate();
            lpst.close();
        } catch (SQLException e) {
            liAffecte = -1;
        }
        return liAffecte;
     } /// update
    
    /**
     *
     * @param idArrondissement
     * @return
     */
    public Cinema selectOneByArr(int idArrondissement) {
        Cinema c = null;
        try {
            PreparedStatement lpst = icnx.prepareStatement("SELECT * FROM cinema WHERE id_arrondissement = ?");
            lpst.setInt(1, idArrondissement);
            ResultSet lrs = lpst.executeQuery();

            if (lrs.next()) {
                c = new Cinema(lrs.getInt(1), lrs.getInt(2), lrs.getInt(3),lrs.getString(4), lrs.getString(5), lrs.getString(6), lrs.getString(7), lrs.getString(8), lrs.getString(9), lrs.getString(10), lrs.getInt(11));
            } else {
                c = new Cinema(0, 0, 0, "Introuvable", "Introuvable","","","","","",0);
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            /// est null
        }
        return c;
    } /// selectOneByArr

} /// class

