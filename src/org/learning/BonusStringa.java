package org.learning;

import java.util.Scanner;

public class BonusStringa {
    public static void main(String[] args) {
        /*
        * Data una stringa e un carattere scelto dall'utente, calcolare la
        * lunghezza della sequenza più lunga di quel carattere all'interno della
        * stringa. Stampare sia la lunghezza trovata, che la posizione (l'indice
        * del primo carattere della sequenza) all'interno della stringa.
        * ESEMPIO:
        * stringa: aaabaabbbbaaaabab  carattere: 'a'    lunghezza massima: 4  indice: 10
        * Se esistono due sequenze con la stessa lunghezza massima, restituire i dati relativi all'ultima all'interno della stringa (quella con indice di inizio più alto)
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una sequenza di caratteri");
        String sequenza = scanner.nextLine();
        System.out.println("Scrivi il carattere da trovare");
        char carattere = scanner.nextLine().charAt(0);

        //Inizializzo le variabili da stampare
        int lunghezzaMax = 0;
        int indiceMax = 0;
        //Inizializzo le variabili flag
        int lunghezzaFlag = 0;
        int indiceFlag = 0;
        //Ciclo per controllare i caratteri della stringa
        for (int i = 0; i < sequenza.length(); i++) {
            //Se c'è il carattere ricercato entro e aumento il flag della lunghezza
            if(carattere == sequenza.charAt(i)){
                lunghezzaFlag++;
                // Salvo la posizione nell'indiceFlag
                if (indiceFlag == 0) indiceFlag = i;
                // Controllo se la sequenza è più lunga o meno di quella salvata
                if(lunghezzaFlag >= lunghezzaMax) {
                    lunghezzaMax = lunghezzaFlag;
                    indiceMax = indiceFlag;
                }
            }
            // Se non c'è il carattere azzero tutto
            if(carattere != sequenza.charAt(i)){
                indiceFlag = 0;
                lunghezzaFlag = 0;
            }
        }
        System.out.println("Lunghezza: "+lunghezzaMax);
        System.out.println("Indice: "+indiceMax);
        scanner.close();
    }
}