package Extras.Codewars;

import java.util.*;

public class rotateNcounterClockwiseMatrix {

    public static int[][] anti_rotate(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // rotate right
        for (int i = 0; i < arr.length; i++) {
            int k = arr.length - 1;

            for (int j = 0; j < k; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;

                k--;
            }
        }

        return arr;
    }

    public static int[][] rotateCounterclockwise(int[][] matrix, int times) {

        while (times > 0) {
            matrix = anti_rotate(matrix);
            times--;
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int times = sc.nextInt();

        rotateCounterclockwise(arr, times);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}