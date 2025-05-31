/*
Aggregation -> "HAS - A" relationship
Inheritance -> "IS - A" relationship
 */

package pack.advancejava;

class Address{
    String street, city, state, zip;
    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;

        display();
    }

    // display the full address
    public void display(){
        System.out.println("Full address: " + street + ", " + city + ", " + state + ", " + zip);
    }
}

class Employee{
    String fullname;
    Address address;

    public Employee(String fullname, Address address){
        this.fullname = fullname;
        this.address = address;

        display();
    }

    public void display(){
        System.out.println("Full Name: " + fullname + "\nAddress: " + address.street + ", " + address.city +", " + address.state + ", " + address.zip);
    }
}

public class Aggregation {
    public static void main(String[] args){
        Address add = new Address("123 Abc Avenue", "New York", "NY", "10003");
        new Employee("Mr. Thapa", add);
    }
}
