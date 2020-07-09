package com.atxzy.backstrack;

import java.util.ArrayList;
import java.util.List;

public class 括号生成 {


    public static void main(String[] args) {
        int n;
        括号生成 kuo = new 括号生成();
        List<String> list = new ArrayList<>();
        kuo.backStrack(list,0,0,3,"");

    }

    public void   backStrack(List<String> result,int open,int close,int n,String str){
        if(close == n){
            result.add(str);
            System.out.println(str);
        }else{
            if(open < n){
                backStrack(result,open+1,close,n,str+"(");
            }
            if(close < open){
                backStrack(result,open,close+1,n,str+")");
            }

        }

    }
}
