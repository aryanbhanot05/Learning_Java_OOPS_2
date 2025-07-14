package Java_OOPS_2;

class Outer {
    int x = 10;
    static int z = 15;
    void  show() {
        System.out.println(x);
    }

    class Inner {
        int y = 5;
        
        void display() {
            System.out.println(x  + " : " + y);
        }
    }

    static class Inner1 {
        int y = 5;
        
        void display() {
            System.out.println(z  + " : " + y);
        }
    }
}

public class Inner_Class {
    public static void main(String[] args) {
        // Creating outer object and then the inner object separately.
        Outer outer = new Outer();
        Outer.Inner inner =  outer.new Inner();
        inner.display();
        outer.show();

        // Creating outer and inner object in a single line.
        Outer.Inner1 both = new Outer.Inner1(); 
        both.display();
        // both.show();
        // It will give error because we are trying
        // to access variable of another class.
    }
}