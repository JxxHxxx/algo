package com.prac.algo.solution.inf;

import java.util.Scanner;

/**
 * 선택정렬
 * var
 * tmp : 비교대상이 되는 값을 담아둔다. cuz 해당 값을 특정 요소와 위치를 교환해야 한다.
 * index : tmp 값과 교환할 요소의 index 를 담는다.
 *
 */
public class INF0601 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();

        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < total; i++) {
            int tmp = arr[i];
            int index = i;
            for (int j = i + 1; j < total; j++) {
                //
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            arr[i] = arr[index];
            arr[index] = tmp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
