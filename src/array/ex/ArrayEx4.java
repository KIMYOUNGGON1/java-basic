package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inputNumbers = new int[5];

        int total = 0;
        double average = 0.0;

        System.out.println("5개의 정수를 입력하세요:");

        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = input.nextInt();
            total += inputNumbers[i];
        }

        average = (double) total / 5;

        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }
}
