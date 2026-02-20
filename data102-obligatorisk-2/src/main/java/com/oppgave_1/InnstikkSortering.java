package com.oppgave_1;

public class InnstikkSortering {
    public static void innstikkSortering(Integer[] a){
        for(int i = 1; i < a.length; i++){
            Integer temp = a[i];
            int j = i - 1;
            while(j >= 0 && temp.compareTo(a[j]) < 0){
                a[j+1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    public static void innstikkSorteringModifisert(Integer[] a){
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i].compareTo(a[i - 1]) < 0) {
                Integer tmp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = tmp;
            }
        }

        for (int i = 1; i < a.length; i++) {
            Integer temp = a[i];
            int j = i - 1;

            while (temp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    public static void innstikkSorteringToElement(Integer[] a) {
        for(int i = 1; i < a.length - 1; i += 2){

            Integer first = a[i];
            Integer second = a[i + 1];

            Integer minste, største;

            if (first.compareTo(second) <= 0) {
                minste = first;
                største = second;
            } else {
                minste = second;
                største = first;
            }
            int j = i - 1;

            while (j >= 0 && største.compareTo(a[j]) < 0) {
                a[j + 2] = a[j];
                j--;
            }
            a[j + 2] = største;

            while (j >= 0 && minste.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = minste;
        }
        
        int i = a.length - 1;
        Integer temp = a[i];
        int j = i - 1;

        while (j >= 0 && temp.compareTo(a[j]) < 0) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = temp;
        
    }

    public static void innstikkSorteringToElementModifisert(Integer[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i].compareTo(a[i - 1]) < 0) {
                Integer tmp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = tmp;
            }
        }

        for(int i = 1; i < a.length - 1; i += 2){

            Integer first = a[i];
            Integer second = a[i + 1];

            Integer minste, største;

            if (first.compareTo(second) <= 0) {
                minste = first;
                største = second;
            } else {
                minste = second;
                største = first;
            }
            int j = i - 1;

            while (største.compareTo(a[j]) < 0) {
                a[j + 2] = a[j];
                j--;
            }
            a[j + 2] = største;

            while (minste.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = minste;
        }
        
        int i = a.length - 1;
        Integer temp = a[i];
        int j = i - 1;

        while (temp.compareTo(a[j]) < 0) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = temp;
        
    }
}
