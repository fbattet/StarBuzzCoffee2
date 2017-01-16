/**
 * Created by association on 16/01/17.
 */
public class Cafe extends BoissonCaffeinee {
    @Override
    public void preparer() {
        System.out.println("Remplissage de la tasse");
    }

    @Override
    public void ajouterSupplements() {
        System.out.println("Ajout du lait et du sucre");
    }
}
