package PC.Matrix;

import java.util.ArrayList;

public class spiralTraverseMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };

        ArrayList<Integer> res = spirallyTraverse(arr, arr.length, arr[0].length);

        System.out.println(res);
    }

    static ArrayList<Integer> spirallyTraverse(int[][] mat, int row, int col)
    {
        int r=0,c=0;
        int dir=0; // >0 , v1, <2 , ^3

        int top=0, down=row-1, left=0, right=col-1;
        ArrayList<Integer> res = new ArrayList<>();

        while(top<=down && left<=right)
        {
            if(dir==0)
            {
                for (int i = left; i <= right; i++) {
                    res.add(mat[top][i]);
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top; i<=down; i++)
                {
                    res.add(mat[i][right]);
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right; i>=left; i--)
                {
                    res.add(mat[down][i]);
                }
                down--;
            }
            else if(dir==3)
            {
                for(int i=down; i>=top; i--)
                {
                    res.add(mat[i][left]);
                }
                left++;
            }

            dir = (dir+1)%4;
        }

        return res;
    }
}
