/*
 * Q12. Multiple Inheritance: Concept Only
 *
 * In Java a class can extend ONLY ONE class:
 *
 *     class C extends A, B { }     // COMPILE ERROR
 *
 * Why? The "Diamond Problem" / ambiguity.
 * Suppose A and B both have a method show(). If C extended both,
 * and we call c.show(), Java would not know whether to run A's show()
 * or B's show(). To avoid this ambiguity (and the complexity of
 * constructor chaining from two parents), Java's designers allowed
 * only single class inheritance.
 *
 * The program below shows what IS allowed: one parent per class.
 */
class A {
    void show() {
        System.out.println("show() from A");
    }
}

class B {
    void show() {
        System.out.println("show() from B");
    }
}

// Allowed: C extends only A
class C extends A {
    void display() {
        System.out.println("C inherits from exactly one class (A).");
    }
}

// NOT allowed (uncommenting causes a compile error):
// class D extends A, B { }

public class Q12_MultipleInheritanceConcept {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
        System.out.println("A class cannot extend two classes because show() would be ambiguous.");
    }
}
