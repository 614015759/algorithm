package com.atxzy.Sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] arrays = SortUtils.RandomArrays(100, 1000);
        SortUtils.soutArrays(shellSort(arrays));
    }

    public static int[] shellSort(int[] arrays) {
        int length = arrays.length;
        int gap = length / 2;
        while(gap > 0){

            for(int i = gap;i<length;i++){
                int preIndex = i - gap;
                int currentNum = arrays[i];
                while(preIndex >= 0 && currentNum < arrays[preIndex]  ){
                    arrays[preIndex + gap] = arrays[preIndex];
                    preIndex -= gap;
                }
                arrays[preIndex + gap] = currentNum;

            }
        gap /= 2;

        }

            return arrays;
    }
}
