/**
 * Created by association on 16/01/17.
 */
public class The extends BoissonCaffeinee {
    @Override
    public void preparer() {
        System.out.println("Infusion du thé");
    }

    @Override
    public void ajouterSupplements() {
        System.out.println("Ajout du citron");
    }
}
