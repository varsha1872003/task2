import java.io.*;
import java.util.*;

class task2 {
    public static void Number_Guessing() {

        Scanner sc = new Scanner(System.in);

        int num = 1 + (int) (20 * Math.random());

        int guess, temp;
        int turns = 3;
        int points = 0;
        int i;

        System.out.println("Hello!! \n<<<<<<<<<< Welcome to the Number Guessing game... >>>>>>>>>>");
        System.out.println("\nRules:");
        System.out.println("->You have to enter a number between 1 to 20 for this you have 3 chances/turns.");
        System.out.println("->You have to guess the number in those 3 chances/turns.");
        System.out.println("->After 3 turns your game will end.");

        System.out.println("->Press '1' to start the game");
        System.out.println("->Press '0' to end the game");

        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.println("Game started...\n");
            for (i = 0; i < 3; i++) {
                System.out.println("\nTry to Guess a number..");
                guess = sc.nextInt();

                if (guess > 100 || guess < 0) {
                    System.out.println("Sorry!! \n Enter only number between 1 - 100");
                } else if (guess == num) {
                    System.out.println("Congrats!! You guessed the correct number..!");
                    points += 10;
                    System.out.println("Your score is " + points);
                } else if (guess > num && i != turns - 1) {
                    System.out.println("Oh no! Correct Number is less than " + guess);
                } else if (guess < num && i != turns - 1) {
                    System.out.println("Oh no! Correct Number is greater than " + guess);
                }
            }

            if (turns == i) {
                System.out.println("\nYou have completed your turns");
                System.out.println("\n------ The correct number is " + num + " -------");
                System.out.println("\n\nDo you want to continue the game ?");
                System.out.println("\n->Press 1 to continue the game");
                System.out.println("->Press any number to exit the game");
                temp = sc.nextInt();

                if (temp == 1) {
                    Number_Guessing();
                } else {
                    System.out.println("<<<<<<<< Thank You! See You Again.... >>>>>>>>");
                }
            }

        } else {
            System.out.println("<<<<<<<< Thank You! >>>>>>>>");
        }
        sc.close();
    }

    public static void main(String[] args) {
        Number_Guessing();
    }

}
