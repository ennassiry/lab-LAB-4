
package lab4_4;

public class Voiture {

    // ==================== ATTRIBUTS ====================

    // Attribut privé qui représente la marque de la voiture.
    private String marque;

    // Attribut privé qui représente le modèle de la voiture.
    private String modele;

    // Attribut privé qui représente la vitesse actuelle en km/h.
    private double vitesse;

    // Attribut privé qui représente l'année de fabrication.
    private int annee;


    // ==================== CONSTRUCTEUR PAR DÉFAUT ====================

    // Constructeur sans paramètres.
    // Il initialise la voiture avec des valeurs par défaut.
    public Voiture() {
        this.marque = "Inconnue";
        this.modele = "Standard";
        this.vitesse = 0.0;
        this.annee = 2024;
    }


    // ==================== CONSTRUCTEUR PARAMÉTRÉ ====================

    // Constructeur qui permet de créer une voiture
    // en précisant sa marque, son modèle, sa vitesse et son année.
    public Voiture(String marque, String modele, double vitesse, int annee) {

        // Le mot-clé this désigne l'objet courant.
        // Il permet de distinguer les attributs des paramètres.
        this.marque = marque;
        this.modele = modele;
        this.vitesse = vitesse;
        this.annee = annee;
    }


    // ==================== CONSTRUCTEUR DE COPIE ====================

    // Constructeur qui crée une nouvelle voiture à partir
    // d'un objet Voiture déjà existant.
    public Voiture(Voiture autreVoiture) {

        // Copie de la marque de l'autre voiture.
        this.marque = autreVoiture.marque;

        // Copie du modèle de l'autre voiture.
        this.modele = autreVoiture.modele;

        // Copie de la vitesse de l'autre voiture.
        this.vitesse = autreVoiture.vitesse;

        // Copie de l'année de fabrication.
        this.annee = autreVoiture.annee;

        // Affiche un message pour signaler l'appel du constructeur de copie.
        System.out.println("Constructeur de copie appelé.");
    }


    // ==================== GETTERS ====================

    // Retourne la marque de la voiture.
    public String getMarque() {
        return marque;
    }

    // Retourne le modèle de la voiture.
    public String getModele() {
        return modele;
    }

    // Retourne la vitesse actuelle de la voiture.
    public double getVitesse() {
        return vitesse;
    }

    // Retourne l'année de fabrication de la voiture.
    public int getAnnee() {
        return annee;
    }


    // ==================== SETTERS AVEC VALIDATIONS ====================

    // Modifie la marque uniquement si elle n'est ni null ni vide.
    public void setMarque(String marque) {

        // Vérifie que la marque existe et contient autre chose
        // que des espaces.
        if (marque != null && !marque.trim().isEmpty()) {

            // Affecte la nouvelle marque à l'attribut.
            this.marque = marque;

        } else {

            // Affiche un message si la marque est invalide.
            System.out.println("Erreur : La marque ne peut pas être vide.");
        }
    }

    // Modifie le modèle uniquement si sa valeur est valide.
    public void setModele(String modele) {

        // Vérifie que le modèle n'est ni null ni vide.
        if (modele != null && !modele.trim().isEmpty()) {

            // Affecte le nouveau modèle.
            this.modele = modele;

        } else {

            // Affiche un message en cas d'erreur.
            System.out.println("Erreur : Le modèle ne peut pas être vide.");
        }
    }

    // Modifie la vitesse si elle est positive ou égale à zéro.
    public void setVitesse(double vitesse) {

        // Une vitesse négative n'est pas autorisée.
        if (vitesse >= 0) {

            // Met à jour la vitesse.
            this.vitesse = vitesse;

        } else {

            // Signale que la vitesse fournie est invalide.
            System.out.println("Erreur : La vitesse ne peut pas être négative.");
        }
    }

    // Modifie l'année si elle est comprise entre 1886
    // et l'année courante incluse.
    public void setAnnee(int annee) {

        // Récupère automatiquement l'année actuelle.
        int anneeCourante = java.time.Year.now().getValue();

        // Vérifie que l'année est valide.
        if (annee > 1885 && annee <= anneeCourante) {

            // Met à jour l'année de fabrication.
            this.annee = annee;

        } else {

            // Affiche les limites autorisées.
            System.out.println(
                "Erreur : L'année doit être entre 1886 et "
                + anneeCourante + "."
            );
        }
    }


    // ==================== MÉTHODES MÉTIER ====================

    // Augmente la vitesse actuelle de la voiture.
    // Le paramètre augmentation représente le nombre de km/h ajoutés.
    public void accelerer(double augmentation) {

        // L'augmentation doit être strictement positive.
        if (augmentation > 0) {

            // Ajoute l'augmentation à la vitesse actuelle.
            // Exemple : 50 + 20 = 70 km/h.
            this.vitesse += augmentation;

            // Affiche l'augmentation et la nouvelle vitesse.
            System.out.println(
                marque + " " + modele
                + " accélère de " + augmentation
                + " km/h. Nouvelle vitesse : "
                + vitesse + " km/h."
            );

        } else {

            // Signale une augmentation nulle ou négative.
            System.out.println(
                "Erreur : L'augmentation de vitesse doit être positive."
            );
        }
    }

    // Diminue la vitesse actuelle de la voiture.
    // Le paramètre reduction représente la vitesse à retirer.
    public void freiner(double reduction) {

        // Vérifie que la réduction est strictement positive.
        if (reduction > 0) {

            // Vérifie si le freinage dépasse la vitesse actuelle.
            if (this.vitesse - reduction < 0) {

                // La vitesse ne peut pas devenir négative :
                // on arrête donc complètement la voiture.
                this.vitesse = 0;

                // Affiche le message d'arrêt.
                System.out.println(
                    marque + " " + modele
                    + " s'arrête complètement."
                );

            } else {

                // Diminue la vitesse lorsque la réduction
                // ne fait pas passer la vitesse sous zéro.
                this.vitesse -= reduction;

                // Affiche la réduction et la nouvelle vitesse.
                System.out.println(
                    marque + " " + modele
                    + " freine de " + reduction
                    + " km/h. Nouvelle vitesse : "
                    + vitesse + " km/h."
                );
            }

        } else {

            // Signale une réduction nulle ou négative.
            System.out.println(
                "Erreur : La réduction de vitesse doit être positive."
            );
        }
    }


    // ==================== AFFICHAGE DES INFORMATIONS ====================

    // Affiche toutes les informations de la voiture.
    public void afficherInformations() {

        // Affiche un titre.
        System.out.println("=== Informations de la Voiture ===");

        // Affiche la marque.
        System.out.println("Marque : " + marque);

        // Affiche le modèle.
        System.out.println("Modèle : " + modele);

        // Affiche la vitesse actuelle en km/h.
        System.out.println("Vitesse actuelle : " + vitesse + " km/h");

        // Affiche l'année de fabrication.
        System.out.println("Année : " + annee);

        // Affiche une ligne de séparation.
        System.out.println("=================================");
    }
}
