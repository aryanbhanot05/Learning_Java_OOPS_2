package Java_OOPS_2;

import java.util.Random;
import java.util.Scanner;

class Game {
    int No_Of_Guesses = 0;
    int user;
    int win;

    Game() {
        Random random = new Random();
        this.win = random.nextInt(100);
    }

    void Guess() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the Number: ");
        user = sc.nextInt();

        sc.close();
    }

    boolean won() {
        No_Of_Guesses++;
        if (user == win) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", win,
                    No_Of_Guesses);
            return true;
        } else if (user < win) {
            System.out.println("Too low...");
        } else if (user > win) {
            System.out.println("Too high...");
        }
        return false;

        // int get_No_Of_Guesses() {
        // return No_Of_Guesses;
        // }

        // void set_No_Of_Guesses(int No_Of_Guesses) {
        // this.No_Of_Guesses = No_Of_Guesses;
        // }
    }
}

public class Guess_Number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean a = false;
        while (!a) {
            g.Guess();
            a = g.won();
        }
    }
}