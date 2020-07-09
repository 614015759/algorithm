package com.atxzy.leetcode;
import com.sun.deploy.util.StringUtils;
public class 验证回文串125 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        boolean palindrome = solution1.isPalindrome("./ ");
        System.out.println(palindrome);


    }
}
//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
// 说明：本题中，我们将空字符串定义为有效的回文串。
//
// 示例 1:
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
//
//
// 示例 2:
//
// 输入: "race a car"
//输出: false
//
// Related Topics 双指针 字符串




//leetcode submit region begin(Prohibit modification and deletion)
class Solution1 {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        s = s.replace(" ","");
        if(s.length()<1) {
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while (left < s.length() && (s.charAt(left)<48 ||  (s.charAt(left)>57&&s.charAt(left)<65) ||
                    (s.charAt(left)>89 && s.charAt(left) < 97) || s.charAt(left)>122)){
                left++;
            }
            while (right>0 && (s.charAt(right)<48 ||  (s.charAt(right)>57&&s.charAt(right)<65) ||
                    (s.charAt(right)>89 && s.charAt(right) < 97) || s.charAt(right)>122)){
                right--;
            }
            if(left > right){
                return true;
            }
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
