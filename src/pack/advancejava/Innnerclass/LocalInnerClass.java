package pack.advancejava.Innnerclass;

import java.util.Scanner;

public class LocalInnerClass {
    public void display(){
        class InnerClass {
            public void display(){
                System.out.println("How old are you?");
                Scanner sc = new Scanner(System.in);
                int age = sc.nextInt();
                System.out.println("I am "+age+" years old");
                sc.close();
            }
        }
        InnerClass inner = new InnerClass();
        inner.display();
    }

    // Main Method
    public static void main(String[] args) {
        LocalInnerClass local = new LocalInnerClass();
        local.display();
    }
}
