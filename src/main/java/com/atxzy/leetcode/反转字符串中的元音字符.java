package com.atxzy.leetcode;

import java.util.Stack;
import javax.swing.plaf.nimbus.State;
import java.util.Stack;
public class 反转字符串中的元音字符 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        solution2.reverseVowels("hello");
    }
}

//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
//
// 示例 1:
//
// 输入: "hello"
//输出: "holle"
//
//
// 示例 2:
//
// 输入: "leetcode"
//输出: "leotcede"
//
// 说明:
//元音字母不包含字母"y"。
// Related Topics 双指针 字符串




//leetcode submit region begin(Prohibit modification and deletion)
class Solution2 {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push('a');
        stack.push('e');
        stack.push('i');
        stack.push('o');
        stack.push('u');
        if(s.length() <= 1){
            return  s;
        }
        int left = 0;
        int right = s.length()-1;
        char[] charS =  s.toCharArray();
        System.out.println(charS);
        while(left<right){
            while(left < right && !stack.contains(charS[left])){
                left++;
            }
            while(left < right && !stack.contains(charS[right])){
                right--;
            }
            if(left < right){
                char temp = charS[left];
                charS[left] = charS[right];
                charS[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(charS));
        return new String(charS);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
