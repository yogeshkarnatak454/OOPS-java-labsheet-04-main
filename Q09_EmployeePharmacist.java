// Q9. Single inheritance: Employee -> Pharmacist
class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showEmployee() {
        System.out.println("Employee: " + name + " (ID " + id + ")");
    }
}

class Pharmacist extends Employee {
    String licenseNumber;

    Pharmacist(String name, int id, String licenseNumber) {
        super(name, id);
        this.licenseNumber = licenseNumber;
    }

    void showPharmacist() {
        showEmployee();
        System.out.println("License: " + licenseNumber);
    }
}

public class Q09_EmployeePharmacist {
    public static void main(String[] args) {
        Pharmacist p = new Pharmacist("Neha", 201, "PH-4521");
        p.showPharmacist();
    }
}
