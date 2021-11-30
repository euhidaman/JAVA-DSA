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

        int T = sc.nextInt();

        int arr[][] = new int[T][4];

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // for (int i = 0; i < T; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        for (int i = 0; i < T; i++) {
            float val = arr[i][0] + (arr[i][0] * (arr[i][3] / 100.0f));

            if (arr[i][1] <= val && val <= arr[i][2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
