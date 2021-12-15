import java.util.*;

public class toggle_Case2 {

    public static String toggleCase(String str){
        //write your code here
        // 'p'-'a' = 'P'-'A'
        StringBuilder res = new StringBuilder(str);
        for (int i = 0; i < res.length(); i++) {
            char val = res.charAt(i);
            if(val>='a' && val<='z')
            {
                char uc = (char) ('A'+val-'a');
                res.setCharAt(i, uc);
            }
            else if(val>='A' && val<='Z')
            {
                char lc = (char) ('a'+val-'A');
                res.setCharAt(i, lc);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}