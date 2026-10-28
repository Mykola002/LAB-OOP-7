package ua.opnu;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = (Integer n) -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println(" Завдання 1: ");
        System.out.println("Чи 7 просте? " + isPrime.test(7));  // true
        System.out.println("Чи 4 просте? " + isPrime.test(4));  // false
        System.out.println("Чи 11 просте? " + isPrime.test(11)); // true
    }
}