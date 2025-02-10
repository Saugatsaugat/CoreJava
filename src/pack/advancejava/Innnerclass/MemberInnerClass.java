package pack.advancejava.Innnerclass;

public class MemberInnerClass {
    int x = 10;

    class Innner{
        public void display(){
            System.out.println("The value of x is: "+x);
        }
    }
    public static void main(String[] args) {
        MemberInnerClass obj = new MemberInnerClass();
        MemberInnerClass.Innner inner = obj.new Innner();
        inner.display();
    }
}
