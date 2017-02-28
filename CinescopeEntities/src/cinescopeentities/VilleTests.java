package cinescopeentities;

public class VilleTests {

    public static void main(String[] args) {
        Ville paris = new Ville("75000", "Paris", 1);
        System.out.println(paris);

        Ville lyon = new Ville();
        lyon.setIdVille(2);
        lyon.setCp("69000");
        lyon.setNomVille("Lyon");
        lyon.setIdDepartement(2);
        System.out.println(lyon);

    } /// main

} /// class

