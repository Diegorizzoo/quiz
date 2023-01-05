package quiz;
import java.util.*;

public class QuesitoSiNo extends Quesito {

    public QuesitoSiNo(String domanda, String rispcorretta, int punteggio) {
        super(domanda, rispcorretta, punteggio);
    }

    @Override
    int ask() {
        Scanner t = new Scanner(System.in);
        System.out.println("Domanda: " + domanda);
        System.out.println("inserisci risposta: ");
        String risposta;
        int punteggiofinale;
        boolean f=true;
        do {
            risposta = t.next();
            if (risposta.compareTo("si") == 0 || risposta.compareTo("no") == 0) {
                f=true;
            }else{
                System.out.println("Digita si o no ");
                f=false;
            }
        } while (f==false);
        if (risposta.compareTo(rispcorretta) == 0) {
            punteggiofinale=punteggio;
        } else {
            punteggiofinale=0;
        }
        System.out.println("punteggio: " + punteggiofinale);
        return punteggiofinale;
    }

}
