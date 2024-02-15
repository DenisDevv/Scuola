import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Esercizio100 {
    public static void main(String[]args) {
        Boolean scelta = false;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int input;
        System.out.println("Inserisci la dimensione array: ");
        input = in.nextInt();
        int numero;
        int[] arrayUtente = new int[input];
    do {
        System.out.println("Seleziona un opzione dell'array: ");
        System.out.println("1 - Carica l'array manualmente");
        System.out.println("2 - Carica l'array in maniera casuale");
        System.out.println("3 - Visualizza l'array");
        System.out.println("4 - Cancella un elemento");
        System.out.println("5 - Cancella tutte le occorrenze di un elemento");
        System.out.println("6 - Esci");
        input = in.nextInt();
        switch (input){
            case 1: {
                for (int i = 0; i < arrayUtente.length; i++) {
                    System.out.println("Inserisci il valore #" + (i+1));
                    input = in.nextInt();
                    arrayUtente[i] = input;
                }
                break;
            }
            case 2: {
                for (int i = 0; i < arrayUtente.length; i++) {
                    numero = rand.nextInt();
                    arrayUtente[i] = input;
                }
                break;
            }
        }
    } while(scelta);
    }
}
