/*
 * Q13. Hybrid Inheritance: Concept Only
 *
 * Hybrid inheritance = a combination of two or more inheritance types
 * (e.g. hierarchical + multilevel). A full hybrid design often needs
 * multiple inheritance (a "diamond"), which Java does NOT allow with classes.
 *
 * Diamond (not possible with classes):
 *            Person
 *            /    \
 *       Doctor   Pharmacist
 *            \    /
 *         DoctorPharmacist   <-- would extend two classes (illegal)
 *
 * What we CAN build is a hybrid-looking structure using only single
 * inheritance per class: hierarchical + multilevel combined.
 *
 *            Person
 *            /    \
 *       Doctor   Pharmacist      (hierarchical)
 *          |
 *     Surgeon                    (multilevel: Person -> Doctor -> Surgeon)
 */
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void showPerson() {
        System.out.println("Person: " + name);
    }
}

class Doctor extends Person {
    Doctor(String name) {
        super(name);
    }

    void treat() {
        System.out.println(name + " treats patients.");
    }
}

class Pharmacist extends Person {
    Pharmacist(String name) {
        super(name);
    }

    void dispense() {
        System.out.println(name + " dispenses medicines.");
    }
}

class Surgeon extends Doctor {
    Surgeon(String name) {
        super(name);
    }

    void operate() {
        System.out.println(name + " performs surgery.");
    }
}

public class Q13_HybridInheritanceConcept {
    public static void main(String[] args) {
        Surgeon s = new Surgeon("Dr. Rao");
        Pharmacist p = new Pharmacist("Neha");

        s.showPerson();
        s.treat();
        s.operate();
        System.out.println();
        p.showPerson();
        p.dispense();
    }
}
