class Demo3 {
    int y = 100;
    int x = 2000;

    void test() {
        System.out.println("Shraddhu i love you ");
    }
}

class MainClasss3 {
    public static void main(String[] args) {
        System.out.println(new Demo3().x);
        System.out.println(new Demo3().y);
        new Demo3().test();
    }
}
