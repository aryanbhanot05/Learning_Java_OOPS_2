package Java_OOPS_2.Aryan;

public class Rectangle extends Shape {
    public Rectangle(){}

    public Rectangle(double dim1 , double dim2){
        super(dim1, dim2, -1);
    }

    public void area(){
        System.out.println("Area of the Rectangle is " + dim1  * dim2);
    }

    public void perimeter(){
        System.out.println("Perimeter of the Square is " + 2 * (dim1 + dim2));
    }
}
