class Pyar{
    String priyal_ji = "Sharddhu ji";
    String shraddhu_ji = "Priyal ji";
}

class Priyal extends Pyar{
    Priyal(){
         System.out.println("I love you "+ priyal_ji + " in every universe");
    }
}

class Shraddhu extends Pyar{
    Shraddhu(){
        System.out.println("I love you "+ shraddhu_ji + " in every universe");
    }
}


public class Love{
      public static void main(String[] arg){
        Priyal priyal = new Priyal();
        Shraddhu shraddhu = new Shraddhu();
      }


}