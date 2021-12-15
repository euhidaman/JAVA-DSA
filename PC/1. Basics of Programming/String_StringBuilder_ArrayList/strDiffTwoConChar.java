import java.util.*;

public class strDiffTwoConChar {

    public static String solution(String str){
        // write your code here
        StringBuilder res = new StringBuilder(str);
        int[] num = new int[res.length()-1];
        for (int i = 1; i < res.length(); i++) {
            char cur = res.charAt(i-1);
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }

}