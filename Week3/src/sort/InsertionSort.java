package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 9, 3, 8, 4, 7, 5, 6};
        System.out.println(Arrays.toString(arr));

        int poss, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            poss = i;
            while (poss > 0 && x < arr[poss - 1]) {
                arr[poss] = arr[poss - 1];
                poss--;
            }
            arr[poss] = x;
        }

        System.out.println(Arrays.toString(arr));
    }
}
