public class First_Method {

    public static void ADD(int n) {
        int result = n * n;
        System.out.println(result);
    }

    public static void ADD(double n) {
        double result = n * n;
        System.out.println(result);

    }

    public static void main(String[] args) {
        ADD(5);
        ADD(5.6);
    }
}
