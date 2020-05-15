package tutorial.fullCodes.polymorphism.overriding;

public class ChildClass extends ParentClass{


    public ChildClass(String foodNam) {
        super(foodNam);
    }

    //Note: if parent & child have same method, the parent methods override the one in child if child extends parent.
    public void isFoodReady(){
        System.out.println("I have eaten " + foodNam);
    }

    /* public void cookTheFood(){
         System.out.println("Im too tired");
     }
     */



}
