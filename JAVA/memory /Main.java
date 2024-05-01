public class Main {
    public static void main(String[] args) {
        // Creating an object and storing its reference in a reference variable (stack)
        MyClass obj = new MyClass(); // Object stored in heap, reference stored in stack
        
        // Accessing and manipulating the object's data (heap)
        obj.setData(42);
        int data = obj.getData();
        System.out.println("Data stored in the object: " + data);
        
        // Invoking the object's method (heap)
        obj.displayMessage();
    }
}

class MyClass {
    private int data;
    
    // Setter method to set data
    public void setData(int newData) {
        data = newData;
    }
    
    // Getter method to retrieve data
    public int getData() {
        return data;
    }
    
    // Method to display a message
    public void displayMessage() {
        System.out.println("Message from the object: Hello!");
    }
}
