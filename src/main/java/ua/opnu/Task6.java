package ua.opnu;

import java.util.Arrays;
import java.util.function.Function;

public class Task6 {
    public static int[] processArray(int[] input, Function<Integer, Integer> function) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = function.apply(input[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = {0, 1, 2, 3, 4, 5};
        Function<Integer, Integer> powerOfTwo = (Integer n) -> 1 << n;

        int[] result = processArray(test, powerOfTwo);
        System.out.println("Завдання 6:");
        System.out.println("Степені двійки: " + Arrays.toString(result));
    }
}