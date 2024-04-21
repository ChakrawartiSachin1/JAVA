public class First_simple_Methods {

    // Define a method named simple_Methods
    public static void simple_Methods(){
        // Declare and initialize two String variables
        String First_Love = "Shraddhu ji";
        String Second_Love = "Priyal ji";

        // Concatenate the two strings and store the result in a new string variable
        String Pyar  = First_Love.concat(" " +Second_Love);
        
        // Print the concatenated string
        System.out.println(Pyar);
    }

    // Main method
    public static void main(String[] args) {
        // Call the simple_Methods() method
        simple_Methods();
    }

}
