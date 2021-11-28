/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
public class MINPIZZAS {

    // static int gcd(int a, int b) {
    // if (b == 0) {
    // return a;
    // }
    // return gcd(b, a % b);
    // }

    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            BigInteger N = sc.nextBigInteger();
            BigInteger S = sc.nextBigInteger();

            System.out.println(N.divide(N.gcd(S)));
        }

    }
}
