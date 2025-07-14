package Java_OOPS_2.Aryan;

public class Circle1 extends Shape{
    public Circle1(){}

    public Circle1(double dim1){
        super(dim1, -1, -1);
    }

    public void area(){
        System.out.println("Area of the Circle is " + Math.PI * dim1* dim1);
    }

    public void perimeter(){
        System.out.println("Perimeter of the Circle is " + Math.PI * 2 * dim1);
    }
}
