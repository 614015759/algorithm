package com.atxzy.数组;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        Object o = list.get(0);
        System.out.println(o);
    }



}
