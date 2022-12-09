package worldcompany;

public class Manutentionnaire extends Employe {

    private static final int PREFIX_MANUTENTIONNAIRE = 4000;
    private static final double SALAIRE_HORAIRE = 34.50d;

    private static int nbManutentionnaires = 0;

    private final double heures;

    public Manutentionnaire(String nom, String prenom, int anneeEmbauche, double heures) {
        super(nom, prenom, anneeEmbauche);
        this.heures = heures;
        nbManutentionnaires++;
    }

    @Override
    public String presentation() {
        return super.presentation();
    }

    @Override
    public double getSalaire() {
        return heures * SALAIRE_HORAIRE;
    }
}
