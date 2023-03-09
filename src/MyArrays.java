import java.util.Arrays;

public class MyArrays {

    public static void mystery(int [] list) {
        for (int i = 1; i < list.length; i++)
            list[i] = list[i] + list[i-1];
    }

    public static void main(String[] args) {
        int [] nums = {7, 3, 2, 0, 5};
        mystery(nums);
        System.out.println(Arrays.toString(nums));
    }
}
