package Java_OOPS_2;

class Students{
    String name;
    int roll;
    int marks;

    // // Constructor
    // // name of constructor and the class is always same
    // // constructors return nothing
    // // constructors are called only at the time of creating an new object

    Students() {
        System.out.println("Constructor called\n");
    }

    // Parameterised Constructor
    // Easier and Clearer than normal constructor

    Students(String n, int r, int m) {
        System.out.println("Parameterised Constructor called\n");
        this.name = n;
        this.roll = r;
        this.marks = m;
    }

    // this keyword

    public void printInfo() {
        System.out.println("Value stored in the object are:");
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.marks + "\n");
    }

    // Polymorphism (Function overlaoding)

    public void printInfo(String name) {
        System.out.println(this.name + "\n");
    }

    public void printInfo(int roll) {
        System.out.println(this.roll + "\n");
    }

    // We cannot overload a method with same data type

    // public void printInfo(int marks) {
    // System.out.println(this.marks + "\n");
    // }
}

public class OOPS_Basics {
    public static void main(String[] args) {

        // Here "Student()" is a Constructor

        Students s1 = new Students();
        s1.name = "Aryan";
        s1.roll = 1;
        s1.marks = 91;

        Students s2 = new Students();
        s2.name = "Devaaye";
        s2.roll = 2;
        s2.marks = 77;

        Students s3 = new Students("Chingu", 3, 100);

        // this keyword application

        s1.printInfo("Aryan");
        s1.printInfo(s1.name);
        s2.printInfo();
        s3.printInfo();

        // Array

        Students stu[] = new Students[3];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].name + " scored " + stu[i].marks + " marks");
        }

        System.out.println();

        for (Students e : stu) {
            System.out.println(e.name + " scored " + e.marks + " marks");
        }
    }
}