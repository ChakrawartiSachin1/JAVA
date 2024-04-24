public class XMen {
    // Private attributes
    private String codeName;
    private String realName;
    private String power;

    // Constructor
    public XMen(String codeName, String realName, String power) {
        this.codeName = codeName;
        this.realName = realName;
        this.power = power;
    }

    // Getter method for code name
    public String getCodeName() {
        return codeName;
    }

    // Setter method for code name
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    // Getter method for real name
    public String getRealName() {
        return realName;
    }

    // Setter method for real name
    public void setRealName(String realName) {
        this.realName = realName;
    }

    // Getter method for power
    public String getPower() {
        return power;
    }

    // Setter method for power
    public void setPower(String power) {
        this.power = power;
    }

    // Method to display X-Men information
    public void displayInfo() {
        System.out.println("Code Name: " + codeName);
        System.out.println("Real Name: " + realName);
        System.out.println("Power: " + power);
    }

    public static void main(String[] args) {
        // Creating a new X-Men object
        XMen wolverine = new XMen("Wolverine", "Logan", "Regeneration");

        // Displaying X-Men information
        wolverine.displayInfo();

        // Modifying X-Men information using setters
        wolverine.setCodeName("Logan"); // Updating code name
        wolverine.setPower("Adamantium Claws"); // Updating power

        // Displaying modified X-Men information
        wolverine.displayInfo();
    }
}
