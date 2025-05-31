package pack.corejava;

public class RecursionExample1 {
    private static int result;

    static int sum(int n){
        if( n > 0) {
            return n + sum(n - 1);
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        result = sum(10);
        System.out.println("Sum is: " + result);
    }
}
