/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author formation
 */
public class ComparaisonsConcatenations {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();
        
        String s= "";
        
        for (int i = 0; i < 10000; i++) {
            s += "bonjour";
        }
    }
}
