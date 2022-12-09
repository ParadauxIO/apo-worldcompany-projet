package worldcompany;

public class Pdg implements Presentation {

    private final String deisgnation;

    public Pdg(String designation) {
        this.deisgnation = designation;
    }

    @Override
    public String presentation() {
        return "Beuhhaa, I am " + deisgnation;
    }
}