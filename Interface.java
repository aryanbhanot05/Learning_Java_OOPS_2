package Java_OOPS_2;

// abstract class can have 1 sub class only
// interface is the upgraded version i.e. it has final variables, support
// multiple inheritance and is abstract
// class that implements any interface must contain all the methods

interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface HornBicycle {
    void blowHornK3g();

    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
    int b = 5;

    void blowHorn() {
        System.out.println("Pee Pee Poo Poo");
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
    }

    public void blowHornK3g() {
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }

    public void blowHornmhn() {
        System.out.println("Main hoon naa po po po po");
    }
}
// Abstract class and methods

abstract class Parent2 {
    public Parent2() {
        System.out.println("Mai base2 ka constructor hoon");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet1();

    abstract public void greet2();

}

class Child2 extends Parent2 {
    public void greet1() {
        System.out.println("Good Morning!");
    }

    public void greet2() {
        System.out.println("Good Afternoon!");
    }
}

class Child3 extends Child2 {
    public void th() {
        System.out.println("i am good");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle cy = new AvonCycle();
        cy.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(Bicycle.a);

        // properties in interface are static and are called with the name of interface
        // You cannot modify the properties in Interfaces as they are final
        // Bicycle.a = 454;
        // be the properties can be edited
        cy.b = 55;
        System.out.println(cy.b);

        // Abstract class and methods
        Child2 c2 = new Child2();
        c2.greet1();
        c2.greet2();
        c2.sayHello();
        Child3 c3 = new Child3();
        c3.sayHello();
        c3.th();
    }
}