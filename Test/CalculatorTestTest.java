import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTestTest {

    @Test
    public void add() {
        CalculatorTest cal = new CalculatorTest();
        System.out.println(cal.add(6, 3));
    }

    @Test
    public void substract() {
        Calculator cal = new Calculator();
        System.out.println(cal.substract(6, 3));
    }
}