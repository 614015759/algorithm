package com.atxzy.Sort;

public class countSort {

    public static void main(String[] args) {
        int[] arrays = SortUtils.RandomArrays(100, 1000);
        SortUtils.soutArrays(countSortUp(arrays,1000));

    }

//    public static int[] countSort(int[] arrays,int range){
//        int[] Barrels = new int[range];
//        int[] results = new int[range];
//        int resultPoint = 0;
//        for(int i = 0 ; i<arrays.length;i++){
//            Barrels[arrays[i]]++;
//        }
//        for(int i = 0 ;i<range;i++){
//            if(Barrels[i] > 0) {
//                for (int j = 0; j < Barrels[i]; j++) {
//                    results[resultPoint++] = i;
//                }
//            }
//        }
//        return results;
//
//
//    }
    public static int[] countSortUp(int[] arrays,int range){

        int[] Barrels = new int[range];
        int[] results = new int[arrays.length];
        int resultPoint = arrays.length-1;
        for(int i = 0 ; i < arrays.length;i++){
            Barrels[arrays[i]]++;
        }
        for(int i = 1 ; i < Barrels.length;i++){
            Barrels[i] = Barrels[i] + Barrels[i-1];
        }
        for(int i = arrays.length-1;i>=0;i--){
            results[--Barrels[arrays[i]]] = arrays[i];
        }

            return results;


    }

}
