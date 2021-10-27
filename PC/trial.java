import java.util.*;

public class trial {

    public static void main(String[] args) {

        String[] names = new String[] { "Ani", "Sam", "Aman", "Rahul", "Kaka" };
        int total_names = names.length;

        switch (total_names) {
        case 0:
            System.out.println("no one likes this");
            break;
        case 1:
            System.out.println(names[0] + " likes this");
            break;
        case 2:
            System.out.println(names[0] + " and " + names[1] + " like this");
            break;
        case 3:
            System.out.println(names[0] + ", " + names[1] + " and " + names[2] + " like this");
            break;
        default:
            int rest = total_names - 2;
            System.out.println(names[0] + ", " + names[1] + " and " + rest + " others like this");
            break;
        }
    }
}