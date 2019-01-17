package Chapter08;

import java.util.Scanner;

/**
 * Returns the sum of each column in a user-defined 3x4 matrix.
 *
 * @author Rigel W.
 */
public class P8 {

    /**
     * The main method
     *
     * @param args The arguments taken
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] x = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                x[row][column] = input.nextDouble();
            }
        }

        for (int column = 0; column < 4; column++) {
            System.out.println("Sum of the elements at column " + column + " is " + sumColumn(x, column));
        }
    }

    /**
     * Calculates the sum of a column
     *
     * @param m The matrix to inspect and to calculate for
     * @param columnIndex The column index/position
     * @return The sum of the numbers in the column specified
     */
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (int row = 0; row < m.length; row++) {
            sum = sum + m[row][columnIndex];
        }
        return sum;
    }
}
