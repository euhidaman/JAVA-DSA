import java.util.*;

// Easier method to search elements in a sorted 2D Matrix
// Alternate of file - searchIn2DSortedArray.java

public class search2DsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int key = sc.nextInt();

        int i=0,j=n;
        while (i<n && j>=0)
        {
            if (arr[i][j] == key)
            {
                System.out.println(i);
                System.out.println(j);
            }
            else if (arr[i][j] > key)
            {
                i++;
            }
            else {
                j--;
            }
        }

        System.out.println("Not Found");
    }
}