package Java_OOPS_2;

import java.util.Scanner;

class InvalidInputException extends Exception{
    // is input is 8 and 9
    public String toString(){
        return  "Invalid Input!";
    }
}

class CannotDivideByZeroException extends Exception{
    public String toString(){
        return  "Cannot divide by zero!";
    }
}

class MaxInputException extends Exception{
    public String toString(){
        return  "The calculator does not support numbers greater than 1,00,000.";
    }
}

class MaxMultiplierReachedException extends Exception{
    public String toString(){
        return  "The output is greater than the calculation power of the calculator!";
    }
}

public class Exceptions_wala_Calculator {

    public static void Add(double num1 , double num2) throws InvalidInputException, MaxInputException{
        if  (num1 >= 100000 || num2 >= 100000) {
            throw new MaxInputException();
        }

        if (num1 == 8 && num2 == 9) {
            throw new InvalidInputException();
        }
        System.out.print("The sum of the given two numbers is: ");
        System.out.println(num1 + num2);
    }

    public static void Sub(double num1 , double num2) throws InvalidInputException, MaxInputException{
        if  (num1 >= 100000 || num2 >= 100000) {
            throw new MaxInputException();
        }

        if (num1 == 8 && num2 == 9) {
            throw new InvalidInputException();
        }
        System.out.print("The subtraction of the given two numbers is: ");
        System.out.println(num1 - num2);
    }

    public static void Mul(double num1 , double num2) throws MaxMultiplierReachedException , InvalidInputException, MaxInputException{
        if  (num1 >= 100000 || num2 >= 100000) {
            throw new MaxInputException();
        }

        if (num1 == 8 && num2 == 9) {
            throw new InvalidInputException();
        }

        if (num1 * num2 >= 1234567890) {
            throw new MaxMultiplierReachedException();
        }
        System.out.print("The product of the given two numbers is: ");
        System.out.println(num1 * num2);
    }

    public static void Div(double num1 , double num2) throws CannotDivideByZeroException , InvalidInputException, MaxInputException{
        if  (num1 >= 100000 || num2 >= 100000) {
            throw new MaxInputException();
        }

        if (num1 == 8 && num2 == 9) {
            throw new InvalidInputException();
        }

        if (num2 == 0) {
            throw new CannotDivideByZeroException();
        }
        System.out.print("The division of the given two numbers is: ");
        System.out.println(num1 / num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the particular function you want to use of the calculator (A, S, M, D): ");
        String func = sc.nextLine();
        System.out.print("Enter the first and second number separated by a space: ");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        switch(func.toUpperCase()){
            case "A" :
                try {
                    Add(num1 , num2);
                } catch (InvalidInputException | MaxInputException e) {
                    System.out.println(e);
                }
            break;
            case "S" :
                try {
                    Sub(num1, num2);
                } catch (InvalidInputException | MaxInputException e) {
                    System.out.println(e);
                }
            break;
            case "M" :
                try {
                    Mul(num1 , num2);
                } catch (MaxMultiplierReachedException | InvalidInputException | MaxInputException e) {
                    System.out.println(e);
                }
            break;
            case "D" :
                try {
                    Div(num1, num2);
                } catch (CannotDivideByZeroException | InvalidInputException | MaxInputException e) {
                    System.out.println(e);
                }
            break;
            default:
            System.out.println("You might have entered an invalid option.");
        }

        sc.close();
    }
}
