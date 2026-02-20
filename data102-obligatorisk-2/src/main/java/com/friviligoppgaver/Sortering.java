package main.java.com.friviligoppgaver;

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

    public static void raskSortering(Integer[] a) {
        raskSortering3(a, 0, a.length - 1);
    }
    private static void raskSortering3(Integer[] a,int left,int right) {
        if (left >= right) return;

        Integer pivot = a[left +(right - left) / 2];
        int lt = left;
        int i  = left;
        int gt = right;

        while (i <= gt) {
            int cmp= Integer.compare(a[i], pivot);
            if (cmp < 0) {
                swap(a, lt, i);
                lt++; i++;
            } else if (cmp > 0) {
                swap(a, i, gt);
                gt--;
            } else {
                i++;
            }
        }
        raskSortering3(a,left, lt - 1);
        raskSortering3(a,gt +1, right);
    }

    private static void swap(Integer[] a, int i, int j) {
        Integer tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
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