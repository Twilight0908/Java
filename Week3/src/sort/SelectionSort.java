package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 9, 3, 8, 4, 7, 5, 6};
        System.out.println(Arrays.toString(arr));

        int minPoss;
        for (int i = 0; i < arr.length - 1; i++) {
            minPoss = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPoss]) {
                    minPoss = j;
                }
            }
            if (minPoss != i) {
                int temp = arr[minPoss];
                arr[minPoss] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
