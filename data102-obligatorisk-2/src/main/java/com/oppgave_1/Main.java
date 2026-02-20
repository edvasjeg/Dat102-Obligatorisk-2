package main.java.com.oppgave_1;
import main.java.com.oppgave_1.InnstikkSortering;


import main.java.com.oppgave_2.Maaletid;

public class Main {
    
    public static void main(String[] args) {

        
        Integer[] tabell1 = Maaletid.lagTilfeldig(80000, System.currentTimeMillis());
        Integer[] tabell2 = tabell1.clone();
        Integer[] tabell3 = tabell1.clone();
        Integer[] tabell4 = tabell1.clone();

        // oppgave 1 a)
        long start = System.currentTimeMillis();
        InnstikkSortering.innstikkSortering(tabell1);
        long end = System.currentTimeMillis();

        long elapsedTime = end - start;

        System.out.println();
        System.out.println("Vanlig innstikk sortering tok " + elapsedTime + " millisekunder");

        start = System.currentTimeMillis();
        InnstikkSortering.innstikkSorteringModifisert(tabell2);
        end = System.currentTimeMillis();

        elapsedTime = end - start;
        System.out.println();
        System.out.println("Modifisert innstikk sortering tok " + elapsedTime + " millisekunder");

        // oppgave 1 b)
        start = System.currentTimeMillis();
        InnstikkSortering.innstikkSorteringToElement(tabell3);
        end = System.currentTimeMillis();

        elapsedTime = end - start;
        System.out.println();
        System.out.println("Innstikk sortering med to elementer tok " + elapsedTime + " millisekunder");
        
        // oppgave 1 c)
        start = System.currentTimeMillis();
        InnstikkSortering.innstikkSorteringToElementModifisert(tabell4);
        end = System.currentTimeMillis();

        elapsedTime = end - start;
        System.out.println();
        System.out.println("Modifisert innstikk sortering med to elementer tok " + elapsedTime + " millisekunder");
        System.out.println();
    }

}
