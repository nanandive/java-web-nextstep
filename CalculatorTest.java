import javax.xml.datatype.Duration;

public class CalculatorTest {

    public boolean add;

    public static void main(String[] args) {
            Calculator cal = new Calculator();
            add(cal);
            substact(cal);
            multiply(cal);


}


    private static void substact(Calculator cal) {
        System.out.println(cal.divide(9, 3));
    }

    private static void add(Calculator cal) {
        System.out.println(cal.add(9,3));

    }

    private static void multiply(Calculator cal) {
        System.out.println(cal.multiply(9,3));

    }


}




