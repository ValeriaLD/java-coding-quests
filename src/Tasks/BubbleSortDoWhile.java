package Tasks;

import java.text.DecimalFormat;
import java.util.Arrays;

public class BubbleSortDoWhile {
    public static void main(String[] args) {
        int n = 5;
        double[] array = new double[n];
        boolean sorted = false;
        DecimalFormat df2 = new DecimalFormat("#.##");

        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(df2.format(Math.random()));
        }
        System.out.println(Arrays.toString(array));

        do {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        while (!sorted);
        System.out.println(Arrays.toString(array));
    }
}
