package Java_OOPS_2.Aryan;

public class Sphere extends Shape{
    public Sphere(){}

    public Sphere(double dim1){
        super(dim1, -1, -1);
    }

    public void area(){
        System.out.println("Area of the Sphere is " + 4 * Math.PI * dim1* dim1);
    }

    public void volume(){
        System.out.println("Volume of the Sphere is " + 4 / 3 * Math.PI * dim1 * dim1 * dim1);
    }
}
