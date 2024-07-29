package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("더 하고 싶은 숫자를 입력해주세요.(0을 입력하면 프로그램은 종료됩니다.) => ");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("사용자가 '0'을 입력하여 프로그램이 종료됩니다.");
                break;
            }
            sum += num;
        }
        System.out.println("사용자가 입력한 모든 숫자의 합 : sum = " + sum);
    }
}
