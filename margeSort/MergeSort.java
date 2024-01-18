package PACKAGE_NAME.margeSort;

import java.util.Arrays;

public class MergeSort {
    public static void sortMergeNumbers(int[] numb){
        int length = numb.length;
        if (length == 1) {
            return ;
        }
        int midl = length / 2;
        int[] left = new int[midl];
        int[] right = new int[length - midl];

        System.arraycopy(numb, 0, left, 0, midl);
        if (length - midl >= 0) System.arraycopy(numb, 0 + midl, right, 0, length - midl);
        sortMergeNumbers(left);
        sortMergeNumbers(right);

        merge(numb,left,right);
    }
    private static void merge(int[] numbers, int[] left, int[] right) {
        int leftLength = left.length; int rightLength = right.length;
        int leftIndex = 0;
        int rightIndex = 0;
        int arrIndex = 0;
        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (left[leftIndex] > right[rightIndex]) {
                numbers[arrIndex] = left[leftIndex];
                leftIndex++;
            } else {
                numbers[arrIndex] = right[rightIndex];
                rightIndex++;
            }
            arrIndex++;
        }
        while (leftIndex < leftLength) {
            numbers[arrIndex] = left[leftIndex];
            leftIndex++;
            arrIndex++;
        }
        while (rightIndex < rightLength) {
            numbers[arrIndex] = right[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }

    public static void sortMergeNumbers(Person[]people){
        int length = people.length;
        if (length == 1) {
            return;
        }
            int midl = length / 2;
            Person[] left = new Person[midl];
            Person[] right = new Person[length - midl];

        for (int i = 0; i < midl; ++i) {
            left[i] = people[i];
        }
        for (int j = 0; j < length - midl; ++j) {
            right[j] = people[j + midl];
        }
        sortMergeNumbers(left);
        sortMergeNumbers(right);
         merge(people,left,right);
    }

    private static void merge(Person[] people, Person[] left, Person[] right) {
        int leftLength = left.length; int rightLength = right.length;
        int leftIndex = 0;
        int rightIndex = 0;
        int arrIndex = 0;
        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (left[leftIndex].getAge() > right[rightIndex].getAge()) {
                people[arrIndex] = left[leftIndex];
                leftIndex++;
            } else {
                people[arrIndex] = right[rightIndex];
                rightIndex++;
            }
            arrIndex++;
        }
        while (leftIndex < leftLength) {
            people[arrIndex] = left[leftIndex];
            leftIndex++;
            arrIndex++;
        }
        while (rightIndex < rightLength) {
            people[arrIndex] = right[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }
}


