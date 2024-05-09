// File: ArrayInput.java

package myPackage;

import java.util.Scanner;

public class ArrayInput {
    public static int[] getUserArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }
}
