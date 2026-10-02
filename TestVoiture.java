package com.lab4.tp;

public class TestVoiture {

	
	public static void main(String[] args) {
        Voiture voiture1 = new Voiture();
        Voiture voiture2 = new Voiture("Toyota", "Corolla", 0.0, 2023);
        Voiture voiture3 = new Voiture(voiture2);

        System.out.println("=== Modification de voiture2 ===");
        voiture2.accelerer(120);
        voiture2.freiner(30);
        voiture2.afficherInformations();

        System.out.println("\n=== Modification de voiture3 ===");
        voiture3.accelerer(80);
        voiture3.afficherInformations();

        System.out.println("\n=== Test des setters avec validation ===");
        voiture2.setVitesse(-50); // Doit échouer
        voiture2.setAnnee(1800); // Doit échouer
        voiture2.setMarque(""); // Doit échouer
        voiture2.afficherInformations();

        System.out.println("\n=== Comparaison finale ===");
        voiture2.afficherInformations();
        voiture3.afficherInformations();
    }
}
