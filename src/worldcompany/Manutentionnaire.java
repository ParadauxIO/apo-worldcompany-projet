package worldcompany;

public class Manutentionnaire extends Employe {

    private static final int PREFIX_MANUTENTIONNAIRE = 4000;
    private static final double SALAIRE_HORAIRE = 34.50d;

    private static int nbManutentionnaires = 0;

    private final double heures;

    public Manutentionnaire(String nom, String prenom, int anneeEmbauche, double heures) {
        super(nom, prenom, anneeEmbauche);
        this.heures = heures;
        super.setCodeEmploye(PREFIX_MANUTENTIONNAIRE + nbManutentionnaires);
        nbManutentionnaires++;
    }

    @Override
    public String presentation() {
        return super.presentation().replace("[rôle]", "manutentionnaire");
    }

    @Override
    public double getSalaire() {
        return heures * SALAIRE_HORAIRE;
    }
}
