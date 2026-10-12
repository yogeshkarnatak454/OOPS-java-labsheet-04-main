// Q15. Final Hospital Staff System
// Concepts used: class/object, constructor, static, array + loop,
// encapsulation, if-else, inheritance (single, hierarchical, multilevel).
// main() only creates the system object and calls its method.

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() { return name; }
    int getAge()     { return age; }

    void showPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    private int id;
    private double salary;

    Employee(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    double getSalary() { return salary; }

    void showEmployee() {
        showPerson();
        System.out.println("ID: " + id + ", Salary: " + salary);
    }

    void work() {
        System.out.println(getName() + " is working.");
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int id, double salary, String specialization) {
        super(name, age, id, salary);
        this.specialization = specialization;
    }

    @Override
    void work() {
        System.out.println("Dr. " + getName() + " (" + specialization + ") is treating patients.");
    }
}

class Pharmacist extends Employee {
    Pharmacist(String name, int age, int id, double salary) {
        super(name, age, id, salary);
    }

    @Override
    void work() {
        System.out.println(getName() + " is dispensing medicines.");
    }
}

class Manager extends Employee {
    private String department;

    Manager(String name, int age, int id, double salary, String department) {
        super(name, age, id, salary);
        this.department = department;
    }

    @Override
    void work() {
        System.out.println(getName() + " is managing the " + department + " department.");
    }
}

class HospitalSystem {
    static String hospitalName = "City Hospital";
    private Employee[] staff = new Employee[3];

    HospitalSystem() {
        staff[0] = new Doctor("Sharma", 42, 101, 90000, "Cardiology");
        staff[1] = new Pharmacist("Neha", 30, 201, 40000);
        staff[2] = new Manager("Anita", 45, 301, 70000, "Administration");
    }

    void run() {
        System.out.println("=== " + hospitalName + " Staff ===");
        double total = 0;
        for (int i = 0; i < staff.length; i++) {
            staff[i].showEmployee();
            staff[i].work();
            if (staff[i].getSalary() >= 70000) {
                System.out.println("Salary grade: High");
            } else {
                System.out.println("Salary grade: Standard");
            }
            total += staff[i].getSalary();
            System.out.println();
        }
        System.out.println("Total monthly salary: " + total);
    }
}

public class Q15_FinalHospitalStaffSystem {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.run();
    }
}
