public class Main {
    public static void main(String[] args) {
        try {
            // Simulate an OutOfMemoryError by allocating a large array
            int[] array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            // Handle the OutOfMemoryError
            System.out.println("An OutOfMemoryError occurred: " + e.getMessage());
        }
    }
}
