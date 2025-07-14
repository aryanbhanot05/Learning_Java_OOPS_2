package Java_OOPS_2.Aryan;

public class Cuboid extends Shape{
    public Cuboid(){}

    public Cuboid(double dim1, double dim2, double dim3){
        super(dim1, dim2 , dim3);
    }

    public void area(){
        System.out.println("Area of the Cuboid is " + 2 * (dim1 * dim2 + dim2 * dim3 + dim1 * dim3));
    }

    public void volume(){
        System.out.println("Volume of the Cuboid is " + dim1 * dim1 * dim1);
    }
}
