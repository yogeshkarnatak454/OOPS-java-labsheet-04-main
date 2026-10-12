// Q6. Encapsulated Medicine Product: private data, class displays itself
class MedicineProduct {
    private String name;
    private double price;
    private String expiry;

    MedicineProduct(String name, double price, String expiry) {
        this.name = name;
        this.price = price;
        this.expiry = expiry;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Expiry: " + expiry);
    }
}

public class Q06_EncapsulatedMedicine {
    public static void main(String[] args) {
        MedicineProduct p = new MedicineProduct("Ibuprofen", 40.0, "12/2027");
        p.display();
    }
}
