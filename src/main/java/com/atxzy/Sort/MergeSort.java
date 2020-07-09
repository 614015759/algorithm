package com.atxzy.Sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] ints = SortUtils.RandomArrays(100, 1000);

        int[] results = packs(ints);
        SortUtils.soutArrays(results);
    }

    public static int[] packs(int[] arrays){
        if(arrays.length < 2) {
            return arrays;
        }
        int[] leftArrays = Arrays.copyOfRange(arrays,0,(arrays.length)/2);
        int[] rightArrays = Arrays.copyOfRange(arrays,(arrays.length)/2,arrays.length);
        return MergeSort(packs(leftArrays),packs(rightArrays));


    }


    public static int[] MergeSort(int[] leftArrays,int[] rightArrays) {
        if(leftArrays.length == 0){
            return rightArrays;
        }
        if(rightArrays.length == 0){
            return leftArrays;
        }
        int leftLength = leftArrays.length;
        int rightLength = rightArrays.length;
        int[] result = new int[leftLength+rightLength];
        int leftPoint = 0;
        int rightPoint = 0;
        int resultPoint = 0;
        while(leftPoint < leftLength && rightPoint < rightLength){
            if(leftArrays[leftPoint] < rightArrays[rightPoint]){
                result[resultPoint++] = leftArrays[leftPoint++];
            }else{
                result[resultPoint++] = rightArrays[rightPoint++];
            }

        }
        while(leftPoint < leftLength){
            result[resultPoint++] = leftArrays[leftPoint++];
        }
        while(rightPoint < rightLength){
            result[resultPoint++] = rightArrays[rightPoint++];
        }


    return result;
    }
}
