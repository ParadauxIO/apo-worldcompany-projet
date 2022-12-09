package worldcompany;

public class Representant extends Commercial {

    private static final double POURCENT_REPRESENTANT = 0.4;
    private static final double BONUS_REPRESENTANT = 1000d;
    private static final int PREFIX_REPRESENTANT = 2000;

    private static int nbRepresentant = 0;

    public Representant(String nom, String prenom, int anneeEmbauche, double chiffreAffaire) {
        super(nom, prenom, anneeEmbauche, chiffreAffaire);
        nbRepresentant++;
    }

    @Override
    public String presentation() {
        return super.presentation();
    }

    @Override
    public double getSalaire() {
        return BONUS_REPRESENTANT + (getChiffreAffaire() * POURCENT_REPRESENTANT);
    }

}