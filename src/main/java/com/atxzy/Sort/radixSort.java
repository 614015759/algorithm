package com.atxzy.Sort;

import java.util.Arrays;

public class radixSort {
    public static void main(String[] args) {
        int[] arrays = SortUtils.RandomArrays(100, 1000);
        SortUtils.soutArrays(radixSort(arrays,1000,3));
    }

    public static int[] radixSort(int[] arrays,int range,int maxLength){
        int[] Barrels = new int[range];
        int[] result = new int[arrays.length];
        for(int i = 0 ; i < 3 ; i ++){
            int division = (int) Math.pow(10,i);
            for(int j = 0 ; j < arrays.length ; j++){
                int num = arrays[j]/division%10;
                Barrels[num]++;
            }
            for(int j = 1;j<Barrels.length;j++){
                Barrels[j] = Barrels[j]+ Barrels[j-1];
            }
            for(int j = arrays.length-1;j>=0;j--){
                int num = arrays[j]/division%10;
                result[--Barrels[num]] = arrays[j];
            }
            System.arraycopy(result,0,arrays,0,arrays.length);
            Arrays.fill(Barrels,0);
        }
        return arrays;
    }
}
