package com.atxzy.leetcode;

import java.util.Stack;

public class 二进制求和67 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        String s = solution3.addBinary("0", "0");
        System.out.println(s);
    }
}
//给你两个二进制字符串，返回它们的和（用二进制表示）。
//
// 输入为 非空 字符串且只包含数字 1 和 0。
//
//
//
// 示例 1:
//
// 输入: a = "11", b = "1"
//输出: "100"
//
// 示例 2:
//
// 输入: a = "1010", b = "1011"
//输出: "10101"
//
//
//
// 提示：
//
//
// 每个字符串仅由字符 '0' 或 '1' 组成。
// 1 <= a.length, b.length <= 10^4
// 字符串如果不是 "0" ，就都不含前导零。
//
// Related Topics 数学 字符串

//1010 1011
//leetcode submit region begin(Prohibit modification and deletion)
class Solution3 {
    public String addBinary(String a, String b) {
        if(a.equals("")){
            return b;
        }
        if(b.equals("")){
            return a;
        }
        Stack<Character> stack = new Stack<>();
        boolean flag = false;
        int pointA = a.length() - 1;
        int pointB = b.length() - 1;

        while(pointA >=0 && pointB >=0){
            if(flag){
                if(a.charAt(pointA) == '1' && b.charAt(pointB) == '1'){
                    stack.push('1');
                    flag = true;

                }else if((a.charAt(pointA) == '1' && b.charAt(pointB) == '0')||(a.charAt(pointA) == '0' && b.charAt(pointB) == '1')){
                    stack.push('0');
                    flag = true;
                }else{
                    stack.push('1');
                    flag = false;
                }
            }else{
                if(a.charAt(pointA) == '1' && b.charAt(pointB) == '1'){
                    stack.push('0');
                    flag = true;

                }else if((a.charAt(pointA) == '1' && b.charAt(pointB) == '0')||(a.charAt(pointA) == '0' && b.charAt(pointB) == '1')){
                    stack.push('1');
                    flag = false;
                }else{
                    stack.push('0');
                }
            }
            pointA--;
            pointB--;
        }

        while(pointB >= 0){
            if (flag) {
                if (b.charAt(pointB) == '1'){
                    stack.push('0');
                    flag = true;
                }else{
                    stack.push('1');
                    flag = false;
                }
            }else{
                if (b.charAt(pointB) == '1'){
                    stack.push('1');
                }else{
                    stack.push('0');

                }
            }
            pointB--;
        }



        while(pointA >= 0){
            if (flag) {
                if (a.charAt(pointA) == '1'){
                    stack.push('0');
                    flag = true;
                }else{
                    stack.push('1');
                    flag = false;
                }
            }else{
                if (a.charAt(pointA) == '1'){
                    stack.push('1');

                }else{
                    stack.push('0');

                }
            }
            pointA--;
        }


        if(flag){
            stack.push('1');
        }
        String result = "";
       while(!stack.isEmpty()){
           result += stack.pop();
       }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


