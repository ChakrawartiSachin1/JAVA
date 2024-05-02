public class Main {
    public static void main(String[] args) {
        try {
            // Code that may throw an unchecked exception
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        }
    }
}
