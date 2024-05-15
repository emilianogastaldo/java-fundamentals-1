package org.learning;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        /*
        * Bonus: Met Gala :palla_da_discoteca:
        * State lavorando col servizio di sicurezza del Met Gala 2024 e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post).
        * Nel programma bisogna:
        * creare e inizializzare l’array contenente i nomi degli invitati
        * chiedere all’utente come si chiama
        * verificare che il nome sia presente nella lista
        * lasciarlo entrare o rispedirlo cortesemente da dove è venuto :occhiali_da_sole:
        * Lista invitati: Jennifer Lopez, Zendaya, Chris Hemsworth, Bad Bunny, Cara Delevingne, Kendall Jenner, Uma Thurman, Damiano David, Luca Guadagnino
        * */
        Scanner scanner = new Scanner(System.in);
        String[] listaInvitati = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};
        System.out.println("Buona sera, come si chiama? ");
        String nomeOspite = scanner.nextLine();
        String messaggio = "Mi dispiace non puoi entrare";
        for (int i = 0; i < listaInvitati.length ; i++) {
            if(nomeOspite.equalsIgnoreCase(listaInvitati[i])){
                messaggio ="Buona sera, può entrare";
            }
        }
        System.out.println(messaggio);
        scanner.close();
    }
}
