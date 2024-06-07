package com.prac.algo.solution.inf.mapset;

import java.util.*;

/**
 * 매출액의 종류 Hash, sliding window
 */
// N K
//7 4
//20 12 20 10 23 17 10
//3 4 4 3

public class INF0403 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer N = sc.nextInt();
        Integer K = sc.nextInt();
        Integer[] sales = new Integer[N];

        for (int i = 0; i < N; i++) {
            sales[i] = sc.nextInt();
        }

        // 매출액을 담고, 몇 갠지 구하고 첫 날 삭제, 그 다음날 추가
        Set<Integer> kindOfSales = new HashSet<>();

        for (int i = 0; i <= N - K; i++) {
            int iDaySales = sales[i];
            for (int j = 0 + i; j <= N - K + i; j++) {
                kindOfSales.add(sales[j]);
            }
            System.out.print(kindOfSales.size() + " ");
            kindOfSales.remove(iDaySales);
        }


    }
}
