public class XMenCharacter {

    String name;
    String mutantPower;
    String alias;
    boolean isGood;

  
    //Constructor
    public XMenCharacter(String name, String mutantPower, boolean isGood, String alias){
        this.name = name;
        this.mutantPower = mutantPower;
        this.isGood = isGood;
        this.alias = alias;
    }


    //Method
    public void useMutantPower(){
        System.out.println(name + " is using their mutant power:  " + mutantPower);
        System.out.println(name + "'s alias name is: " + alias);
    }

    //Method to check if the X-men character is a hero or a villain
    public void displayAlignment(){
        if (isGood){
            System.out.println(name + " is a hero ");
        }else{
            System.out.println(name + " is a villain. ");
        }
    }
 
    public static void main(String[] args) {
        // Creating objects (instances) of the XMenCharacter class
        XMenCharacter wolverine = new XMenCharacter("Wolverine", "Healing Factor and clwas", true, "logan");
        XMenCharacter magneto = new XMenCharacter("Magneto", "Magnetic Manipulation", false, "eric");


            // Using methods on the objects
            wolverine.useMutantPower();
            wolverine.displayAlignment();
    
            magneto.useMutantPower();
            magneto.displayAlignment();
    }


}
