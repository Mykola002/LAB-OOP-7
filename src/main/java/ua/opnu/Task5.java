package ua.opnu;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task5 {
    public static void processWithCondition(int[] input, Predicate<Integer> predicate, Consumer<Integer> action) {
        for (int i : input) {
            if (predicate.test(i)) {
                action.accept(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Predicate<Integer> isEven = (Integer n) -> n % 2 == 0;
        Consumer<Integer> printSquare = (Integer n) -> System.out.println("Парне число " + n + ", квадрат = " + (n * n));

        System.out.println("Завдання 5: ");
        processWithCondition(numbers, isEven, printSquare);
    }
}