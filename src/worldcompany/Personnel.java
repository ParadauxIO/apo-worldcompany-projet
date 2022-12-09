package worldcompany;

public class Personnel {

    Employe[] rh;

    public Personnel(Employe[] employes) {
        rh = employes;
    }

    public void presentations() {
        // À décommenté lorsque la classe Employe est terminer, pour tester
    /*
		for (Employe e: rh) {
			System.out.println(e.presentation());
		}
		*/
    }

    public double salaireMoyen() {
        return 0;
        // TODO Complétez la méthode salaire moyen.
    }

    public void trierEmployes() {
        // Ne PAS modifier cette méthode
        triSelection(rh.length);
    }

    protected void triSelection(int n) {
    /* TODO Complétez la méthode triSelection.
-- Utiliser le tri par sélection
--- Algorithme du tri par sélection (source: Wikipedia)
 procédure tri_selection(tableau t, entier n)
 		pour i de 0 à n - 2
 			min ← i
 			pour j de i + 1 à n - 1
  				si t[j] < t[min], alors min ← j
			fin pour
 			si min ≠ i, alors échanger t[i] et t[min]
 		fin pour
 fin procédure
*/
    }
}
