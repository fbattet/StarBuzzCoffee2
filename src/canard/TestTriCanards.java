package canard;

import canard.Canard;

import java.util.Arrays;

/**
 * Created by association on 16/01/17.
 */
public class TestTriCanards {
    public static void main(String[] args) {
        Canard[] canards = {
                new Canard("Donald", 8),
                new Canard("Riri", 2),
                new Canard("Daisy", 7),
                new Canard("Fifi", 2),
                new Canard("Picsou", 10),
                new Canard("Loulou", 2)
        };

        System.out.println("Avant le tri :");
        afficher(canards);

        Arrays.sort(canards);

        System.out.println("\nAprès le tri :");
        afficher(canards);
    }

    public static void afficher(Canard[] canards) {
        for (int i = 0; i < canards.length; i++) {
            System.out.println(canards[i]);
        }
    }


}
