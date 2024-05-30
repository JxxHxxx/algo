package com.prac.algo.solution.inf.graph;

class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}

/**
 * 이진트리기 때문에 재귀를 두번
 * 출력 위치에 따라 순회 방식이 정해짐, 스택 트레이스를 이헤하면 됨
 */

public class INF0705 {
    Node root;
    private void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }
    public static void main(String[] args) {
        INF0705 tree = new INF0705();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }


}
