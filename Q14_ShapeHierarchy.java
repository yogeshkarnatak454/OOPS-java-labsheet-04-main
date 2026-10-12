// Q14. Shape Hierarchy: each child calculates its own area
class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Shape: " + name);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Q14_ShapeHierarchy {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        Circle c = new Circle(4);

        r.showName();
        System.out.println("Area: " + r.area());
        c.showName();
        System.out.println("Area: " + c.area());
    }
}
