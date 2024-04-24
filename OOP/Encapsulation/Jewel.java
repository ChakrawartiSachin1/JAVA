public class Jewel{
    // Private attributes
    private String type;
    private String material;
    private double diameter; // in millimeters
    private double price; // in dollars

    // Constructor
    public Jewel(String type, String material, double diameter, double price) {
        this.type = type;
        this.material = material;
        this.diameter = diameter;
        this.price = price;
    }

    // Getter method for type
    public String getType() {
        return type;
    }

    // Setter method for type
    public void setType(String type) {
        this.type = type;
    }

    // Getter method for material
    public String getMaterial() {
        return material;
    }

    // Setter method for material
    public void setMaterial(String material) {
        this.material = material;
    }

    // Getter method for diameter
    public double getDiameter() {
        return diameter;
    }

    // Setter method for diameter
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display jewel information
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter + " millimeters");
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating a new Jewel object
        Jewel jewel = new Jewel("Nose Ring", "Gold", 8.0, 100);

        // Displaying jewel information
        jewel.displayInfo();

        // Modifying jewel information using setters
        jewel.setPrice(120); // Updating price

        // Displaying modified jewel information
        jewel.displayInfo();
    }
}
