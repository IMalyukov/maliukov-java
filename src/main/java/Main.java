import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // If the entered number is greater than 7, then print “Hello”
        int number = readInt(input, "Enter the number: ");

        if (TasksFunctions.isGreaterThanSeven(number)) {
            System.out.println("Hello");
        }

        // If the entered name matches “John”, then output “Hello, John”, if not, then output "There is no such name"
        System.out.print("Enter a name: ");
        String name = input.nextLine();
        if (TasksFunctions.isJohn(name)) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        // There is a numeric array at the input, it is necessary to output array elements that are multiples of 3
        int length = readPositiveInt(input, "Enter the length of the array: ");
        int[] array = new int[length];
        System.out.println("Enter an array of numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = readInt(input, "Enter the number " + (i + 1) + ": ");
        }
        int[] multiples = TasksFunctions.getMultiplesOfThree(array);

        System.out.println("Elements divisible by 3:");
        System.out.println(Arrays.toString(multiples));

        input.close();
    }

    private static int readInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            }

            System.out.println("Please enter a valid integer.");
            scanner.nextLine();
        }
    }

    private static int readPositiveInt(Scanner scanner, String message) {
        while (true) {
            int value = readInt(scanner, message);

            if (value > 0) {
                return value;
            }

            System.out.println("Value must be greater than zero.");
        }
    }
}
