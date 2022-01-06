package Recursion_and_Backtracking.Introduction_to_Recursion;

import java.util.*;

public class printDecreasingNumber {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n<1)
            System.exit(0);
        else
        {
            System.out.println(n);
            printDecreasing(n-1);
        }
    }

}