// Q11. Multilevel inheritance: Person -> Employee -> Manager
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;

    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    void showEmployee() {
        showPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, int employeeId, String department) {
        super(name, age, employeeId);
        this.department = department;
    }

    void showManager() {
        showEmployee(); // behavior received through the chain
        System.out.println("Department: " + department);
    }
}

public class Q11_MultilevelHospitalStaff {
    public static void main(String[] args) {
        Manager m = new Manager("Anita", 45, 301, "Administration");
        m.showManager();
    }
}
