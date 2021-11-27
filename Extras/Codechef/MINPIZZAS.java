/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class MINPIZZAS {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int N = sc.nextInt();
            int S = sc.nextInt();

            if (N < S) {
                System.out.println(N % S);
            } else {
                if (N % S == 0) {
                    System.out.println(N / S);
                } else {
                    System.out.println(N * S);
                }
            }

        }

    }
}
