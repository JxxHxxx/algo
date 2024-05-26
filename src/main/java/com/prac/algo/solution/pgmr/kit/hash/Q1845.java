package com.prac.algo.solution.pgmr.kit.hash;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Q1845 {

    public int solution(int[] nums) { // nums N마리 폰켓몬의 종료 번호가 담긴 배열
        int choiceNum = nums.length / 2;

        Set<Integer> uniquePocketNumbers = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int size = uniquePocketNumbers.size();
        return size > choiceNum ? choiceNum : size;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        int result = new Q1845().solution(nums);
        System.out.println(result);

    }
}
