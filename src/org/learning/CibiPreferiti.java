package org.learning;

import java.util.Arrays;

public class CibiPreferiti {
    public static void main(String[] args) {
        /*
        *   Esercizio 2: Miei cibi preferiti:
        *   Nel programma inizializzate un array (con i metodi visti a lezione) con la classifica dei vostri cibi preferiti (minimo 5, massimo 10 elementi)
        *   Poi stampate a video:
        *   la lunghezza della classifica
        *   il vostro cibo top (prima posizione della classifica)
        *   il vostro cibo preferito ma non troppo (ultima posizione della classifica)
        *   il cibo di mezza classifica, cioè che si trova nella posizione mediana
        * */
        String[] cibiPreferiti = {"Risotto", "Bignè", "Pizza", "Gelato", "Pasta", "Cioccolato", "Cotoletta"};

        System.out.println("Classifica: "+Arrays.toString(cibiPreferiti));
        System.out.println("Lunghezza della classifica: "+ cibiPreferiti.length);
        System.out.println("Cibo top: "+ cibiPreferiti[0]);
        System.out.println("Cibo non troppo preferito: "+ cibiPreferiti[cibiPreferiti.length - 1]);
        System.out.println("Cibo a mezza classifica: "+ cibiPreferiti[cibiPreferiti.length / 2]);
    }
}
