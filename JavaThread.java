package com.app.java;

import java.util.Random;

class Student implements Runnable {
    int[] marks;
    int total = 0;
    long limit;
    static long mytime;

    Student(long limit) {
        Random random = new Random();
        marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(99) + 1;
        }
        this.limit = limit;
        mytime = limit;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < marks.length; i++) {
                Thread.sleep(limit);
                total += marks[i];
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class JavaThread {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        Thread[] studentList = new Thread[students.length];
        long timeLimit = 0;
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(10);
            studentList[i] = new Thread(students[i], "Student " + (i + 1));
            timeLimit += (students[i].limit * students[i].marks.length);
        }

        for (int i = 0; i < students.length; i++) {
            studentList[i].start();
        }

        try {
            System.out.println(timeLimit);
            for (int i = 0; i <= timeLimit; i += Student.mytime) {
                if (i % 10 == 0) {
                    Thread.sleep(i);
                    System.out.print('\u2665');
                } else {
                }
            }
            System.out.println();
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].total);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
