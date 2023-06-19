package stackQueue;

import java.util.Arrays;
import java.util.Stack;

public class BtStackQueue {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println("Array before reverse: " + Arrays.toString(arr));
        System.out.println("Array after reverse: " + Arrays.toString(reverseNumber(arr)));

        String str="Trang";
        System.out.println("String before reverse: "+str);
        System.out.println("String after reverse: "+reverseString(str));
    }

    public static int[] reverseNumber(int[] arr) {
        Stack<Integer> integerStack = new Stack<>();
        for (int k : arr) {
            integerStack.push(k);
        }

        int n = integerStack.size();
        for (int i = 0; i < n; i++) {
            arr[i] = integerStack.pop();
        }

        return arr;
    }

    public static String reverseString(String str) {
        Stack<String> stringStack = new Stack<>();
        String[] strings = str.split("");
        for (int i = 0; i < strings.length; i++) {
            stringStack.push(strings[i]);
        }

        int n = stringStack.size();
        for (int i = 0; i < n; i++) {
            strings[i] = stringStack.pop();
        }

        str = "";
        for (String s : strings) {
            str += s;
        }
        return str;
    }
}
