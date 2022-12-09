package worldcompany;

public abstract class Commercial extends Employe {

    private double chiffreAffaire;

    public Commercial(String nom, String prenom, int anneeEmbauche, double chiffreAffaire) {
        super(nom, prenom, anneeEmbauche);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }
}
