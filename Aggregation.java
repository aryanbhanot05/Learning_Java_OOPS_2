package Java_OOPS_2;

class Address {
    int pincode;
    static String country;
    String city;
}

class Student {
    String name;
    int roll;
    Address address = new Address();  // Object of another class in the same program
}

public class Aggregation {
    public static void main(String [] args){
        Address.country = "India";

        Student st1 = new Student();
        st1.name = "Aryan";
        st1.roll = 101;
        st1.address.pincode = 456789;
        st1.address.city = "Delhi";

        Student st2 = new Student();
        st2.name = "Bob";
        st2.roll = 102;
        st2.address.pincode = 123456; // changing the pincode for st2
        st2.address.city = "Mumbai";

        System.out.println(st1.name);
        System.out.println(st1.roll);
        System.out.println(st1.address.pincode); // prints 123456, as country is static
        System.out.println(st1.address.city); // prints Mumbai
        System.out.println(Address.country);

        System.out.println(st2.name);
        System.out.println(st2.roll);
        System.out.println(st2.address.pincode); // prints 123456, as country is static
        System.out.println(st2.address.city); // prints Mumbai
        System.out.println(Address.country);
    }
}