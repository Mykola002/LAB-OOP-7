package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task2 {
    public static Student[] filterStudents(Student[] input, Predicate<Student> p) {
        Student[] result = new Student[input.length];
        int counter = 0;
        for (Student s : input) {
            if (p.test(s)) {
                result[counter++] = s;
            }
        }
        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Іван Петренко", "KI-21", new int[]{85, 90, 78}),
                new Student("Марія Коваль", "KI-21", new int[]{55, 70, 80}), // є борг
                new Student("Олег Сидоренко", "KI-22", new int[]{95, 92, 88})
        };

        Predicate<Student> noDebts = (Student student) -> {
            for (int mark : student.getMarks()) {
                if (mark < 60) return false;
            }
            return true;
        };

        Student[] filtered = filterStudents(students, noDebts);
        System.out.println("Завдання 2:");
        System.out.println("Студенти без заборгованостей:");
        for (Student s : filtered) {
            System.out.println(s.getName());
        }
    }
}