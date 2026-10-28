package ua.opnu;

import java.util.function.Consumer;

public class Task4 {
    public static void forEachStudent(Student[] input, Consumer<Student> action) {
        for (Student s : input) {
            action.accept(s);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Іван Петренко", "KI-21", new int[]{85, 90}),
                new Student("Марія Коваль", "KI-21", new int[]{75, 80})
        };

        Consumer<Student> printName = (Student s) -> System.out.println("Студент: " + s.getName());

        System.out.println("Завдання 4:");
        forEachStudent(students, printName);
    }
}