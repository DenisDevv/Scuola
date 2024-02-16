import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Esercizio100 {
		public static void main(String[]args) {
				Boolean scelta = true;
				Scanner in = new Scanner(System.in);
				Random rand = new Random();
				int input;
				System.out.println("Inserisci la dimensione array: ");
				input = in.nextInt();
				int numero;
				int[] arrayUtente = new int[100];
                int indiceArr = input;
		do {
                System.out.println("");
                System.out.println("");
				System.out.println("Seleziona un opzione dell'array: ");
				System.out.println("1 - Carica l'array manualmente");
				System.out.println("2 - Carica l'array in maniera casuale");
				System.out.println("3 - Visualizza l'array");
                System.out.println("4 - Inserisci un elemento");
				System.out.println("5 - Cancella un elemento");
				System.out.println("6 - Cancella tutte le occorrenze di un elemento");
				System.out.println("7 - Esci");
				input = in.nextInt();
				switch (input){
						case 1: {
								for (int i = 0; i < indiceArr; i++) {
										System.out.println("Inserisci il valore #" + (i+1));
										input = in.nextInt();
										arrayUtente[i] = input;
								}
								break;
						}
						case 2: {

								for (int i = 0; i < indiceArr; i++) {
										numero = rand.nextInt();
										arrayUtente[i] = numero;
								}
								break;
						}
						case 3: {
								System.out.println("");
								System.out.print("Ecco gli elementi dell'array: ");
								for (int i = 0; i < indiceArr; i++) {
										System.out.print(arrayUtente[i] + "; ");
								}
								break;
						}
                        case 4: {
                                System.out.println("Inserisci la posizione in cui vuoi inserire l'elemento (" + 1 + " - " + (indiceArr + 1) + ")");
                                input = in.nextInt();
                                input--;
                                System.out.println("Inserisci l'elemento che vuoi inserire: ");
                                int elemento = in.nextInt();
                                for (int i = indiceArr; i > input; i--) {
                                    arrayUtente[i] = arrayUtente[i-1];
                                }
                                arrayUtente[input] = elemento;
                                indiceArr++;
                                break;
                            }
                            case 5: {
                                System.out.println("Inserisci l'elemento da rimuovere (" + 1 + " - " + indiceArr + ")");
                                input = in.nextInt();
                                input--;
                                if (input >= 0 && input < indiceArr) {
                                    for (int i = input; i < indiceArr - 1; i++) {
                                        arrayUtente[i] = arrayUtente[i + 1];
                                    }
                                    indiceArr--;
                                } else {
                                    System.out.println("Numero non valido.");
                                }
                                break;
                            }
						case 6: {
								System.out.println("Inserisci il numero da rimuovere in tutte le occorrenze");
								input = in.nextInt();
                                for (int i = 0, j = 0; i < indiceArr; i++) {
                                    if (arrayUtente[i] != input) {
                                        arrayUtente[i++] = arrayUtente[j];
                                    }
                                    indiceArr--;
                                }
								break;
						}
						case 7: {
								scelta = false;
						}
						default: {
								break;
						}
				}
		} while(scelta);
        in.close();
		}
}
