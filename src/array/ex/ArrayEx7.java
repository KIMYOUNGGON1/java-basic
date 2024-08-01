package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] studentsGrade = new int[4][3];

        for (int i = 0; i < studentsGrade.length; i++) {
            for (int j = 0; j < studentsGrade[i].length; j++) {
                System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

                System.out.print("국어 점수:");
                int koreanPoint = input.nextInt();

                System.out.print("영어 점수:");
                int englishPoint = input.nextInt();

                System.out.print("수학 점수:");
                int mathPoint = input.nextInt();
            }
        }

        for (int i = 0; i < studentsGrade.length; i++) {
            int total = 0;
            double average = 0.0;

            for (int j = i; j < studentsGrade[i].length; j++) {
                total += studentsGrade[i][j];
            }

            average = (double) total / studentsGrade[i].length;
            System.out.println(i + "번 학생의 총점: " + total + ", 평균: " + average);
        }

    }

}
