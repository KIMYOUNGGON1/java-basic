package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        double average = 0.0;
        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        while (true) {
            int inputNum = input.nextInt();

            if (inputNum == -1) {
                break;
            }
            sum += inputNum;
            count++;
        }
        average = (double) sum / count;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
