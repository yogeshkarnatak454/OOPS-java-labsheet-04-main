// Q10. Hierarchical inheritance: Employee -> Doctor and Employee -> Pharmacist
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

class Doctor extends Employee {
    String specialization;

    Doctor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    void showDoctor() {
        showEmployee();
        System.out.println("Specialization: " + specialization);
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

public class Q10_HierarchicalHospitalStaff {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Sharma", 101, "Cardiology");
        Pharmacist p = new Pharmacist("Neha", 201, "PH-4521");
        d.showDoctor();
        System.out.println();
        p.showPharmacist();
    }
}
