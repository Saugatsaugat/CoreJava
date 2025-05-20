package pack.extra;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 6, 5, 8, 9, 7};

        // using algorithm
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = i; j < (arr.length); j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // output for each j loop
            for (int val : arr) {
                System.out.print(val + "\t");
            }
            System.out.println("\n");
        }

        // Using Arrays
        System.out.println("\nUsing Arrays to sort");
        int[] newArr = {3, 2, 1, 4, 6, 5, 8, 9, 7};
        Arrays.sort(newArr);
        for (int i : newArr) {
            System.out.print(i + "\t");
        }


    }
}
