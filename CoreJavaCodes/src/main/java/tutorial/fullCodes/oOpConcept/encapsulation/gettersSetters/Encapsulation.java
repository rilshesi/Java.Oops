package tutorial.fullCodes.oOpConcept.encapsulation.gettersSetters;

public class Encapsulation {

    //Public
    //If you make a method or variable public, it means you can access it in all packages. There is no restriction

    public void getThisKey()
    {

    }

   /* Private
    If you mark you method or variable as a private, you cannot access the variable or method outside the class.
    It is restricted to its class only, no other class can access it even if they are in the same package.
    */

   /* Protected
    If a method or variable is marked as protected, a child class from another package which extends the parent class
    holding the protected method or variable can access them using its child object as well as classes in its own package.
    */



   /* Default
    If we did not provide any access modifier to a method just as below, java automatically thinks it has a
    default access modifier, which can be access anywhere within the same package not outside of the package even
    if we try to inherit.

    i.e. method
    void getThisKey()
    {

    }
    This applies to variable as well
    */

}
