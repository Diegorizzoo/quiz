package quiz;

import java.util.*;

public class QuesitoNumerico extends Quesito {
    int rispcorretta;

    public QuesitoNumerico(String domanda, int punteggio, int rispcorretta) {
        super(domanda, punteggio);
        this.rispcorretta = rispcorretta;
    }

    @Override
    int ask() {
        Scanner t = new Scanner(System.in);
        System.out.println("Domanda: " + domanda);
        System.out.println("inserisci risposta: ");
        int risposta = t.nextInt(),punteggiofinale;
        if (risposta == rispcorretta) {
            punteggiofinale=punteggio;
        } else {
            punteggiofinale=0;
        }
        System.out.println("punteggio: " + punteggiofinale);
        return punteggiofinale;
    }
}
