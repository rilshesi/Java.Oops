package tutorial.fullCodes.oOpConcept.polymorphism.overloading;

public class Shopping {

    public void buyShoe(){
        System.out.println("paid");
    }


    public void buyShoe(String shoeName){
        System.out.println("paid for " + shoeName);
    }


    public void buyShoe(int numberOfShoes, String shoeName,  int hillSize ){  //you can’t have twice but can make it 4 argument
        System.out.println("paid for " +  numberOfShoes + shoeName + " with hillSize " +hillSize);
    }


    public void buyShoe(int numberOfShoes){

        System.out.println("paid for " + numberOfShoes+ " shoes");
    }

}
