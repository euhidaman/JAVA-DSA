import java.util.*;

public class toggle_Case {

    public static String toggleCase(String str){
        //write your code here
        String res="";
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if(Character.isUpperCase(val))
                res+=Character.toLowerCase(val);
            else
                res+=Character.toUpperCase(val);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}