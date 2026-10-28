package ua.opnu;

import java.util.Arrays;

public class SortingListTask {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Олег Сидоренко", "АІ-222", new int[]{95, 92}),
                new Student("Іван Петренко", "АI-223", new int[]{85, 90}),
                new Student("Марія Коваль", "АI-223", new int[]{75, 80})
        };

        System.out.println("Додаткове завдання (SortingList):");

        // Сортування за допомогою лямбда-виразу
        Arrays.sort(students, (Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println("Студенти після сортування за ім'ям (лямбда):");
        for (Student s : students) {
            System.out.println(s.getName() + " (" + s.getGroup() + ")");
        }
    }
}
