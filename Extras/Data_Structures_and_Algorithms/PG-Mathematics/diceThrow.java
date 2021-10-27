// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class diceThrow {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            int X = Integer.parseInt(S[2]);

            Solution2 ob = new Solution2();
            System.out.println(ob.noOfWays(M, N, X));
        }
    }
}// } Driver Code Ends

// User function Template for Java

class Solution2 {
    static long noOfWays(int M, int N, int X) {
        // code here
        return 0;
    }
};