package worldcompany;

import java.util.Comparator;

public abstract class Employe implements Comparable<Employe>, Presentation {

    private int codeEmploye;
    private final String nom;
    private final String prenom;
    private int anneeEmbauche;

    public Employe(String nom, String prenom, int anneeEmbauche) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeEmbauche = anneeEmbauche;
    }

    @Override
    public String presentation() {
        return String.format("[%d] Bonjour, je m'appelle %s %s et je gagne %.2f euros. Je suis rôle depuis %d.", codeEmploye, prenom, nom, getSalaire() , anneeEmbauche);
    }

    @Override
    public int compareTo(Employe o) {
        // Renvoie 1 si embauché avant, -1 si embauché après, 0 si égal
        return Comparator.comparingInt(Employe::getAnneeEmbauche).compare(this, o);
    }

    public abstract double getSalaire();

    protected void setCodeEmploye(int codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    protected int getAnneeEmbauche() {
        return anneeEmbauche;
    }

    private void setAnneeEmbauche(int anneeEmbauche) {
        this.anneeEmbauche = anneeEmbauche;
    }
}
