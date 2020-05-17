package tutorial.fullCodes.oOpConcept.polymorphism.overriding;

public class ParentClass {


    protected String foodNam;


    public ParentClass(String foodNam){

        this.foodNam=foodNam;
    }



    public void isFoodReady(){
        System.out.println("You need to eat "+foodNam);
    }

    public void cookTheFood(){
        System.out.println("there is no ingredient at home");
    }
}
