package pack.corejava;

public class MethodOverloading {
    public void display(String firstname){
        System.out.println("Firstname: " + firstname);
    }

    public void display(String firstname, String middlename){
        System.out.println("Firstname: " + firstname + " Middlename: " + middlename);
    }

    public void display(String firstname, String middlename, String lastname){
        System.out.println("Firstname: " + firstname + " Middlename: " + middlename + " Lastname: " + lastname);
    }
    public static void main(String[] a){
        MethodOverloading m = new MethodOverloading();
        m.display("Mr. ABC");
        m.display("Mr. ABC", "XYZ");
        m.display("Mr. ABC", "XYZ", "PQR");
    }
}
