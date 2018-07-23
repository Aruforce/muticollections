package com.github.aruforce.mutilist;

public class Test {
    public static void main(String[] args) {
        BalanceTree<Integer> balanceTree = new BalanceTree<Integer>();
        try {
            balanceTree.addNode(1);
            balanceTree.addNode(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
