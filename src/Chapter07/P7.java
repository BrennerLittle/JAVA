package Chapter07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to display an array for the total and average number of the users
 * input
 *
 * @author Ethan Boyer
 */
public class P7 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create the array
        System.out.print("How many numbers will be read: ");
        int[] numbers = new int[input.nextInt()];

        fillArray(numbers, input);
        System.out.println("The average is " + average(numbers));
        displayArray(numbers);
    }

    /**
     * Takes users input and calculates the average
     *
     * @param numbers the numbers that are input by the user
     * @param input the users input
     */
    public static void fillArray(int[] numbers, Scanner input) {
        System.out.print("Enter " + numbers.length + " elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }

    /**
     * takes the users input and calculates the length
     *
     * @param numbers the numbers that are input by the user
     * @return average
     */
    public static double average(int[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum / numbers.length;
    }

    /**
     * Calculates the average length for the users input
     *
     * @param numbers the numbers that are input by the user
     */
    public static void displayArray(int[] numbers) {
        System.out.println("The contents of the array: " + Arrays.toString(numbers));
    }
}
