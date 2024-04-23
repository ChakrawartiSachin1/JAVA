import java.util.Scanner;

public class Second_Arrary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int Array_Size = input.nextInt();
        System.out.println("Array Size is " + Array_Size + "\n");

        int[] Array_int = new int[Array_Size];

        System.out.println("Enter the Array of Elements ");
        for (int i = 0; i < Array_int.length; i++) {
            System.out.print("Enter the Element of index " + i + " = ");
            Array_int[i] = input.nextInt();
        }

        System.out.println(" ");

        System.out.println("Elements of Array are : ");
        for (int j = 0; j < Array_int.length; j++) {
            System.out.println("Array Element at " + j + " index is = " + Array_int[j]);
        }

    }

}
