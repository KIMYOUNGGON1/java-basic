package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");

        int count = input.nextInt();
        int[] inputNumbers = new int[count];

        int total = 0;
        double average = 0.0;

        System.out.println(count + "개의 정수를 입력하세요:");

        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = input.nextInt();
            total += inputNumbers[i];
        }

        average = (double) total / inputNumbers.length;

        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }
}
