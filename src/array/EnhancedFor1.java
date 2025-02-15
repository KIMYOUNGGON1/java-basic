package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("Normal for statement number = " + number);
        }

        System.out.println();

        for (int number : numbers) {
            System.out.println("Enhanced for statement number = " + number);
        }

        System.out.println();

        // for-each문(향상된 for문)을 사용할 수 없는 경우, 증가하는 index 값 필요함.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
    }
}
