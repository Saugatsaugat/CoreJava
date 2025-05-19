package pack.advancejava;

class Vehicle{
    public void wheelCount(){
        System.out.println("Vehicle: Wheel Count is 4");
    }
}

class Motorbike extends Vehicle{
    public void wheelCount(){
        System.out.println("Motorbike: Wheel Count is 2");
    }
}

class Truck extends Vehicle{
    public void wheelCount(){
        System.out.println("Truck: Wheel Count is 18");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Motorbike m = new Motorbike();
        Truck t = new Truck();

        v.wheelCount();
        m.wheelCount();
        t.wheelCount();
    }
}
