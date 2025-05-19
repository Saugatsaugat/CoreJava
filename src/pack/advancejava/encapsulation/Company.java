package pack.advancejava.encapsulation;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Smith");
        employee.setMidName("");
        employee.setGender("Male");

        System.out.println(employee.toString());
    }
}
