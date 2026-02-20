package test.java.com.oppgave_1;

import main.java.com.oppgave_1.InnstikkSortering;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class innstikkSorteringToElementTest {

    @Test
    void testerOddetallElementer() {
        Integer[] a = {5, 3, 1, 4, 2};
        InnstikkSortering.innstikkSorteringToElement(a);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void testerPartallElementer() {
        Integer[] a = {8, 4, 6, 2, 7, 1};
        InnstikkSortering.innstikkSorteringToElement(a);
        assertArrayEquals(new Integer[]{1, 2, 4, 6, 7, 8}, a);
    }
    
}



