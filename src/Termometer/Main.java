package Termometer;

public class Main {
    public static void main(String[] args) {
        double temperature = 23.5;
        CelsiusConverter cs = new CelsiusConverter();
        System.out.println("t = " + cs.getConvertedValue(temperature));
        System.out.println("t = " +
                new KelvinConverter().getConvertedValue(temperature));
        System.out.println("t = " +
                new FahrenheitConverter().getConvertedValue(temperature));
    }
}
