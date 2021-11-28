/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class DIFACTRS {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }

        System.out.println(count);

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
