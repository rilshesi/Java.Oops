package tutorial.fullCodes.interfaceConcept;

public class Goat implements Animal { // can implement more than one interface as well as extends other classes
    @Override
    public void walk() {
        int legs = 4;
        String message = "A goat can walk with "+legs+ " legs";
        System.out.println(message);
    }

    @Override
    public void walk(String animalName) {

    }

    @Override
    public String getAnimalName() {
        return null;
    }

    @Override
    public int getAnimalAge() {
        return 0;
    }

    @Override
    public void setAnimalAge(int animalAge) {
    }
    /*Goat is a type of animal and has to implement all methods in Animal. Goat can also extend other
     normal class. Goat can also add it own normal methods
     */
}
