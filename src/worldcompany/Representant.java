package worldcompany;

public class Representant extends Commercial {

    private static final double POURCENT_REPRESENTANT = 0.2;
    private static final double BONUS_REPRESENTANT = 800d;
    private static final int PREFIX_REPRESENTANT = 1000;

    private static int nbRepresentant;

    public Representant(String nom, String prenom, int anneeEmbauche, double chiffreAffaire) {
        super(nom, prenom, anneeEmbauche, chiffreAffaire);
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