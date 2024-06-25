import java.util.Scanner;

public class Task_Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0, height = 0;
        boolean done = false;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine(); // clear the newline
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said the width was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine(); // clear the newline
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said the height was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}
