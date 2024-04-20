import java.util.Scanner;

public class First_Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size Array String : ");
        int array_size = input.nextInt();
        System.out.println("  ");
        
        String[] array_String = new String[array_size];
        for (int i = 0; i < array_String.length; i++) {
             System.out.print("Enter the String of index " + i + " : ");
            array_String[i] = input.next();
            
           
            
        }
           System.out.println("Elements of the array of strings:");
        for (int i = 0; i < array_String.length; i++) {
            System.out.println("Array String of index" + i + " is =  " + array_String[i]);

        }

 System.out.print("\n  O index = "+ array_String[0]);

         
         
    }

}
