package pack.corejava;

import java.time.LocalTime;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        String greetingText = (hour > 0 && hour < 12) ? "Good Morning" : ((hour >= 12 && hour <= 19) ? "Good Afternoon" : "Good Night" );

        // greet
        System.out.println(greetingText + " " + name);
        scanner.close();
    }
}
