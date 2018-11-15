package com.company;

/*Given an unsorted array, find the maximum difference
between the successive elements in its unsorted form.
Return 0 if the array contains less than 2 elements.*/

//O()
public class MaximumGap {

    public static int maxDiff(int[] arr){
        int bigDiff = 0, subDiff = 0;
        if(arr.length < 2){
            return bigDiff;
        }
        for(int i = 1; i < arr.length; ++i){
            if(arr[i] > arr[i-1]){
                subDiff = arr[i] - arr[i-1];
            }else{
                subDiff = arr[i-1] - arr[i];
            }

            if(subDiff > bigDiff){
                bigDiff = subDiff;
            }
        }
        return bigDiff;
    }

    public static void main(String[] args) {
        int[] arr= {1, 2, -3, 8, 5};
        //int[] arr = {1, 2, 5, 3, 6};

        System.out.println(maxDiff(arr));
    }
}
