package com.prac.algo.solution.inf.mapset;


import java.util.*;

/**
 * K번째 큰 수, TreeSet = 정렬 및 중복 제거
 */


public class INF0405 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numberCards = new ArrayList<>();

        int iter = sc.nextInt();
        int target = sc.nextInt();

        for (int i = 0; i < iter; i++) {
            numberCards.add(sc.nextInt());
        }

        TreeSet<Integer> results = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < iter; i++) {
            for (int j = i + 1; j < iter; j++) {
                for (int k = j + 1; k < iter; k++) {
                    results.add(numberCards.get(i) + numberCards.get(j) + numberCards.get(k));
                }
            }
        }

        int cnt = 1;
        int answer = -1;
        for (Integer result : results) {
            if (cnt == target) {
                answer = result;
                break;
            }
            cnt++;
        }
        System.out.println(answer);
    }
}
