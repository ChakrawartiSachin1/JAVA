// File: ArrayProcessor.java

package myPackage;

public class ArrayProcessor {
    public static void processArray(int[] array) {
        System.out.println("Array received from user:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        // You can perform any processing on the array here
    }
}
