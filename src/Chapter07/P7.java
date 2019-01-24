package Chapter07;

import java.util.Scanner;
import java.util.ArrayList;

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
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        fillArray(numbers, input.nextInt(), input);
        System.out.println("The average is " + average(numbers));
        displayArray(numbers);
    }
    /**
     * Takes users input and calculates the average
     *
     * @param numbers the numbers that are input by the user
     * @param input the users input
     */
    public static void fillArray(ArrayList<Integer> numbers, int size, Scanner input) {
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            numbers.add(input.nextInt());
        }
    }

    /**
     * takes the users input and calculates the length
     *
     * @param numbers the numbers that are input by the user
     * @return average
     */
    public static double average(ArrayList<Integer> numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        return sum / numbers.size();
    }

    /**
     * Calculates the average length for the users input
     *
     * @param numbers the numbers that are input by the user
     */
    public static void displayArray(ArrayList<Integer> numbers) {
        System.out.println("The contents of the Array List: " + numbers);
    }
}
