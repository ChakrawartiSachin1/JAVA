public class BollywoodActress {
    // Private attributes
    private String name;
    private int age;
    private String famousMovie;

    // Constructor
    public BollywoodActress(String name, int age, String famousMovie) {
        this.name = name;
        this.age = age;
        this.famousMovie = famousMovie;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for famous movie
    public String getFamousMovie() {
        return famousMovie;
    }

    // Setter method for famous movie
    public void setFamousMovie(String famousMovie) {
        this.famousMovie = famousMovie;
    }

    // Method to display actress information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Famous Movie: " + famousMovie);
    }

    public static void main(String[] args) {
        // Creating a new BollywoodActress object
        BollywoodActress deepikaPadukone = new BollywoodActress("Deepika Padukone", 35, "Padmaavat");

        // Displaying actress information
        deepikaPadukone.displayInfo();

        // Modifying actress information using setters
        deepikaPadukone.setName("Priyanka Chopra"); // Updating name
        deepikaPadukone.setAge(39); // Updating age
        deepikaPadukone.setFamousMovie("Bajirao Mastani"); // Updating famous movie

        // Displaying modified actress information
        deepikaPadukone.displayInfo();
    }
}
