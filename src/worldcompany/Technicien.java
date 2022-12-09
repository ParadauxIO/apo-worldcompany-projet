package worldcompany;

public class Technicien extends Employe {

    private static final int PREFIX_TECHNICIEN = 3000;
    private static double FACTEUR_UNITE = 8.5;

    private static int nbTechniciens;
    private int unites;

    public Technicien(String nom, String prenom, int anneeEmbauche, int unites) {
        super(nom, prenom, anneeEmbauche);
        this.unites = unites;
    }

    @Override
    public String presentation() {
        return super.presentation();
    }

    @Override
    public double getSalaire() {
        return 0;
    }
}
