package pack.extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        System.out.println("Using For loop, Sum: "+ arrSum);

        // using stream
        int sum = Arrays.stream(arr).sum();
        System.out.println("\nUsing Stream API, sum: " + sum);


    }
}
