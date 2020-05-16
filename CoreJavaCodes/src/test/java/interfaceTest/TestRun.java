package interfaceTest;

import tutorial.fullCodes.interfaceConcept.Animal;
import tutorial.fullCodes.interfaceConcept.Goat;

public class TestRun {

    public static void main(String[] args) {
        //Goat goat = new Goat();
        //goat.walk();
 /* We can also use the parent interface animal to instantiate object. this is where the concept of
 WebDriver driver = new ChromeDrive()......comes from. this can be done when it comes to Inheritance
 as well as Abstract and Interface.

 ChromeDrive is class that implements the methods in WebDriver
  */
        //so we can also have
        Animal animal = new Goat();
        animal.walk();

        //  or

        Animal goat = new Goat();
        goat.walk();

    }
}
