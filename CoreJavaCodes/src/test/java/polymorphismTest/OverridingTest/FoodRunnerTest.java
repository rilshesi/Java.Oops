package polymorphismTest.OverridingTest;


import tutorial.fullCodes.polymorphism.overriding.ChildClass;
import tutorial.fullCodes.polymorphism.overriding.ParentClass;

public class FoodRunnerTest {

    public static void main(String[] args) {



//calling parent class
        ParentClass parentClass = new ParentClass("yam");
        parentClass.isFoodReady();


//calling child class, you will get the same output as though you are calling Parent, since child inherit parent
        ChildClass childClass = new ChildClass("Bread");
        childClass.isFoodReady();
        childClass.cookTheFood();
    }
}
