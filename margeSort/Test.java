package PACKAGE_NAME.margeSort;

import java.util.Arrays;

import static PACKAGE_NAME.margeSort.MergeSort.sortMergeNumbers;

public class Test {
    public static void main(String[] args) {

        // 2.У вас есть список из n элементов, которые представляют собой оценки студентов по математике.
        // Вам нужно отсортировать этот список в порядке убывания оценок с использованием алгоритма
        // сортировки Merge sort. Для решения этой задачи напишите функцию, которая принимает
        // на вход список оценок и возвращает новый список, отсортированный в порядке убывания.
        int[] numbers = {3, 8, 1, 9, 4, 2, 7, 6, 5};
        System.out.println(Arrays.toString(numbers));
        sortMergeNumbers(numbers);
        System.out.println(Arrays.toString(numbers));


        //3.Дан массив объектов типа PACKAGE_NAME.margeSort.Person, который содержит поля name (тип String)
        // и age (тип int). Необходимо отсортировать этот массив по возрасту в порядке убывания,
        // используя алгоритм Merge sort.
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 35),
                new Person("Eve", 28)
        };
        System.out.println(Arrays.toString(people));
        sortMergeNumbers(people);
        System.out.println(Arrays.toString(people));

    }
}
