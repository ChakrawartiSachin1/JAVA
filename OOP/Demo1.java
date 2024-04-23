class Demo1 {
    static int x = 10;
    static int y = 20;
    static void test(){
        System.out.println("running static test()");
    }

}

class MainClass1{
   public static void main(String[] args) {
    System.out.println(Demo1.x);
    System.out.println(Demo1.y);
    Demo1.test();
   }
}
