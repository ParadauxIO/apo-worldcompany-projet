package worldcompany;

public class Personnel {

    Employe[] rh;

    public Personnel(Employe[] employes) {
        rh = employes;
    }

    public void presentations() {
        // À décommenté lorsque la classe Employe est terminer, pour tester
		for (Employe e: rh) {
			System.out.println(e.presentation());
		}
    }

    public double salaireMoyen() {
        double salaireTotal = 0;

        for (Employe e : rh) {
            salaireTotal += e.getSalaire();
        }

        return salaireTotal / rh.length;
    }

    public void trierEmployes() {
        // Ne PAS modifier cette méthode
        triSelection(rh.length);
    }

    protected void triSelection(int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (rh[j].compareTo(rh[min]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                Employe temp = rh[i];
                rh[i] = rh[min];
                rh[min] = temp;
            }
        }
    }
}
