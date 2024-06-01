package com.prac.algo.solution.pgmr.kit.queuestack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Task {
    private int progress;
    private int speed;

    public Task(int progress, int speed) {
        this.progress = progress;
        this.speed = speed;
    }

    public void updateProgress() {
        this.progress = this.progress + this.speed;
    }

    public boolean done() {
        return this.progress >= 100;
    }
}

public class Q42586 {

    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answers = new ArrayList<>();

        Queue<Task> tasks = new LinkedList<>();
        int taskSize = progresses.length;
        for (int i = 0; i < taskSize; i++) {
            tasks.add(new Task(progresses[i], speeds[i]));
        }

        while (!tasks.isEmpty()) {
            tasks.forEach(Task::updateProgress);

            int doneTaskCount = 0;
            while (tasks.peek().done()) {
                doneTaskCount++;
                tasks.remove();

                if (tasks.isEmpty()) {
                    break;
                }
            }

            if (doneTaskCount > 0) {
                answers.add(doneTaskCount);
            }
        }
        return answers;
    }


    public static void main(String[] args) {
        Q42586 q42586 = new Q42586();
        int[] progress = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(q42586.solution(progress, speeds));
    }
}
