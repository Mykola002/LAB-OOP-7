package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task3 {
    public static int[] filterTwoPredicates(int[] input, Predicate<Integer> p1, Predicate<Integer> p2) {
        int[] result = new int[input.length];
        int counter = 0;
        for (int i : input) {
            if (p1.and(p2).test(i)) {
                result[counter++] = i;
            }
        }
        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30};

        Predicate<Integer> isEven = (Integer n) -> n % 2 == 0;
        Predicate<Integer> isGreaterThan10 = (Integer n) -> n > 10;

        int[] res = filterTwoPredicates(numbers, isEven, isGreaterThan10);
        System.out.println("Завдання 3: ");
        System.out.println("Числа (парні і > 10): " + Arrays.toString(res));
    }
}