public class ObjectLifecycleExample {
    
    // Long-lived object as a class field
    private static Object longLivedObj;

    // Method demonstrating creation of short-lived objects
    public static void createShortLivedObjects() {
        for (int i = 0; i < 3; i++) {
            Object shortLivedObj = new Object(); // Short-lived object created within loop scope
            System.out.println("Short-lived object created: " + shortLivedObj);
        }
    }

    // Main method demonstrating creation of a long-lived object
    public static void main(String[] args) {
        // Creating short-lived objects within the main method
        createShortLivedObjects();

        // Creating a long-lived object outside short-lived scopes (in the main method)
        longLivedObj = new Object();
        System.out.println("Long-lived object created: " + longLivedObj);
    }
}
