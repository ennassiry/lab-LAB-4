
package lab4_4;

public class TestVoiture {

    public static void main(String[] args) {

        // 1. Création d'une voiture avec le constructeur par défaut
        Voiture voiture1 = new Voiture();
        voiture1.afficherInformations();

        // 2. Création d'une voiture avec le constructeur paramétré
        Voiture voiture2 = new Voiture("BMW", "Serie 3", 90.0, 2022);
        voiture2.afficherInformations();

        // 3. Création d'une copie de voiture2
        Voiture voiture3 = new Voiture(voiture2);
        voiture3.afficherInformations();

        // 4. Modification de la vitesse de voiture3
        voiture3.accelerer(30.0);

        // 5. Freinage de voiture2
        voiture2.freiner(20.0);

        // 6. Affichage des informations après les modifications
        System.out.println("\n--- Après les modifications ---");

        System.out.println("Voiture 2 :");
        voiture2.afficherInformations();

        System.out.println("Voiture 3 :");
        voiture3.afficherInformations();

        // 7. Comparaison des références des objets
        System.out.println("\n--- Comparaison des objets ---");

        System.out.println(
            "voiture1 == voiture2 ? " + (voiture1 == voiture2)
        );

        System.out.println(
            "voiture2 == voiture3 ? " + (voiture2 == voiture3)
        );
    }
}
