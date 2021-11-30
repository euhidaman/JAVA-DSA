package Extras.Codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][5];
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    count++;
                    arr[i][j] = count;
                }
            } else {
                for (int j = 4; j >= 0; j--) {
                    count++;
                    arr[i][j] = count;
                }
            }

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
