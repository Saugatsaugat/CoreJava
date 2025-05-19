package pack.corejava;

public class RecursionExample2 {
    static int sum(int a, int b) {
        if (b > a) {
            return b + sum(a,  b-1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(1, 5);
        System.out.println("Sum is : " + result);
    }
}
