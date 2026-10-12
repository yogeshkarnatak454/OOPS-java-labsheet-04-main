// Q1. Student Record
class Student {
    String name;
    int rollNumber;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Q01_StudentRecord {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aman";
        s.rollNumber = 101;
        s.display();
    }
}
