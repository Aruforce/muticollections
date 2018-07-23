package com.github.aruforce.mutilist;

public class BalanceTree<E extends Comparable> {

    private  Node<E> dataNode;

    public void addNode(E otherNode) throws Exception{
        if (dataNode == null){
            dataNode = new Node<E>();
            dataNode.node = otherNode;
        }else {
            dataNode.add(otherNode);
        }
    }

    private class Node<E extends Comparable>{
        private Node<E> left;
        private E node;
        private Node<E> right;

        private void add(E otherNode) throws Exception{
            if (this.node.compareTo(otherNode)==0){
                throw new Exception();
            }else if (this.node.compareTo(otherNode)<0 &&left==null){
                Node<E> righttmp = new Node<>();
                righttmp.node = otherNode;
                right = righttmp;
            }else if (this.node.compareTo(otherNode)<0 &&left!=null){
                right.add(otherNode);
            }else if (this.node.compareTo(otherNode)>0 &&left==null){
                Node<E> lefttmp = new Node<>();
                lefttmp.node = otherNode;
                right = lefttmp;
            }else {
                left.add(otherNode);
            }

        }
    }

}

