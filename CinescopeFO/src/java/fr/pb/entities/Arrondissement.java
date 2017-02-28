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
public class Arrondissement implements Serializable {
    
    private int idArrondissement;
    private String codeArrondissement;
    private String nomArrondissement;
    
    public Arrondissement(){
    
    }
    
    public Arrondissement(Integer idArrondissement, String codeArrondissement, String nomArrondissement){
    
        this.idArrondissement = idArrondissement;
        this.codeArrondissement = codeArrondissement;
        this.nomArrondissement = nomArrondissement;
    }

    public int getIdArrondissement() {
        return idArrondissement;
    }

    public void setIdArrondissement(int idArrondissement) {
        this.idArrondissement = idArrondissement;
    }

    public String getCodeArrondissement() {
        return codeArrondissement;
    }

    public void setCodeArrondissement(String codeArrondissement) {
        this.codeArrondissement = codeArrondissement;
    }

    public String getNomArrondissement() {
        return nomArrondissement;
    }

    public void setNomArrondissement(String nomArrondissement) {
        this.nomArrondissement = nomArrondissement;
    }
    
}
