package com.prac.algo.solution.pgmr.kit.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Q1844 {

    // 이동 방향 (상, 하, 좌, 우)
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static int BLOCK_DESTINATION_FLAG = -1;

    public int solution(int[][] maps) {
        int answer = 0;
        // 행,열 길이
        int rows = maps.length;
        int cols = maps[0].length;

        // 방문 여부
        boolean[][] visited = new boolean[rows][cols];
        // 최단 거리
        int[][] min = new int[rows][cols];

        Queue<int[]> queue = new LinkedList<>();

        //시작 노드
        queue.offer(new int[]{0,0});
        visited[0][0] =true;
        min[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 상하좌우 인접 노드 처리
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && !visited[newX][newY] && maps[newX][newY] != 0) {
                    queue.offer(new int[]{newX, newY});
                    visited[newX][newY] = true;
                    min[newX][newY] = min[x][y] + 1;
                }
            }

        }
        return min[rows - 1][cols -1] == 0 ? BLOCK_DESTINATION_FLAG : min[rows - 1][cols -1];
    }

    public static void main(String[] args) {

    }
}
