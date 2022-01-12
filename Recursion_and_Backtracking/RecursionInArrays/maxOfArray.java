package Recursion_and_Backtracking.RecursionInArrays;

import java.util.*;

public class maxOfArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = maxOfFullArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfFullArray(int[] arr, int idx){

        if (idx >= arr.length) {
            return Integer.MIN_VALUE;
        }

        int max_val = maxOfFullArray(arr, idx+1);
        return Math.max(arr[idx], max_val);
    }
}
