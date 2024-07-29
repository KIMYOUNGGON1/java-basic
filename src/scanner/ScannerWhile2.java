package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("이 계산기 기능은 첫 번째 숫자와 두 번째 숫자를 모두 0으로 입력하면 프로그램이 종료됩니다.");
            System.out.print("더하고 싶은 첫 번째 숫자를 입력해주세요. =>");
            int num1 = scanner.nextInt();
            System.out.print("더하고 싶은 두 번째 숫자를 입력해주세요. =>");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            sum = num1 + num2;

            System.out.println("두 숫자의 합은 => " + sum);
        }
    }
}
