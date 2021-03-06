import java.util.*;

//Java implementation to form the largest number
//by applying atmost one swap operation
public class largestNumber {
    // function to form the largest number by
    // applying atmost one swap operation
    static String largestNum(String num) {
        int n = num.length();
        int right;
        int rightMax[] = new int[n];

        // for the rightmost digit, there
        // will be no greater right digit
        rightMax[n - 1] = -1;

        // index of the greatest right digit
        // till the current index from the
        // right direction
        right = n - 1;

        // traverse the array from second right
        // element up to the left element
        for (int i = n - 1; i >= 0; i--) {
            // if 'num.charAt(i)' is less than the
            // greatest digit encountered so far
            if (num.charAt(i) < num.charAt(right))
                rightMax[i] = right;

            else {
                // there is no greater right digit
                // for 'num.charAt(i)'
                rightMax[i] = -1;

                // update 'right' index
                right = i;
            }
        }

        // traverse the 'rightMax[]' array from
        // left to right
        for (int i = 0; i < n; i++) {

            // if for the current digit, greater
            // right digit exists then swap it
            // with its greater right digit and break
            if (rightMax[i] != -1) {
                // performing the required swap operation
                num = swap(num, i, rightMax[i]);
                break;
            }
        }

        // required largest number
        return num;
    }

    // Utility method to swap two characters
    // in a String
    static String swap(String num, int i, int j) {
        StringBuilder sb = new StringBuilder(num);
        sb.setCharAt(i, num.charAt(j));
        sb.setCharAt(j, num.charAt(i));
        return sb.toString();

    }

    // Driver Function to test above Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();

            int[] num = new int[n];
            String str = "";

            for (int j = 0; j < n; j++) {
                int dum = sc.nextInt();
                str += dum;
            }

            str = largestNum(str);

            for (int j = 0; j < str.length(); j++) {
                int r = str.charAt(j);
                r = (r + 2) % 10;
                num[j] = r;
                System.out.print(r + " ");
            }
            System.out.println();
        }

    }

}