// Q4. Pharmacy Inventory: array and loop live inside Inventory, not main
class MedicineStock {
    String name;
    int quantity;

    MedicineStock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(name + " - " + quantity + " units");
    }
}

class Inventory {
    MedicineStock[] stocks = new MedicineStock[3];

    Inventory() {
        stocks[0] = new MedicineStock("Paracetamol", 120);
        stocks[1] = new MedicineStock("Amoxicillin", 60);
        stocks[2] = new MedicineStock("Cetirizine", 85);
    }

    void showAll() {
        for (int i = 0; i < stocks.length; i++) {
            stocks[i].display();
        }
    }
}

public class Q04_PharmacyInventory {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.showAll();
    }
}
