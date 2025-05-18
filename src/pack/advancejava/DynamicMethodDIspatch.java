/*
    An example of dynamic method dispatch; also called as run-time polymorphism.
 */

package pack.advancejava;

class Apple{
    public void display(){
        System.out.println("This is parent class: Apple");
    }
}
class Banana extends Apple{
    public void display(){
        System.out.println("This is child class: Banana");
    }
}

class Avocado extends Apple{
    public void display(){
        System.out.println("This is child class: Avacado");
    }
}

public class DynamicMethodDIspatch {
    public static void main(String[] args){
        Apple a = new Apple();
        Banana b = new Banana();
        Avocado av = new Avocado();

        Apple ref; // dynamic dispatch step

        ref = a;
        a.display();

        ref = b;
        ref.display();

        ref = av;
        av.display();
    }
}
