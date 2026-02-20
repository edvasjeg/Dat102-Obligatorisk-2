package main.java.com.oppgave_2;

import main.java.com.friviligoppgaver.Sortering;

public class MaaletidLike {
    public static Integer[] lagLike(int n, int verdi){
        Integer[] a = new Integer[n];
        for (int i = 0; i<n; i++) a[i] = verdi;
        return a;
    }

    public static long maal(Runnable jobb, int antall){
        long start = System.nanoTime();
        for (int i = 0; i<antall; i++) jobb.run();
        long slutt = System.nanoTime();
        return(slutt-start)/ antall;

    }

}
