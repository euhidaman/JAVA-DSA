package Recursion_and_Backtracking;

import java.util.*;

public class trial_file {
    public static void main(String[] args) throws Exception {
        // write your code here
        String s = "  -136 ";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' ')
            {
                str.append(s.charAt(i));
            }
        }
        int a = Integer.parseInt(str.toString());
        System.out.println(a);
    }
}