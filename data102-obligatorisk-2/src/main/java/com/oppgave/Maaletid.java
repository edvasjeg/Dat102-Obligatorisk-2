package com.oppgave;

import java.util.Random;

public class Maaletid {
    static Integer[] lagTilfeldig(int n, long seed){
        Random r = new Random(seed);
        Integer[]a = new Integer[n];
        for (int i = 0; i<n; i++) a[i] = r.nextInt();
        return a;
    }

    static long maal(Runnable jobb, int antall){
        long start = System.nanoTime();
        for (int i = 0; i<antall; i++) jobb.run();
        long slutt = System.nanoTime();
        return(slutt-start)/antall;
    }

    static double fN2(int n){
        return (double) n* n;
    }
    
    static double fNlogN(int n){
        return n*(Math.log(n) / Math.log(2));
    }

    public static void main(String[] args){
        int[] N = {32000, 64000, 128000};
        int antall = 5;

        int n0 = 32000;

        long t0 = maal(() -> {
            Integer[] a = lagTilfeldig(n0, System.nanoTime()); 
            Sortering.raskSortering(a); }, antall);

        double c = t0 / fNlogN(n0);

        System.out.println("Resultat av RaskSortering");
        System.out.println("N\tmålinger\tmålt(ns)\tteori(ns)" );
        for (int n : N){
            long t = maal(() -> {
                Integer[] a = lagTilfeldig(n0, System.nanoTime());
                Sortering.raskSortering(a); }, antall);
            long teori = Math.round(c*fNlogN(n));
            System.out.println(n + "\t"+antall + "\t" + t + "\t" + teori);
        }
    }
}
