package pack.advancejava;

class ParentClass {
    int x;
    ParentClass(int x) {
        this.x = x;
    }
    public void print() {
        System.out.println("The value of x is: " + x);
    }
}

class ChildClass extends ParentClass {
    public ChildClass(int x) {
        super(x);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass(00);
        obj.print();
    }
}
