package Java_OOPS_2;

import java.util.Scanner;

// Creating my own exception class.
class MyException extends Exception{
    @Override
    public String toString(){
        // return super.toString() + "This is toString.";
        return "This is toString().";
    }
    
    @Override
    public String getMessage(){
        // return super.getMessage() + " This is getMessage().";
        return "This is getMessage().";
    }
}

class NegativeAreaException extends Exception{
    @Override
    public String toString(){
        // return super.toString() + "This is toString.";
        return "Wrong Input! Please enter carefully";
    }
}

class MaxRetriesReachedException extends Exception{
    @Override
    public String toString(){
        // return super.toString() + "This is toString.";
        return "OOPS! You have  reached the maximum number of retries.";
    }
}

public class Exceptions {

    public static void area(double r) throws NegativeAreaException{
        if (r < 0){
            throw new NegativeAreaException();
        }
        System.out.println("Area of the circle is: " + Math.PI * r * r);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        // // Syntax error
        // // int a = 0
        // // b = 10;

        // // Compile time error  -> that occers while writting the code.

        // // Runtime error

        // System.out.println(1000/5);
        // try {
        //     System.out.println(1000/0);
        // } catch(Exception e){
        //     System.out.println(e + " Caught -> that is a Runtime error.");
        // }

        // // Handling Specific exceptions
        // try {
        //     // System.out.println(8/0);
        //     int arr [] = new int [3];
        //     System.out.println(arr[4]);
        // } catch(ArithmeticException e){
        //     System.out.println(e + " This is an ArithemeticException");
        // } catch(Exception e1) {
        //     System.out.println("Some exception occured");
        // }

        // // Run a try catch block until all the conditions are working fine.

        // boolean flag = true;
        // while (flag) {
        //     try {
        //         int arr [] = new int [2];
        //         arr[0] = 10;
        //         arr[1] = 50;
        //         System.out.print("Enter index: ");
        //         int i = sc.nextInt();
        //         System.out.println(arr[i]);
        //         flag = false;
        //     } catch (Exception e){
        //         System.out.println("There is some problem in the input!");
        //     }
        // }

        // // Using my own exception class

        // System.out.print("Enter your age: ");
        // int a = sc.nextInt();
        // if (a <18) {
        //     try {
        //         throw new MyException();
        //     } catch(MyException e){
        //         System.out.println(e.getMessage());
        //         System.out.println();
        //         System.out.println(e.toString());
        //         System.out.println();
        //         System.out.println(e);
        //         System.out.println();
        //         e.printStackTrace();
        //         System.out.println();
        //         System.out.println("Finished");
        //     }
        // }

        // // Real life example of custom exceptions.
        // System.out.print("Enter the radius of the circle: ");
        // double r = sc.nextDouble();
        // try {
        //     area(r);
        // } catch (NegativeAreaException e) {
        //     System.out.println(e);
        // }

        // // Finally Block

        // try {
        //     for (int i = 0 ; i <= 5 ; i++ ) {
        //         System.out.println(i + " Hello World!");
        //         if (i == 4){
        //             System.out.println("My loop my rules, i am breaking the loop");
        //             break;
        //         }
        //     }
        // } catch(Exception e){
        //     System.out.println("An unexpected error just occured, resolving it.");
        // } finally {
        //     System.out.println("The finally section is executed");
        // }

        // Practice program
        int arr [] = new int [3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int i = 0;
        while (i < 6){
            try {
                System.out.print("Enter the index: ");
                int ind = sc.nextInt();
                System.out.println(arr[ind]);
            } catch(Exception e){
                System.out.println("Invalid index!");
                i++;
            }
            if (i == 5){
                try {
                    throw new MaxRetriesReachedException();
                } catch (MaxRetriesReachedException e) {
                    System.out.println(e);
                }
                break;
            }
        }
        
        sc.close();
    }
}
