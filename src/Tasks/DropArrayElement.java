package Tasks;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DropArrayElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        double[] array = new double[n];
        double[] newArray = new double[array.length - 1];
        DecimalFormat df2 = new DecimalFormat("#.##");

        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(df2.format(Math.random()));
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the number to be deleted: ");
        double x = in.nextDouble();

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != x) {
                newArray[j++] = array[i];
            }
        }
        System.out.print(Arrays.toString(newArray));
    }
}
