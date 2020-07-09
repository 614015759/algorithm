package com.atxzy.trees.BSTree;

/**
 * 定义一个二叉查找树【链表结构】
 */
public class testBSTree01 {

    /**
     * 构建节点
     */
    private static class  Node{
        //定义我们的值
        private int value;
        //左子节点指针
        private Node left;
        //定义右子节点指针
        private Node right;
        //初始构造方法
        protected Node(Node left,Node right,int value){
            this.left = left;
            this.right = right;
            this.value = value;
        }


    }

}
