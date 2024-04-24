public class Jewellery {
    // Private attributes
    private String type;
    private String material;
    private double weight; // in grams
    private double price; // in dollars

    // Constructor
    public Jewellery(String type, String material, double weight, double price) {
        this.type = type;
        this.material = material;
        this.weight = weight;
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

    // Getter method for weight
    public double getWeight() {
        return weight;
    }

    // Setter method for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to calculate the price per gram of jewellery
    public double pricePerGram() {
        return price / weight;
    }

    // Method to display jewellery information
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Price: $" + price);
        System.out.println("Price per gram: $" + pricePerGram() + " per gram");
    }

    public static void main(String[] args) {
        // Creating a new Jewellery object
        Jewellery necklace = new Jewellery("Necklace", "Gold", 20.5, 1500);

        // Displaying jewellery information
        necklace.displayInfo();

        // Modifying jewellery information using setters
        necklace.setPrice(2000); // Updating price

        // Displaying modified jewellery information
        necklace.displayInfo();
    }
}
