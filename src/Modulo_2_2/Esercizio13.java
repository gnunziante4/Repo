package Modulo_2_2;

import java.util.Arrays;

public class Esercizio13 {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 7, 6};
        System.out.println(Arrays.toString(moltDisapri(arr)));

    }

    public static int[] moltDisapri(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 2 * array[i];
            }
        }
        return array;
    }
}
