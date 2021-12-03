package Extras.Codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class UTKPLC {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            char[] pref = new char[3];
            pref[0] = sc.next().charAt(0);
            pref[1] = sc.next().charAt(0);
            pref[2] = sc.next().charAt(0);

            char[] comp = new char[2];
            comp[0] = sc.next().charAt(0);
            comp[1] = sc.next().charAt(0);

            if (comp[0] == pref[0] || comp[1] == pref[0]) {
                System.out.println(pref[0]);
            } else {
                System.out.println(pref[1]);
            }

        }
    }
}
