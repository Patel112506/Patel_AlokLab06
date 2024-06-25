import java.util.Scanner;

public class Task_Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, efficiency = 0, pricePerGallon = 0;
        boolean done = false;

        do {
            System.out.print("Enter number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine(); // clear the newline
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said the gallons were: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                efficiency = in.nextDouble();
                in.nextLine(); // clear the newline
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said the efficiency was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // clear the newline
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said the price was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        double costPer100Miles = (100 / efficiency) * pricePerGallon;
        double range = gallons * efficiency;

        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Range of the car with current gas: " + range + " miles");
    }
}