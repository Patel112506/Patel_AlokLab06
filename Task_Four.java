import java.util.Scanner;
import java.util.Random;

public class Task_Four {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;
        Scanner in = new Scanner(System.in);
        int guess = 0;
        boolean done = false;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine(); // clear the newline
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said the guess was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        System.out.println("The random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess is too low!");
        } else if (guess > randomNumber) {
            System.out.println("Your guess is too high!");
        } else {
            System.out.println("Your guess is correct!");
        }
    }
}
