import java.util.Scanner;

public class ClassObject {
    static class Rectangle {
        int length, breadth;
        public void setData(int len, int br) {
            length= len;
            breadth = br;
        }

        public int getArea(){
            return length*breadth;
        }

    }
    public static void main(String[] args) {
        int len, br;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        len = sc.nextInt();

        System.out.println("Enter the breadth of the rectangle: ");
        br = sc.nextInt();

        sc.close();

        ClassObject.Rectangle obj1 = new Rectangle();
        obj1.setData(len, br);
        System.out.println("Area of the rectangle is: "+obj1.getArea());


    }
}
