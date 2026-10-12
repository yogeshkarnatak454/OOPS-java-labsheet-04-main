// Q2. Medicine with a parameterized constructor
class Medicine {
    String name;
    double price;
    int quantity;

    Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Medicine: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

public class Q02_Medicine {
    public static void main(String[] args) {
        Medicine m = new Medicine("Paracetamol", 25.5, 100);
        m.display();
    }
}
