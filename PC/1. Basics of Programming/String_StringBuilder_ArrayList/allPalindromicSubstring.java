import java.util.*;

public class allPalindromicSubstring {

    public static boolean Palindrome(String sub_str)
    {
        int left = 0, right=sub_str.length()-1;

        while(left<=right)
        {
            if(sub_str.charAt(left)==sub_str.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }

        return true;
    }

    public static void solution(String str){
        //write your code here
        for(int i=0;i<str.length(); i++)
        {
            for (int j = i+1; j<=str.length(); j++)
            {
                String sub_str = str.substring(i,j);

                if(Palindrome(sub_str))
                    System.out.println(sub_str);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}