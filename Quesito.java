package quiz;
import java.util.*;
public class Quesito{
    String domanda;
    String rispcorretta;
    int punteggio;

    public Quesito(String domanda,String rispcorretta,int punteggio){
        this.domanda=domanda;
        this.rispcorretta=rispcorretta;
        this.punteggio=punteggio;
    }
    public Quesito(String domanda,int punteggio){
        this.domanda=domanda;
        this.punteggio=punteggio;
    }


    int ask(){
        Scanner t =new Scanner(System.in);
        System.out.println("Domanda: "+domanda);
        System.out.println("inserisci risposta: ");
        String risposta=t.nextLine();
        int punteggiofinale;
        if(risposta.compareTo(rispcorretta)==0){
            punteggiofinale=punteggio;
        }else{
            punteggiofinale=0;
        }
        System.out.println("punteggio: "+punteggiofinale);
        return punteggiofinale;
    }
}