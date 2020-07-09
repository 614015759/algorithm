package com.atxzy.Sort;

public class selectSort {

    public static void main(String[] args) {
        int[] arrays = SortUtils.RandomArrays(100, 1000);
        int[] result = selectSort(arrays);

        System.out.println(result.length);
        SortUtils.soutArrays(arrays);
    }

    private static int[] selectSort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] < arrays[min]) {
                    min = j;
                }
            }
            int temp = arrays[min];
            arrays[min] = arrays[i];
            arrays[i] = temp;
        }
        return arrays;
    }
}
