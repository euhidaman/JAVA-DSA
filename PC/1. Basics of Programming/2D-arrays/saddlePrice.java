import java.util.*;

//least point in row
//max point in column
public class saddlePrice {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int colno = 0, min = 0;
        for (int i = 0; i < n; i++) {   // rows
            min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {   // columns
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    colno = j;
                }
            }
            
            boolean potentialAns = true;
            for (int r = 0; r < n; r++) {
                if (min < arr[r][colno]) {
                    potentialAns = false;
                    break;
                }
            }
            if (potentialAns) {
                System.out.print(min);
                return;
            }
        }

        System.out.print("Invalid Input");
    }
}