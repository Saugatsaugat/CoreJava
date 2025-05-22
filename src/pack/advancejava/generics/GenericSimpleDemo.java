package pack.advancejava.generics;

class Demo<T>{
    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
public class GenericSimpleDemo {
    public static void main(String[] args){
        Demo<String> obj = new Demo<>();
        obj.set("STRING");
        System.out.println(obj.get());

        Demo<Integer> obj1 = new Demo<>();
        obj1.set(100);
        System.out.println(obj1.get());
    }

}
