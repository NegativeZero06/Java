import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        // Checking if number is positive
        if (number > 0) {
            for (int i = 0; i <= number; i++) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Cannot Print.");
        }

        // Closing Scanner object
        input.close();
    }
}
