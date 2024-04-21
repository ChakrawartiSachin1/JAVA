import java.util.Scanner;

public class Second_Simple_Method {
    
    // Define a method to print the multiplication table
    public static void printTable(int N) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Table number : ");
        int N = input.nextInt();
        printTable(N); // Calling the method to print the multiplication table
    }
}
