package pack.advancejava.encapsulation;

public class Employee {
    private String firstName;
    private String midName;
    private String lastName;
    private String gender;

    public Employee(){}
    public Employee(String firstName, String midName, String lastName, String gender) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.gender = gender;
    }
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getMidName() {return midName;}
    public void setMidName(String midName) {this.midName = midName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}

    public String toString() {
        return "Full Name: " + firstName+ " " + (midName.isEmpty()? (lastName): (midName + " " +lastName)) + "\nAge: " +gender;
    }
}
