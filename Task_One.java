import java.util.Scanner;

public class Task_One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean done = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // clear the newline
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said the temperature was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit);
    }
}