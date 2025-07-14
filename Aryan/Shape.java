package Java_OOPS_2.Aryan;

public class Shape {
    double dim1;
    double dim2;
    double dim3;

    public Shape(){
        dim1 = 5;
        dim2 = 7;
        dim3 = 10;
    }

    public Shape(double dim1, double dim2, double dim3){
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }

    // Getters and Setters of the Dimentions
    public double getDim1() {
        return this.dim1;
    }
    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }
    public double getDim2() {
        return this.dim2;
    }
    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }
    public double getDim3() {
        return this.dim3;
    }
    public void setDim3(double dim3) {
        this.dim3 = dim3;
    }

    // public static void main(String[] args) {
    //     Shape s = new Shape();
    //     System.out.println("Dimension 1: " + s.getDim1());
    //     System.out.println("Dimension 2: " + s.getDim2());
    //     System.out.println("Dimension 3: " + s.getDim3());
    // }
}
