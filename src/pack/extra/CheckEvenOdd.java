package pack.extra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        try {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("The entered number is even.");
            } else {
                System.out.println("The entered number is odd.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch error");
            e.printStackTrace();
        }
    }
}
