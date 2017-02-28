package cinescopeentities;

import java.io.Serializable;

public class Ville implements Serializable{

    private int idVille;
    private String cp;
    private String nomVille;
    private int idDepartement;

    public Ville() {
    }

    public Ville(int idVille, String cp, String nomVille, int idDepartement) {
        this.idVille = idVille;
        this.cp = cp;
        this.nomVille = nomVille;
        this.idDepartement = idDepartement;
    }

    public Ville(String cp, String nomVille, int idDepartement) {
        this.cp = cp;
        this.nomVille = nomVille;
        this.idDepartement = idDepartement;
    }

    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }

    @Override
    public String toString() {
        return "Ville{" + "idVille=" + idVille + ", cp=" + cp + ", nomVille=" + nomVille + ", idDepartement=" + idDepartement + '}';
    }

} /// class

