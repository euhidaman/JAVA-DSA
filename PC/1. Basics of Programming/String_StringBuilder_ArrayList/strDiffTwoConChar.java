import java.util.*;

public class strDiffTwoConChar {

    public static String solution(String str){
        // write your code here
        StringBuilder res = new StringBuilder();
        res.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i-1);
            char cur = str.charAt(i);
            int gap = cur-prev;
            res.append(gap);
            res.append(cur);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }

}