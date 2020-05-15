package polymorphismTest;


import org.testng.annotations.Test;
import tutorial.fullCodes.polymorphism.overloading.Shopping;

public class ShoppingRunnerTest {

    @Test
    public void shoeTest(){

        Shopping shoes = new Shopping();
        shoes.buyShoe();
        shoes.buyShoe(20," nike",10);  // if one method is called, it can serve the others
    }

}
