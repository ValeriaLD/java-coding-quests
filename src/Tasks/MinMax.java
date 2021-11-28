package Tasks;

import java.text.DecimalFormat;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int n = 5;
        double[] array = new double[n];

        DecimalFormat df2 = new DecimalFormat("#.##");

        for(int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(df2.format(Math.random()));
        }

        double min = array[0];
        double max = array[0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            avg += array[i] / array.length;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
    }
}
