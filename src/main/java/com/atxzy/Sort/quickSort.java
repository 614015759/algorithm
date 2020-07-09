package com.atxzy.Sort;

/**
 * 快速排序
 */
public class quickSort {

    public static void main(String[] args) {
        int[] arrays = SortUtils.RandomArrays(100, 1000);
        quickSort(arrays, 0, arrays.length - 1);
        SortUtils.soutArrays(arrays);

    }

    public static void quickSort(int[] arrays, int left, int right) {
        if (left >= right) {
            return;
        }

        int partition = partition(arrays, left, right);

        quickSort(arrays, left, partition - 1);
        quickSort(arrays, partition + 1, right);

    }

        private static int partition(int[] arrays,int left,int right) {
        int lo = left;
        int key = arrays[left++];
        while(left <= right ){
            while(arrays[right] > key && right >= left) {
                right--;
            }
            while(arrays[left] <= key && left <= right){
                left++;
            }
            if(right > left) {
                int temp = arrays[left];
                arrays[left] = arrays[right];
                arrays[right] = temp;
            }
        }
//        if(arrays[right] > key) {
            int temp = arrays[right];
            arrays[right] = key;
            arrays[lo] = temp;
            return right;
//        }else{
//            int temp = arrays[left];
//            arrays[left] = key;
//            arrays[lo] = temp;
//            return left;
//        }

    }
//    private static int partition(int[] arrays, int left, int right) {
//        int lo = left;
//        int key = arrays[left++];
//        while (left < right) {
//            while (arrays[right] > key && right > left) {
//                right--;
//            }
//            // 这里需要小于你的length
//            while (arrays[left] <= key && left < right) {
//                left++;
//            }
//            if (right > left) {
//                int temp = arrays[left];
//                arrays[left] = arrays[right];
//                arrays[right] = temp;
//            }
//        }
///*        if(arrays[left]>key) {
//            int temp = arrays[left-1];
//            arrays[left-1] = key;
//            arrays[lo] = temp;
//            return left-1;
//        }else{*/
//        int temp = arrays[right];
//        arrays[right] = key;
//        arrays[lo] = temp;
//        return right;
//    }

}
