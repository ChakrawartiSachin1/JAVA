// Parent class
class Mutant {
    String name;
    
    Mutant(String name) {
        this.name = name;
    }
    
    void usePower() {
        System.out.println(name + " uses their mutant power!");
    }
}

// Child class inheriting from Mutant
class XMen extends Mutant {
    String team;
    
    XMen(String name, String team) {
        super(name);
        this.team = team;
    }
    
    void useSpecialPower() {
        System.out.println(name + " from the " + team + " uses their special X-Men power!");
    }
}

public class Main {
    public static void main(String[] args) {
        XMen cyclops = new XMen("Cyclops", "X-Men");
        cyclops.usePower(); // Inherited method
        cyclops.useSpecialPower(); // Child class method
    }
}
