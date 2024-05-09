// File: MainClass.java

package myPackage;

public class MainClass {
    public static void main(String[] args) {
        int[] userArray = ArrayInput.getUserArray();
        ArrayProcessor.processArray(userArray);
    }
}
