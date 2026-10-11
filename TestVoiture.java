
package lab4_4;
public class TestVoiture {
    public static void main(String[] args) {
        // Création des objets (déjà fait)
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
        
        
        System.out.println("=== TESTS DES VALIDATIONS ===");

        Voiture voiture = new Voiture("Renault", "Clio", 0.0, 2022);

        // Test 1 : Vitesse négative
        System.out.println("\nTest 1 : Vitesse négative");
        voiture.setVitesse(-10);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        // Test 2 : Vitesse nulle
        System.out.println("\nTest 2 : Vitesse nulle");
        voiture.setVitesse(0);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        // Test 3 : Année invalide (trop ancienne)
        System.out.println("\nTest 3 : Année invalide (trop ancienne)");
        voiture.setAnnee(1800);
        System.out.println("Année actuelle : " + voiture.getAnnee());

        // Test 4 : Année invalide (future)
        System.out.println("\nTest 4 : Année invalide (future)");
        voiture.setAnnee(2050);
        System.out.println("Année actuelle : " + voiture.getAnnee());

        // Test 5 : Marque vide
        System.out.println("\nTest 5 : Marque vide");
        voiture.setMarque("");
        System.out.println("Marque actuelle : " + voiture.getMarque());

        // Test 6 : Marque null
        System.out.println("\nTest 6 : Marque null");
        voiture.setMarque(null);
        System.out.println("Marque actuelle : " + voiture.getMarque());

        // Test 7 : Accélération négative
        System.out.println("\nTest 7 : Accélération négative");
        voiture.accelerer(-50);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        // Test 8 : Freinage excessif
        System.out.println("\nTest 8 : Freinage excessif");
        voiture.setVitesse(20);
        voiture.freiner(50);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        voiture.afficherInformations();
    }
    }
