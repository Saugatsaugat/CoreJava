package pack.advancejava.Innnerclass;

abstract class InnerClass{
    public abstract void display();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        InnerClass ic = new InnerClass(){
            @Override
            public void display() {
                System.out.println("I'm an inner class");
            }
        };
        ic.display();
    }
}
