package quiz;

import java.util.*;

public class QuesitoMultiplo extends QuesitoNumerico {
    int[] rispcorrette = new int[4];

    public QuesitoMultiplo(String domanda, int punteggio, int rispostacorretta, int n1, int n2, int n3, int n4) {
        super(domanda, punteggio, rispostacorretta);
        rispcorrette[0] = n1;
        rispcorrette[1] = n2;
        rispcorrette[2] = n3;
        rispcorrette[3] = n4;
    }

    @Override
    int ask() {
        Random r = new Random();
        Scanner t = new Scanner(System.in);
        System.out.println("Domanda: " + domanda);
        System.out.println("Quante risposte sono corrette?: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Risposta n" + (i + 1) + ": " + rispcorrette[i]);
        }
        System.out.println("inserisci numero di risposte giuste: ");
        int risposta, punteggiofinale = 0;
        do {
            risposta = t.nextInt();
            if (risposta > 4) {
                System.out.println("Digita un numero minore di 4! ");
            }
        } while (risposta > 4);
        if (risposta == rispcorretta) {
            punteggiofinale = punteggio;
        } else {
            punteggiofinale = 0;
        }
        System.out.println("punteggio: " + punteggiofinale);
        return punteggiofinale;
    }

}