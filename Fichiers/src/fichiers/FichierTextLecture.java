/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fichiers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author formation
 */
public class FichierTextLecture {
    public static void main(String[] args) {
        try {
            // --- Ouverture du fichier
            FileReader lfrFichier = new FileReader("villes.txt");
            // --- Bufferisation
            BufferedReader lbrBuffer = new BufferedReader(lfrFichier);

            // --- Lecture des lignes-enregistrements
            StringBuilder lsbContenu = new StringBuilder();
            String lsLigne;

            while ((lsLigne = lbrBuffer.readLine()) != null) {
                
                lsbContenu.append(lsLigne);
                lsbContenu.append("\n");
            }

            lbrBuffer.close();
            lfrFichier.close();

            System.out.println(lsbContenu);
        } catch (FileNotFoundException e) {
            System.err.println("Erreur de fichier : " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erreur de lecture : " + e.getMessage());
        }
    }///main
    
}
