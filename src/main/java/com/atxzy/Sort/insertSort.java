package com.atxzy.Sort;

public class insertSort {
    public static void main(String[] args) {
        int[] arrays = SortUtils.RandomArrays(100, 1000);
        SortUtils.soutArrays(insertSort(arrays));
    }

    public static int[] insertSort(int[] arrays){

        for(int i = 1 ; i<arrays.length;i++){
            int prepoint = i - 1;
            int point = arrays[i];
            while(point < arrays[prepoint] && prepoint > 0){
                arrays[prepoint +1 ] = arrays[prepoint];
                prepoint--;
            }
            arrays[prepoint + 1] = point;
        }

        return arrays;
    }

}
