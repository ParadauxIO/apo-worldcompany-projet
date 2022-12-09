package worldcompany;

public class Technicien extends Employe {

    private static final int PREFIX_TECHNICIEN = 3000;
    private static final double FACTEUR_UNITE = 8.5;

    private static int nbTechniciens = 0;
    private final int unites;

    public Technicien(String nom, String prenom, int anneeEmbauche, int unites) {
        super(nom, prenom, anneeEmbauche);
        this.unites = unites;
        nbTechniciens++;
    }

    @Override
    public String presentation() {
        return super.presentation();
    }

    @Override
    public double getSalaire() {
        return unites * FACTEUR_UNITE;
    }
}
