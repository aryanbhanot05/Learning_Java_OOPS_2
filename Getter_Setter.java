package Java_OOPS_2;

class rect {
    double length;
    double breadth;

    rect() {
        this.length = 5;
        this.breadth = 7;
    }

    rect(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public void getLength() {
        System.out.println(this.length);
    }

    public void setLength(int l) {
        this.length = l;
    }

    public void getBreadth() {
        System.out.println(this.breadth);
    }

    public void setBreadth(int b) {
        this.breadth = b;
    }

    public void arear() {
        System.out.println("The area of the rectangle is " + this.length * this.breadth);
    }
}

class cuboid extends rect {
    double height;

    cuboid() {
        this.height = 6;
        this.length = 5;
        this.breadth = 7;
    }

    cuboid(int l, int b, int h) {
        super(l, b);
        this.height = h;
    }

    public void getHeight() {
        System.out.println(this.height);
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public void area() {
        System.out.println("The area of the cuboid is "
                + 2 * (this.length * this.breadth + this.breadth * this.height + this.height * this.length));
    }

    public double vol() {
        double volume = this.length * this.breadth * this.height;
        System.out.println("The vol of the cuboid is " + volume);
        return volume;
    }
}

public class Getter_Setter {
    public static void main(String[] args) {
        cuboid cb = new cuboid(5, 5, 5);
        // cb.setBreadth(5);
        // cb.setLength(6);
        // cb.setHeight(3);
        cb.area();
        cb.arear();
        cb.vol();
        // cb.getBreadth();
        // cb.getHeight();
        // cb.getLength();
        // rect r = new rect();
        // r.arear();
    }
}
