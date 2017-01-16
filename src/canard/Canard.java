package canard;

/**
 * Created by association on 16/01/17.
 */
public class Canard implements Comparable {
    String nom;
    int poids;

    public Canard(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    @Override
    public String toString() {
        return nom + " pèse " + poids;
    }

    @Override
    public int compareTo(Object o) {
        Canard autreCanard = (Canard) o;
        if (this.poids < autreCanard.poids) {
            return -1;
        } else if (this.poids == autreCanard.poids) {
            return 0;
        } else {
            return 1;
        }
    }
}
