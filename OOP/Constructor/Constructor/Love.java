class Love {
    String First_Love;
    String Second_Love;

    Love(String First_Love, String Second_Love) {
        this.First_Love = First_Love;
        this.Second_Love = Second_Love;
    }

    void Holy_Marriage(String First_Love) {
        System.out.println("Sachin Chakrawarti weds " + First_Love + " Kapoor Chakrawarti");
    }

    void Divine_Marriage(String Second_Love) {
        System.out.println("Sachin Chakrawarti weds " + Second_Love + " Shrivastava Chakrawarti");
    }
}

class First_Constructor {
    public static void main(String[] args) {
        Love Pyar = new Love("Shraddhu", "Priye");
        Pyar.Holy_Marriage("Shraddhu");
        Pyar.Divine_Marriage("Priye");
    }
}
