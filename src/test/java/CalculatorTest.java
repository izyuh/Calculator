import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator();

        assertEquals(4,calculator.add(2,2));
        assertEquals(20,calculator.add(5,15));
        assertEquals(2353,calculator.add(8,2345));
        assertEquals(92,calculator.add(35,57));
        assertEquals(166,calculator.add(74,92));
        assertEquals(668,calculator.add(90,578));

    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();

        assertEquals(0,calculator.subtract(2,2));
        assertEquals(-10,calculator.subtract(5,15));
        assertEquals(-2337,calculator.subtract(8,2345));
        assertEquals(-22,calculator.subtract(35,57));
        assertEquals(-18,calculator.subtract(74,92));
        assertEquals(-488,calculator.subtract(90,578));

    }
    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();

        assertEquals(2,calculator.multiply(2,1));
        assertEquals(35,calculator.multiply(5,7));
        assertEquals(486,calculator.multiply(9,54));
        assertEquals(7125,calculator.multiply(75,95));
        assertEquals(30,calculator.multiply(5,6));
        assertEquals(16,calculator.multiply(4,4));
        assertEquals(1534600,calculator.multiply(100,15346));

    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();

        assertEquals(10,calculator.divide(100,10));
        assertEquals(4,calculator.divide(20,5));
        assertEquals(4,calculator.divide(16,4));
        assertEquals(3,calculator.divide(75,25));
        assertEquals(8,calculator.divide(56,7));
        assertEquals(1,calculator.divide(4,4));
        assertEquals(13717421,calculator.divide(123456789,9));

    }
}