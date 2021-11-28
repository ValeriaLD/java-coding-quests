package Tasks;

import java.text.DecimalFormat;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 5;
        double[] array = new double[n];
        DecimalFormat df2 = new DecimalFormat("#.##");

        for (int i = 0; i < array.length; i++){
            array[i] = Double.parseDouble(df2.format(Math.random()));
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
