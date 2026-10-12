// Q5. Patient Eligibility: if-else inside a Patient method
class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void classify() {
        if (age < 18) {
            System.out.println(name + " is a Child patient.");
        } else if (age < 60) {
            System.out.println(name + " is an Adult patient.");
        } else {
            System.out.println(name + " is a Senior patient.");
        }
    }
}

public class Q05_PatientEligibility {
    public static void main(String[] args) {
        new Patient("Riya", 12).classify();
        new Patient("Karan", 35).classify();
        new Patient("Mohan", 68).classify();
    }
}
