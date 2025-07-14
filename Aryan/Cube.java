package Java_OOPS_2.Aryan;

public class Cube extends Shape{
    public Cube(){}

    public Cube(double dim1){
        super(dim1, -1, -1);
    }

    public void area(){
        System.out.println("Area of the Cube is " + 6 * dim1 * dim1);
    }

    public void volume(){
        System.out.println("Volume of the Cube is " + dim1 * dim1 * dim1);
    }
}
