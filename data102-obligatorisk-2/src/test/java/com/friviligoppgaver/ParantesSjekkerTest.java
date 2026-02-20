package test.java.com.friviligoppgaver;

import main.java.com.friviligoppgaver.ParantesSjekker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParantesSjekkerTest {
    private final ParantesSjekker<?> sjekker = new ParantesSjekker<>();

    @Test
    void gyldigParantes1(){
        assertTrue(sjekker.sjekkParantes("{[()]}"));
    }
    @Test
    void gyldigParantes2(){
        assertFalse(sjekker.sjekkParantes("{[()}"));
    }
    @Test
    void gyldigParantes3(){
        assertFalse(sjekker.sjekkParantes("[()]}"));
    }
    @Test
    void gyldigParantes4(){
        assertFalse(sjekker.sjekkParantes("{[(])}"));
    }
    @Test
    void gyldigParantes5(){
        String program = """
        class HelloWorld{
        public static void main(String []args) {
        System.out.println("Hello World!");
        assertTrue(sjekker.sjekkParantes(program));
        """;
        assertFalse(sjekker.sjekkParantes(program));
    }

}