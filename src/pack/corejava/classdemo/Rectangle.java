package pack.corejava.classdemo;

import java.util.Scanner;

public class Rectangle {
    // members
    int length; // instance variable
    int breadth; // instance variable


    // defining parametrized methods
    public void getData(int x, int y) {
        length = x;
        breadth = y;
    }

    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

//        obj1.getData(4, 2);
        obj1.getData(length, breadth);
        int area = obj1.getArea();
        System.out.println("The area of the rectangle is " + area);
    }
}

