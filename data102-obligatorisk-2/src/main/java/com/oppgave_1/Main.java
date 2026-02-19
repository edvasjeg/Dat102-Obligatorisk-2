package com.oppgave_1;

import com.oppgave_2.Maaletid;

public class Main {
    
    public static void main(String[] args) {

        // oppgave 1 a)
        Integer[] tabell = Maaletid.lagTilfeldig(80000, System.currentTimeMillis());

        long start = System.currentTimeMillis();
        InnstikkSortering.innstikkSortering(tabell);
        long end = System.currentTimeMillis();

        long elapsedTime = end - start;

        System.out.println("Vanlig innstikk sortering tok " + elapsedTime + " millisekunder");

        start = System.currentTimeMillis();
        InnstikkSortering.innstikkSorteringModifisert(tabell);
        end = System.currentTimeMillis();

        elapsedTime = end - start;
        System.out.println("Modifisert innstikk sortering tok " + elapsedTime + " millisekunder");

        // oppgave 1 b og c)
        start = System.currentTimeMillis();
        InnstikkSortering.innstikkSorteringToElement(tabell);
        end = System.currentTimeMillis();

        elapsedTime = end - start;
        System.out.println("Innstikk sortering med to elementer tok " + elapsedTime + " millisekunder");
    }

}
