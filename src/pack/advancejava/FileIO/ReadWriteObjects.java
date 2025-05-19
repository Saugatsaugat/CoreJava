package pack.advancejava.FileIO;

import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}
public class ReadWriteObjects {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("Saugat Thapa", 24, "Male");
        Student s2 = new Student("Mr. Khakda", 25, "Male");
        Student s3 = new Student("Ms. Acharya", 23, "Female");

        String workingDir = System.getProperty("user.dir");
        File f = new File(workingDir + "/src/staticfiles/students.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);
            System.out.println("File writing complete");
            fos.close();
            oos.close();

            // read file
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student r1 = (Student) ois.readObject();
            Student r2 = (Student) ois.readObject();
            Student r3 = (Student) ois.readObject();

            System.out.println(r1.toString());
            System.out.println(r2.toString());
            System.out.println(r3.toString());

            fis.close();
            ois.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
