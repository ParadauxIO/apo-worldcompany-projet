package worldcompany;

public class Vendeur extends Commercial {

    private static final double POURCENT_VENDEUR = 0.2;
    private static final double BONUS_VENDEUR = 800d;
    private static final int PREFIX_VENDEUR = 1000;

    private static int nbVendeur;

    public Vendeur(String nom, String prenom, int anneeEmbauche, double chiffreAffaire) {
        super(nom, prenom, anneeEmbauche, chiffreAffaire);
        super.setCodeEmploye(PREFIX_VENDEUR + nbVendeur);
        nbVendeur++;
    }

    @Override
    public String presentation() {
        return super.presentation().replace("[rôle]", "vendeur");
    }

    @Override
    public double getSalaire() {
        return BONUS_VENDEUR + (getChiffreAffaire() * POURCENT_VENDEUR);
    }
}

