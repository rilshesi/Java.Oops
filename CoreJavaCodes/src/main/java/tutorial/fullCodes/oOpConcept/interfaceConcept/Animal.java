package tutorial.fullCodes.interfaceConcept;

public interface Animal {
    /* interface Animal is like a client & will aways force all the implementors like Goat to write a
    code for all the methods below.

    Animal is like a law maker and will for you to implement all its rule if you want be part of Animal
    Kingdom
    Example: is a country like you UK can create a rule inform of an interface to define what car
             manufacturer will follow in order to manufacture/supply cars into UK, but car manufacturers
             can add there own properties as well to represent there brand functionalities
     */
    void walk();
    //client supply an interface (methods without body). it is public by default

    void walk(String animalName); // you can have overload

    String getAnimalName();
    //client supply an interface (methods without body)

    int getAnimalAge();
    //client supply an interface (methods without body)  // you can have a getter

    void setAnimalAge(int animalAge);  // you can have a setter
}
