package org.learning;

import java.util.Scanner;

public class BigliettoTreno {
    public static void main(String[] args) {
        /*
         *  Esercizio 1: Biglietto del treno :vagone_treno:
         *  Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero.
         *  Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
         *  il prezzo del biglietto è definito in base ai km (0.21 € al km) va applicato uno sconto del 20% per i minorenni
         *  va applicato uno sconto del 40% per gli over 65.
         *  Il programma va implementato nel metodo main della classe CalcolaBiglietto. Per acquisire l’input dell’utente usate
         *  la classe Scanner, come visto stamattina a lezione.
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti anni ha il passeggero?");
        int etaPasseggero = Integer.parseInt(scanner.nextLine());

        System.out.println("Quanti kilometri devi percorrere?");
        double kilometri = Double.parseDouble(scanner.nextLine());

        double prezzoAlKm = 0.21;
        double prezzoBiglietto = prezzoAlKm * kilometri;
        if(0 < etaPasseggero && etaPasseggero < 18 ) prezzoBiglietto = prezzoBiglietto - (prezzoAlKm * kilometri * 0.2);
        if(etaPasseggero > 65 ) prezzoBiglietto = prezzoBiglietto - (prezzoAlKm * kilometri * 0.4);

        System.out.println("Prezzo del biglietto: "+prezzoBiglietto +" €");

        scanner.close();
    }
}