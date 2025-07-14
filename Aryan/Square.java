package Java_OOPS_2.Aryan;

public class Square extends Shape {
    public Square(){}

    public Square(double dim1){
        super(dim1, -1, -1);
    }

    public void area(){
        System.out.println("Area of the Square is " + dim1  * dim1);
    }

    public void perimeter(){
        System.out.println("Perimeter of the Square is " + 4 * dim1);
    }
}