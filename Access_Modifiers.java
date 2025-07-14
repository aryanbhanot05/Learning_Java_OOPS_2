package Java_OOPS_2;

import java.util.Scanner;
import Java_OOPS_2.Aryan.*;

class c1{
    public int x = 1;
    protected int y = 2;
    int z = 3;
    private int a = 4;

    public void method() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class c2 extends a{
    public void method() {
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);  --> z is not visible
        // System.out.println(a);  --> a is not visible
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c1 c1 = new c1();
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);
        // System.out.println(c1.a);  --> c1.a is not visible
        System.out.println();
        c1.method();

        System.out.println("Object of file a created");
        a a = new a();
        System.out.println(a.x);
        // System.out.println(a.y);  --> a.y is not visible
        // System.out.println(a.z);  --> a.z is not visible
        // System.out.println(c1.a);  --> c1.a is not visible

        Name_Input n = new Name_Input();
        System.out.print("Enter your name please: ");
        String name = sc.nextLine();
        n.NameInput(name);

        sc.close();
    }
}
