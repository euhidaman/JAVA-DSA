package Extras.Codewars;

import java.util.*;

public class findTheOddInt {
    public static void main(String[] args) {

        int[] a = new int[] { 1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1 };

        if (a.length == 1)
            System.out.println(a[0]);

        Arrays.sort(a);

        int count = 1;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count % 2 != 0)
                System.out.println(a[i]);
            else {
                // count = 1;
                i += (count - 1);
                count = 1;
            }

        }

        System.out.println(a[a.length - 1]);
    }
}
