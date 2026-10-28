package ua.opnu;

import java.util.Arrays;
import java.util.function.Function;

public class Task7 {
    public static String[] stringify(int[] input, Function<Integer, String> function) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = function.apply(input[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = {0, 1, 2, 3, 4, 5};

        Function<Integer, String> numberToWord = (Integer n) -> {
            String[] words = {"нуль", "один", "два", "три", "чотири", "п'ять", "шість", "сім", "вісім", "дев'ять"};
            if (n >= 0 && n < words.length) {
                return words[n];
            }
            return "невідомо";
        };

        String[] result = stringify(test, numberToWord);
        System.out.println("Завдання 7:");
        System.out.println("Рядкове представлення: " + Arrays.toString(result));
    }
}