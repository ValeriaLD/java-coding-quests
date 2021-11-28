package Termometer;

public class FahrenheitConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
