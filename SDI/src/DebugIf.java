/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author formation
 */
public class DebugIf {
    public static void main(String[] args) {
        
        int age = 18;
        String lsEtat;
        
        if(age >=18) {
            
            lsEtat = "Majeur";
        }
        else {
            lsEtat = "Mineur";
        }
        
        System.out.println(lsEtat);
    }///main
}///class
