package Java_OOPS_2;

// Single inheritance : When one class inherits another class, it is known as
// single level inheritance
// Hierarchical inheritance : Hierarchical inheritance is defined as the process
// of deriving more than one class from a base class
// Multilevel inheritance : Multilevel inheritance is a process of deriving a
// class from another derived class
// Hybrid inheritance : Hybrid inheritance is a combination of simple, multiple
// inheritance and hierarchical inheritance

class Shape {
    // Single
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    // Multilevel
    public void area(float h, float b) {
        System.out.println(1.0 / 2.0 * b * h);
    }
}

class Circle extends Shape {
    // Hierarchical
    public void area(float r) {
        System.out.println((3.14) * r * r);
    }
}

class EquilateralTriangle extends Triangle {
    // Hybrid
    public void area(float side) {
        System.out.println(1.0 / 2.0 * side * side);
    }
}

// Constructors in Inheritance
// concept of super included

class Base1 {
    Base1() {
        System.out.println("I am a constructor");
    }

    Base1(int x) {
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1 {
    Derived1() {
        // super(0);
        System.out.println("I am a derived class constructor");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends Derived1 {
    ChildOfDerived() {
        System.out.println("I am a child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }

    public void used(){
        System.out.println("This method is just here to remove the error of 'cd not used'");
    }
}

// Dynamic Method Dispatch

class Phone_super {
    public void a1() {
        System.out.println("Phone in Super class");
    }

    public void a2() {
        System.out.println("no music");
    }
}

class SmartPhone_sub extends Phone_super {
    public void a1() {
        System.out.println("Smart Phone in Sub class");
    }

    public void a3() {
        System.out.println("playing music");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();

        Triangle t1 = new Triangle();
        t1.area(10, 3);

        EquilateralTriangle et1 = new EquilateralTriangle();
        et1.area(5);

        Circle c1 = new Circle();
        c1.area(0.7f);

        // Constructors in Inheritance

        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(); // 12, 13, 15

        cd.used();

        // Dynamic Method Dispatch
        Phone_super obj = new SmartPhone_sub();
        obj.a1(); // Method overridding
        obj.a2();
        // obj.a3(); (We cannot run it as the super class is called.)
    }
}