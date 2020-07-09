package com.atxzy.Sort;

public class bubbleSort {

    public static void main(String[] args) {
        int[] arrays = SortUtils.RandomArrays(100, 1000);
         SortUtils.soutArrays(bubbleSort(arrays));
    }

    public static int[] bubbleSort(int[] arrays){
        for(int i = 0 ; i < arrays.length;i++){
            for(int j = 0;j<arrays.length - i - 1;j++){
                if(arrays[j] > arrays[j+1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;

                }
            }
        }
            return arrays;
    }

}
