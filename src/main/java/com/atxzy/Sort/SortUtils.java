package com.atxzy.Sort;

import java.util.Random;

public class SortUtils {

    public static int[] RandomArrays(int num,int range){

        Random random = new Random();
        int[] result = new int[num];
        for(int i = 0 ;i < num ;i++){
            result[i] = random.nextInt(range);
        }
        return result;

    }
    public static void soutArrays(int[] arrays){
        for(int i = 0 ;i<arrays.length;i++){
            if(i % 9 == 0){
                System.out.println(arrays[i]+" ");
            }
          else{
                System.out.print(arrays[i]+" ");
            }
        }
    }

}
