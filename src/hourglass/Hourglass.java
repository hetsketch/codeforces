package hourglass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * Context
 * Given a  2D Array, :
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * We define an hourglass in  to be a subset of values with indices falling in this pattern
 * in 's graphical representation:
 * <p>
 * a b c
 * d
 * e f g
 * There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.
 * <p>
 * Task
 * Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
 * <p>
 * Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.
 * <p>
 * Input Format
 * <p>
 * There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in
 * will be in the inclusive range of  to .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the largest (maximum) hourglass sum found in .
 * <p>
 * Sample Input
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * Sample Output
 * <p>
 * 19
 */
public class Hourglass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        List<Integer> l = new ArrayList<>();
        int currentSum = 0;
        for (int n = 0; n < 4; n++) {
            for (int k = 0; k < 4; k++) {
                currentSum = arr[n][k] + arr[n][k + 1] + arr[n][k + 2]
                        + arr[n + 1][k + 1]
                        + arr[n + 2][k] + arr[n + 2][k + 1] + arr[n + 2][k + 2];
                l.add(currentSum);
            }
        }
        Collections.sort(l);
        System.out.println(l.get(15));

    }
}
