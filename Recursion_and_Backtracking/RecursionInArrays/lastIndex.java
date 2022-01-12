package Recursion_and_Backtracking.RecursionInArrays;

import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

//        System.out.println(lastIndexes(arr, 0, x));
//        OR
        System.out.println(lastIndexes(arr, arr.length-1, x));
    }

//    public static int lastIndexes(int[] arr, int idx, int x)
//    {
//        if (idx >= arr.length) {
//            return -1;
//        }
//
//        int found = lastIndexes(arr, idx+1, x);
//        if((arr[idx]==x) && (idx>found))
//        {
//            found = idx;
//        }
//
//        return found;
//    }

    //  OR

    public static int lastIndexes(int[] arr, int idx, int x){

        if (idx < 0) {
            return -1;
        }

        int found = lastIndexes(arr, idx-1, x);

        if (arr[idx]==x)
        {
            return idx;
        }

        return found;
    }
}
