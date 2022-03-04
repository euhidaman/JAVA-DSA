package PC;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
//        int[] arr = {5,4,8,2,7,1,16,3};
            int[] arr = {1,2,3,4,5,6};

        for (int i = 0; i < arr.length-1; i++) {
            boolean isSwapped = false; // check if swap occurs
            for (int j = 0; j < arr.length-i-1; j++) {
                // This is for swapping
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) // if, swap doesn't occur, then condition is true
            {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
