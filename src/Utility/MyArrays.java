package Utility;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrays {

    /**
     * Shift items to the left starting at location i.
     * The last item in the array zeroed out.
     * @param values
     * @param i  0 <= i < values.length
     */
    public static void shift(int [] values, int i) {

        for (int j = i; j < values.length - 1; j++)
            values[j] = values[j+1];

        values[values.length - 1] = 0;

    }

    public static int indexOf(int [] values,
                              int key) {
        for (int i = 0; i < values.length; i++)
            if (values[i] == key)
                return i;

        return -1;
    }

    public static double median(double [] values) {

        double [] tmp = Arrays.copyOf(values, values.length);
        Arrays.sort(tmp);

        if (tmp.length % 2 == 1)
            return tmp[tmp.length / 2];
        else
            return (tmp[tmp.length/2] +
                   tmp[tmp.length/2 - 1]) / 2;
    }

    public static double min(double [] values) {
        double smallest = values[0];
        smallest = Double.POSITIVE_INFINITY;

        for(double v : values)
            if (v < smallest)
                smallest = v;
        return smallest;
    }
    public static double max(double [] values) {
        double largest = values[0];
        largest = Double.NEGATIVE_INFINITY;

        for(double v : values)
            if (v > largest)
                largest = v;
        return largest;
    }

    public static double mean(double [] values) {
        double total = 0;
        for (double value : values)
            total = total + value;

        return total/values.length;
    }

    public static void printdoubles(double [] values) {
        System.out.print('[');
        for (int i = 0; i < values.length - 1; i++)
            System.out.print(values[i] + ", ");
        System.out.print(values[values.length-1]);
        System.out.println(']');
    }

    // printdoubles is *overloaded* there are multiple
    // version with different parameter types
    public static void printdoubles(ArrayList<Double> values) {
        System.out.print('[');
        for (int i = 0; i < values.size() - 1; i++)
            System.out.print(values.get(i) + ", ");
        System.out.print(values.get(values.size()-1));
        System.out.println(']');
    }

    public static void main(String[] args) {
        // test indexOf
        int [] array = {3, 4, 9, 2, 7};
        System.out.println(indexOf(array, 2) == 3);
        System.out.println(indexOf(array, 77) == -1);
    }

} // class MyArrays
