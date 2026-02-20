package test.java.com.friviligoppgaver;
import main.java.com.friviligoppgaver.Sortering;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Arrays;

import static main.java.com.friviligoppgaver.Sortering.innstikkSortering;
import static org.junit.jupiter.api.Assertions.*;

class SorteringTest {

    @Test
    void alleMetoderSkalSortereRiktig_litenTabell(){
        Integer[] original = {7,1,5,3,2,6,8,9,0,4};
        testAlle(original);
    }

    @Test
    void skalTakleAlleEqual(){
        Integer[] orginal = {5,5,5,5,5,5,5,5};
        testAlle(orginal);
    }

    @Test
    void skalTakleAlleredeSortert(){
        Integer[] original = {0,1,2,3,4,5,6,7,8,9};
        testAlle(original);
    }

    @Test
    void randomMedSeed(){
        Random r = new Random(123);
        Integer[] original = new Integer[10];
        for (int i = 0; i< original.length; i++) original[i] = r.nextInt(20);
        testAlle(original);
    }
    private void testAlle(Integer[] original){
        Integer[] fasit = original.clone();
        Arrays.sort(fasit);

        Integer[] a1= original.clone();
        innstikkSortering(a1);
        assertArrayEquals(fasit,a1);

        Integer[] a2= original.clone();
        Sortering.utvalgSortering(a2);
        assertArrayEquals(fasit,a2);

        Integer[] a3= original.clone();
        Sortering.raskSortering(a3);
        assertArrayEquals(fasit,a3);

        Integer[] a4= original.clone();
        Sortering.mergeSort(a4);
        assertArrayEquals(fasit,a4);
    }
    
}