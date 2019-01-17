package Chapter07;

import java.util.Scanner;

/**
 * Gives students grades based on test scores
 *
 * @author Andrew Dolan
 */
public class C7_1 {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create the array
        System.out.print("Enter the number of students: ");
        int[] scores = new int[input.nextInt()];

        // Fill array with scores
        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        // Determine the highest score
        int highestScore = bestScore(scores);

        // Display output
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + determineGrade(scores[i], highestScore));
        }
    }

    /**
     * Determines which score is the best
     *
     * @param scores the imputed score
     * @return the best score
     */
    public static int bestScore(int[] scores) {
        int best = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        return best;
    }

    /**
     * determines the best grade
     *
     * @param score the imputed scores
     * @param best the best score from the previous method
     * @return the grades of the scores
     */
    public static char determineGrade(int score, int best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
