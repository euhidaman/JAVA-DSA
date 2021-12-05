import java.util.*;

public class searchIn2DSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[][] arr= new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextLong();
            }
        }

        long key = sc.nextLong();

        if(key<arr[0][0] || key>arr[n-1][n-1])
        {
            System.out.println("Not Found");
            return;
        }

        long row=0, col=0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == key)
                {
                    row = i;
                    col = j;
                    found = true;
                }
            }
        }

        if(found)
        {
            System.out.println(row);
            System.out.println(col);
        }
        else
        {
            System.out.println("Not Found");
        }

    }
}