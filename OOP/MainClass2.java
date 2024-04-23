class Demo2 {
    static int p = 10;
    static int q = 20;
}

class MainClass2 {

    public static void main(String[] args) {
        System.out.println(Demo2.p);

        System.out.println(Demo2.q);
        System.out.println("re-initialize static variable p and q");
        Demo2.p = 2;
        Demo2.q = 34;

        System.out.println(Demo2.p);

        System.out.println(Demo2.q);
    }

}
