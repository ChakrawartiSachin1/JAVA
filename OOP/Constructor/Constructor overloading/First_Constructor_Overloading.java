public class First_Constructor_Overloading {
    int value;

    // Default constructor
    public First_Constructor_Overloading() {
        value = 0;
    }

    // Constructor with one parameter
    public First_Constructor_Overloading(int value) {
        this.value = value;
    }

    // Constructor with two parameters
    public First_Constructor_Overloading(int value1, int value2) {
        this.value = value1 + value2;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        First_Constructor_Overloading obj1 = new First_Constructor_Overloading();             // Default constructor
        First_Constructor_Overloading obj2 = new First_Constructor_Overloading(10);           // Constructor with one parameter
        First_Constructor_Overloading obj3 = new First_Constructor_Overloading(20, 30);       // Constructor with two parameters

        // Displaying the values of each object
        System.out.println("Value of obj1: " + obj1.value);
        System.out.println("Value of obj2: " + obj2.value);
        System.out.println("Value of obj3: " + obj3.value);
    }
}
