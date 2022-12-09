package worldcompany;

public abstract class Employe implements Comparable<Employe>, Presentation {

    private int codeEmploye;
    private final String nom;
    private final String prenom;
    private int anneEmbauche;

    public Employe(String nom, String prenom, int anneeEmbauche) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneEmbauche = anneeEmbauche;
    }

    @Override
    public String presentation() {
        return null;
    }

    @Override
    public int compareTo(Employe o) {
        return 0;
    }

    public abstract double getSalaire();

    protected void setCodeEmploye(int codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    protected int getAneeEmbauche() {
        return anneEmbauche;
    }

    private void setAnneeEmbauche(int anneeEmbauche) {
        this.anneEmbauche = anneeEmbauche;
    }
}
