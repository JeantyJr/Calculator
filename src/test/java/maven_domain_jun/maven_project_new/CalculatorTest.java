package maven_domain_jun.maven_project_new;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator micalculatrice = new Calculator();
        assertEquals(10, micalculatrice.add(2, 8));
    }


    @Test
    public void addTestFalse() {
        Calculator micalculatrice = new Calculator();
        assertNotSame(10, micalculatrice.add(2, 6));
    }

    @Test
    public void multiplicateTest() {
        Calculator micalculatrice = new Calculator();
        assertEquals(16, micalculatrice.multiplicate(2, 8));
    }
    
}