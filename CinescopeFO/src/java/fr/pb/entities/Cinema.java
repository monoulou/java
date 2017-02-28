/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.pb.entities;

import java.io.Serializable;

/**
 *
 * @author Administrateur
 */
public class Cinema implements Serializable {
    
    private int idCinema;
    private int idVille;
    private int idArrondissement;
    private String codeCinema;
    private String nomCinema;
    private String adresseCinema;
    private String telephoneCinema;
    private String tarifCinema;
    private String diversCinema;
    private String reseauCinema;
    private int accesHandicape;
    
    public Cinema() {

    }
    
    public Cinema(int idCinema, int idVille, int idArrondissement, String codeCinema, String nomCinema, String adresseCinema, String telephoneCinema, String tarifCinema, String diversCinema, String reseauCinema, int accesHandicape) {
        
        this.idCinema = idCinema;
        this.idVille = idVille;
        this.idArrondissement = idArrondissement;
        this.codeCinema = codeCinema;
        this.nomCinema = nomCinema;
        this.adresseCinema = adresseCinema;
        this.telephoneCinema = telephoneCinema;
        this.tarifCinema = tarifCinema;
        this.diversCinema = diversCinema;
        this.reseauCinema = reseauCinema;
        this.accesHandicape = accesHandicape;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    public int getIdArrondissement() {
        return idArrondissement;
    }

    public void setIdArrondissement(int idArrondissement) {
        this.idArrondissement = idArrondissement;
    }

    public String getCodeCinema() {
        return codeCinema;
    }

    public void setCodeCinema(String codeCinema) {
        this.codeCinema = codeCinema;
    }

    public String getNomCinema() {
        return nomCinema;
    }

    public void setNomCinema(String nomCinema) {
        this.nomCinema = nomCinema;
    }

    public String getAdresseCinema() {
        return adresseCinema;
    }

    public void setAdresseCinema(String adresseCinema) {
        this.adresseCinema = adresseCinema;
    }

    public String getTelephoneCinema() {
        return telephoneCinema;
    }

    public void setTelephoneCinema(String telephoneCinema) {
        this.telephoneCinema = telephoneCinema;
    }

    public String getTarifCinema() {
        return tarifCinema;
    }

    public void setTarifCinema(String tarifCinema) {
        this.tarifCinema = tarifCinema;
    }

    public String getDiversCinema() {
        return diversCinema;
    }

    public void setDiversCinema(String diversCinema) {
        this.diversCinema = diversCinema;
    }

    public String getReseauCinema() {
        return reseauCinema;
    }

    public void setReseauCinema(String reseauCinema) {
        this.reseauCinema = reseauCinema;
    }

    public int getAccesHandicape() {
        return accesHandicape;
    }

    public void setAccesHandicape(int accesHandicape) {
        this.accesHandicape = accesHandicape;
    }
    
   
   
}
