/*
InputMisMatchException Demonstration
 */
package pack.advancejava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int x = scanner.nextInt();

            // if the input is integer
            System.out.println("The entered integer value is: " + x);
        }catch(InputMismatchException ex){
            System.out.println("!!!Enter integer value only");
        }
    }
}
