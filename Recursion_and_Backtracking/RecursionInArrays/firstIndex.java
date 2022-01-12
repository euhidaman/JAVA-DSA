package Recursion_and_Backtracking.RecursionInArrays;

import java.util.Scanner;

public class firstIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstIndexes(arr,0, x));
    }

    public static int firstIndexes(int[] arr, int idx, int x)
    {
        if(idx >= arr.length)
            return -1;

        if(arr[idx] == x)
        {
            return idx;
        }
        else
        {
            return firstIndexes(arr, idx+1, x);
        }
    }
}
