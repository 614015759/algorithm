package com.atxzy.杂项;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class map桶 {
    public static void main(String[] args) {
    int[] ints = {1,2,3,2,2,2,5,4,2};
//        majorityElement((ints));
//        int max = Integer.max();
//        Stack<Integer> stack = new Stack<>();
        System.out.println(ints[0]);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i <nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max = nums[0];
        for(int i =  0;i<nums.length;i++){
            System.out.println(nums[i]+"  "+map.get(nums[i]));
            if(map.get(nums[i]) > map.get(max)){
                max = nums[i];
            }
        }
        System.out.println(max);
        return max;

    }

    @Test
    public void test1(){
        long max = Runtime.getRuntime().maxMemory();
        long total = Runtime.getRuntime().totalMemory();
        System.out.println(max/1024/1024);
        System.out.println(total/1024/1024);
    }

    @Test
    public void hello(){
        String str = "hellonimasiasjdoasjdsajdasdsadasadd";
        while(true){
            str += new Random().nextInt(88888888) + new Random().nextInt(888888888)+ new Random().nextInt(888888888)+ new Random().nextInt(888888888);
        }

    }


}
