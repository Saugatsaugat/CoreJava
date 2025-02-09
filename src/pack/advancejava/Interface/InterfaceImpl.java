package pack.advancejava.Interface;

public class InterfaceImpl implements InterfaceExample {
    @Override
    public void mileage() {
        System.out.println("Interface Signature Method is implemented.");
    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceImpl();
        obj.mileage();
    }
}
