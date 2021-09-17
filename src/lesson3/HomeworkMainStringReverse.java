package lesson3;

import java.util.Scanner;

public class HomeworkMainStringReverse {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для разворота или 1 и enter");

        String str = scanner.next();

        if (str.equals("1")) str = "Каждый охотник знает где сидит фазан";

        printReverseString(str);

    }

    public static void printReverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
