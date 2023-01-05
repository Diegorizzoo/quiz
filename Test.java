package quiz;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String domande[] = { "come si chiama il presidente della repubblica?",
                "quanti di questi numeri sono multipli di 7?", "quanto fa 23+7?",
                "è vero che java è il miglior linguaggio di programmazione?" };
        Quesito a = new Quesito("come si chiama il presidente della repubblica?", "Sergio Mattarella", 2);
        QuesitoMultiplo b = new QuesitoMultiplo("quale tra questi numeri è multiplo di 7?", 2, 3, 7, 35, 42, 47);
        QuesitoNumerico c = new QuesitoNumerico("quanto fa 23+7?", 2, 30);
        QuesitoSiNo d = new QuesitoSiNo("è vero che java è il miglior linguaggio di programmazione?", "si", 2);
        Random r = new Random();
        boolean t[] = new boolean[4];
        int punteggio = 0, n;
        for (int i = 0; i < 4; i++) {
            t[i] = false;
        }
        for (int i = 0; i < 4; i++) {
            n = r.nextInt(4);
            for (int j = 0; j < 4; j++) {
                if (n == 0 && t[0] == false) {
                    punteggio += a.ask();
                    t[0] = true;
                }
                if (n == 1 && t[1] == false) {
                    punteggio += b.ask();
                    t[1] = true;
                }
                if (n == 2 && t[2] == false) {
                    punteggio += c.ask();
                    t[2] = true;
                }
                if (n == 3 && t[3] == false) {
                    punteggio += d.ask();
                    t[3] = true;
                }
            }
        }
        System.out.println("Punteggio finale: " + punteggio);
    }
}
