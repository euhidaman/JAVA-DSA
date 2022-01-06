package PC;

import java.util.*;

public class trial {

        public static void quicksort(int[] nums, int low, int high)
        {
            int j;
            if(low<high)
            {
                j = partition(nums, low, high);
                quicksort(nums, low, j-1);
                quicksort(nums, j+1, high);
            }
        }

        public static int partition(int[] nums, int low, int high)
        {
            int pivot = nums[low];
            int i = low+1;
            int j = high;
            int temp;
            while(true)
            {
                while(pivot>nums[i] && i<=high)
                {
                    i++;
                }
                while(pivot < nums[j])
                {
                    j--;
                }

                if(i<j)
                {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                else
                {
                    temp = nums[j];
                    nums[j] = nums[low];
                    nums[low] = temp;
                    return j;
                }
            }
        }

    public static void main(String[] args) {
        int[] nums = {10, 5, 13, 11, 24, 19, 3};
        quicksort(nums, 0, nums.length-1);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}