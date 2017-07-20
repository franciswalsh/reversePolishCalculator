package com.company;

/**
 * Created by franciswalsh on 7/20/17.
 */
public class BubbleSort {

    public int[] bubSorting(int[] nums){
        for (int i = 0; i < nums.length; i++ ){
            for (int j = 0; j < nums.length - 1; j++){
                if (nums[j] > nums[j+1]) {
                    int smallerNumber = nums[j+1];
                    int largerNumber = nums[j];
                    nums[j] = smallerNumber;
                    nums[j+1] = largerNumber;
                }
            }

        }
        return nums;
    }
}
