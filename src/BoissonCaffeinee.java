/**
 * Created by association on 16/01/17.
 */
public abstract class BoissonCaffeinee {
    final void suivreRecette() {
        faireBouillirEau();
        preparer();
        verserDansTasse();
        ajouterSupplements();
    }

    public abstract void preparer();

    public abstract void ajouterSupplements();

    public void faireBouillirEau() {
        System.out.println("Portage de l'eau à ébulition");
    }

    public void verserDansTasse() {
        System.out.println("Remplissage de la tasse");
    }
}
