import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        reverseArray();
//        findElement();
//        biggestInArray();
//        convertTemperature();
//        findMinimum();
        deleteElementInArray();
    }

    public static void reverseArray() {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter size array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20 !!");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;

        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Elements is array: ");
        for (int k : array) {
            System.out.print(k + "\t");
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.print("\nArray after reverse: ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
    }

    public static void findElement() {
        String[] student = new String[]{"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name`s student: ");
        String name = scanner.nextLine();

        for (String k : student) {
            if (k.equals(name)) {
                System.out.println("Student in list");
                break;
            } else {
                System.out.println("Student not in list");
                break;
            }
        }
    }

    public static void biggestInArray() {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        for (int k : array) {
            System.out.print(k + "\t");
        }

        int max = array[0];
        for (int k : array) {
            if (k > max) {
                max = k;
            }
        }
        System.out.println("\nThe largest value: " + max);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void convertTemperature() {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    System.out.println("---------------");
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    System.out.println("---------------");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Not choice");
                    System.out.println("---------------");
            }
        } while (choice != 0);
    }

    public static void findMinimum() {
        int[] array = new int[]{4, 12, 7, 8, 1, 6, 9};
        System.out.println("The smallest element in the array is: " + minValue(array));
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int k : arr) {
            if (k < min) {
                min = k;
            }
        }
        return min;
    }

    public static int[] deleteElement(int[] arr, int x) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                arr[i] = arr[i + 1];
                break;
            }
        }
        for (int i = index + 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        return arr;
    }

    public static void deleteElementInArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 0, 0, 0};
        System.out.println("Array before removed element: " + Arrays.toString(array));
        deleteElement(array, 2);
        System.out.println("Array after removed element: " + Arrays.toString(array));
    }
}
