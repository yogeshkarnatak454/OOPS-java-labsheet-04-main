// Q3. Pharmacy with static name and location (shared by all objects)
class Pharmacy {
    static String pharmacyName = "City Pharmacy";
    static String location = "Haridwar";
    int counterNumber;

    Pharmacy(int counterNumber) {
        this.counterNumber = counterNumber;
    }

    void display() {
        System.out.println("Counter " + counterNumber + " -> " + pharmacyName + ", " + location);
    }
}

public class Q03_Pharmacy {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy(1);
        Pharmacy p2 = new Pharmacy(2);
        p1.display();
        p2.display();

        // Changing the static value once changes it for every object
        Pharmacy.pharmacyName = "Health Plus Pharmacy";
        System.out.println("After changing static name:");
        p1.display();
        p2.display();
    }
}
