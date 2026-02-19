package com.friviligoppgaver;

public class Sortering{
    public static void innstikkSortering(Integer[] a){
        for(int i = 1; i<a.length; i++){
            Integer key = a[i];
            int j = i -1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=key;
        }
    }

    public static void utvalgSortering(Integer[]a){
        for(int i = 0; i <a.length -1; i++){
            int minIndeks = i;
            for(int j = i + 1; j < a.length; j++){
                if (a[j] < a[minIndeks]){
                    minIndeks = j;
                }
            }
            Integer tmp = a[i];
            a[i] = a[minIndeks];
            a[minIndeks] = tmp;
        }
    }

    public static void raskSortering(Integer[] a){
        raskSortering(a, 0, a.length - 1);
    }
    private static void raskSortering(Integer[] a, int left, int right){
        if (left >= right) return;
        int p = partition(a, left, right);
        raskSortering(a,left,p-1);
        raskSortering(a,p+1, right);
    }
    private static int partition(Integer[] a, int left, int right){
        Integer pivot = a [right];
        int i = left - 1;
        for(int j = left; j < right; j++){
            if(a[j]<=pivot){
                i++;
                Integer tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        Integer tmp = a[i + 1];
        a[i + 1] = a [right];
        a[right] = tmp;
        return i + 1;
    }

    public static void mergeSort(Integer[] a){
        if (a.length <= 1) return;
        Integer[] aux = new Integer[a.length];
        mergeSort(a, aux, 0, a.length -1);

    }
    private static void mergeSort(Integer[] a, Integer[] aux, int left, int right){
        if (left>= right) return;
        int mid = (left + right) / 2;
        mergeSort(a,aux, left, mid);
        mergeSort(a, aux, mid + 1, right);
        merge(a, aux, left, mid, right);
    }
    private static void merge(Integer[] a, Integer[] aux, int left, int mid, int right){
        System.arraycopy(a, left, aux, left, right-left + 1);

        int i = left;
        int j = mid +1;
        int k = left;

        while(i <= mid&& j <= right){
            if (aux[i] <= aux[j]) a[k++] =aux[i++];
            else a[k++] = aux[j++];
        }
        while (i<=mid) a[k++] = aux[i++];

    }
    
    public static boolean erSortert(Integer[] a){
        for (int i = 1;i<a.length; i++){
            if (a[i - 1] > a[i]) return false;
        }
        return true;
    }
}