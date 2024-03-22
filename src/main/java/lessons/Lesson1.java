package lessons;

public class Lesson1 {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
