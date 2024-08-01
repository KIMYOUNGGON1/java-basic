package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = input.nextInt();

        int[] inputNumbers = new int[count];
        System.out.println(count + "개의 정수를 입력하세요:");

        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = input.nextInt();
        }

        int max = inputNumbers[0];
        int min = inputNumbers[0];

        for (int i = 1; i < count; i++) {
            if (max < inputNumbers[i]) {
                max = inputNumbers[i];
            }
            if (min > inputNumbers[i]) {
                min = inputNumbers[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
