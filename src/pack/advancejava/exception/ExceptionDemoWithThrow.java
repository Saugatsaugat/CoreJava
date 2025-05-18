package pack.advancejava.exception;

public class ExceptionDemoWithThrow {
    public static void checkAge(int age) {
        if(age < 21) {
            throw new IllegalArgumentException("Age must be at least 21 to buy cigarettes and beers");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(20);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program flow is maintained");
    }
}
