package Java_OOPS_2;
import Java_OOPS_2.Aryan.Circle1;

public class Using_Packages_Shape {
    public static void main(String[] args) {
        Java_OOPS_2.Aryan.Square s = new Java_OOPS_2.Aryan.Square();
        s.area();
        s.perimeter();
        
        Circle1 c = new Circle1(7);
        c.area();
    }
}
