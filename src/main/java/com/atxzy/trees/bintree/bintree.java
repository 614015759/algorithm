package com.atxzy.trees.bintree;

import java.util.ArrayList;
import java.util.List;

public class bintree {

    public bintree leftChild;
    public bintree rightChild;
    public bintree root;
public Object data;

    public bintree() {
    }

    public List<bintree> datas;

    public bintree(bintree leftChild,bintree rightChild,Object data){
        this.data = data;
        this.leftChild = leftChild;
    }

    public bintree(Object data){
        this(null,null,data);
    }

    public void createBintree(Object[] objs){
        datas = new ArrayList<bintree>();
        for(Object obj : objs){
            datas.add(new bintree(obj));
        }
        root = datas.get(0);
        for(int i = 0 ; i < datas.size()/2;i++){
            datas.get(i).leftChild = datas.get(i*2+1);
            if(i * 2 + 2 < datas.size()){
                datas.get(i).rightChild = datas.get(i*2+2);
            }
        }
    }

    public void preOrder(bintree root){
        if(root == null) {
            return ;
        }
        System.out.println(root.data);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }
    public static void main(String[] args) {
        bintree bintree = new bintree();
        Object[] a = {'A','B','E',null,'C',null,'F',null,null,'D',null,'G',null,'H','K'};
        bintree.createBintree(a);
        bintree.preOrder(bintree.root);
    }

}
