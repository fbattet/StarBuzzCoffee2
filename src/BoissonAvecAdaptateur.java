/**
 * Created by association on 16/01/17.
 */
public abstract class BoissonAvecAdaptateur {
    public final void suivreRecette() {
        faireBouillirEau();
        preparer();
        verserDansTasse();
        if (clienVeutSupplements()) {
            ajouterSupplements();
        }
    }

    abstract void preparer();

    abstract void ajouterSupplements();

    void faireBouillirEau() {
        System.out.println("Portage de l'eau à ébullition");
    }

    void verserDansTasse() {
        System.out.println("Remplissage de la tasse");
    }

    boolean clienVeutSupplements() {
        return true;
    }
}
