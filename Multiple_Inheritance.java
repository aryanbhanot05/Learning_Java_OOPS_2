package Java_OOPS_2;

// Note: Multiple inheritance i.e. more than one parent class extends one sub class is 
// not allowed in java except the concept of interfaces
// interfaces cannot have any body
// we can make the method default or private and in that case, it can have a body

interface camera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    // void takeSnap1(){ System.out.println("Picture clicked");}; --> not allowed
    default void takeSnap1() {
        greet();
        System.out.println(
                "Picture clicked in default method in the interface\nand we can overwrite it at a particular place");
    };
}

interface wifi {
    String[] getNet();

    void connectNet(String Network);
}

class cellphone {
    public void call(int number) {
        System.out.println("Calling " + number);
    }

    public void pickup() {
        System.out.println("Connecting...");
    }
}

class smartphone extends cellphone implements camera, wifi {

    public void takeSnap() {
        System.out.println("Taking Picture");
    }

    public void recordVideo() {
        System.out.println("Recording");
    }

    public String[] getNet() {
        System.out.println("getting list of networks: ");
        String[] netlist = { "Aryan", "Devaaye", "Arydew" };
        return netlist;
    }

    public void connectNet(String Network) {
        System.out.println("Connected to " + Network);
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        String[] arr = sp.getNet();
        for (String string : arr) {
            System.out.println(string);
        }
        sp.takeSnap1();
    }
}
