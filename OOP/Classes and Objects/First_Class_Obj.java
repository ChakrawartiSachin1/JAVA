public class First_Class_Obj {

    public static class Car {
        String Brand = "Tata"; // Enclose string literals in double quotes
        String Color = "red";  // Enclose string literals in double quotes
    }

    public static void main(String[] args) {
        Car mycar = new Car();

        System.out.println("Brand: " + mycar.Brand);
        System.out.println("Color: " + mycar.Color);
    }
}
