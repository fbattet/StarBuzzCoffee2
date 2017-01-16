import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by association on 16/01/17.
 */
public class TheAvecAdaptateur extends BoissonAvecAdaptateur {
    @Override
    void preparer() {
        System.out.println("Infusion du thé");
    }

    @Override
    void ajouterSupplements() {
        System.out.println("Ajout du Citron");
    }

    @Override
    boolean clienVeutSupplements() {
        String reponse = getReponseUtilisateur();
        if (reponse.toLowerCase().startsWith("o")) {
            return true;
        } else {
            return false;
        }
    }

    private String getReponseUtilisateur() {
        String reponse = null;
        System.out.println("Voulez-vous du citron ?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            reponse = in.readLine();
        } catch (IOException ioe) {
            System.err.println("Erreur d'ES. Choix non proposé");
        }
        if (reponse == null) {
            return "non";
        }
        return reponse;

    }
}
