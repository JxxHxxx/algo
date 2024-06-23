package com.prac.algo.solution.inf.graph;

public class INF0703 {

    public int dfs(int n) {
        if (n == 1) {
            return 1;
        }
        return n * dfs(n - 1);
    }

    public static void main(String[] args) {
        INF0703 sol = new INF0703();
        System.out.println("answer : " + sol.dfs(5));
    }
}
