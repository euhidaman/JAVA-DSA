import java.util.*;

public class permutationString {

    public static void solution(String str){
        // write your code here
        int n = str.length();
        int fact = factorial(n);

        for (int i = 0; i < fact; i++) {
            StringBuilder res = new StringBuilder(str);
            int temp = i;
            for (int div = n; div >= 1 ; div--) {
                int r = temp%div;
                System.out.print(res.charAt(r));
                res.deleteCharAt(r);
                temp/=div;
            }
            System.out.println();
        }

    }

    public static int factorial(int n){
        int val = 1;
        for (int i = 2; i <= n; i++) {
            val*=i;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}