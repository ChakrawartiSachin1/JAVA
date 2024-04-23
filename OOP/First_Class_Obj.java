public class First_Class_Obj {

    public class Car {
        String Brand = Tata;
        String Color = red;

    }

    public static void main(String[] args) {
        Car mycar = new Car();

        System.out.println("Brand " + mycar.Brand);
        System.out.println("Color " + mycar.Color);
    }

}
