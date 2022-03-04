package Interviews;

import java.util.Scanner;

public class binaryToBase6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digits = sc.nextInt();
        boolean[] binary = new boolean[digits];

        for (int i = 0; i < digits; i++) {
            binary[i] = sc.nextBoolean();
        }

        int base6 = convertBase(binary,digits);
        System.out.println(base6);
    }

//    [1,0,1] = [true, false, true]
//    convert binary to decimal
//    convert decimal to base6
//    base6 = 1x(6^2) + 0x(6^1) + 1x(6^0)
    public static int convertBase(boolean binary[], int digits)
    {
        int number = 0;
        int count = 0;

        return  0;
    }
}
