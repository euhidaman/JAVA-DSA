import java.util.*;

//least point in row, but
//max point in column

public class saddlePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int max = Integer.MIN_VALUE, row = -1, col=-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        int min=Integer.MAX_VALUE, new_col=-1;
        for (int j = 0; j < n; j++) {
            if(arr[row][j]<min)
            {
                min = arr[row][j];
                new_col = j;
            }
        }

        if(new_col > col)
            System.out.println("Invalid input");
        else
            System.out.println(min);
    }
}