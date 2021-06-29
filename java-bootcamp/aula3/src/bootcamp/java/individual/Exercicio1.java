package bootcamp.java.individual;

import java.util.Arrays;
import java.util.Collections;

public class Exercicio1 {
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        Arrays.sort(array);
        printArraySingleLine(array);
        Arrays.sort(array, Collections.reverseOrder());
        printArraySingleLine(array);
    }

    private static void printArraySingleLine(Integer[] arr) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
