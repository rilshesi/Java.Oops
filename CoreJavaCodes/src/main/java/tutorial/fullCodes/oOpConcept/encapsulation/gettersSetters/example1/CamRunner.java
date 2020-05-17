package tutorial.fullCodes.encapsulation.gettersSetters.example1;

public class CamRunner {

    public static void main(String[] args) {

        GettersAndSetters panasonic = new GettersAndSetters("Panasonic",true, 20l);
        panasonic.canCameraSnap();

        String camName = panasonic.getCameraName();   // initial assigned name
        System.out.println(camName);
 /*Encapsulation Golden Rule: states that because fields are now encapsulated and access is restricted, to access
 the field, we need to use Getters and Setters methods.

 now we can call the getter and setter
  */
        String name = panasonic.getCameraName();
        String name1 = panasonic.setCameraName("Kodak"); // final assigned name
        System.out.println(name1);


    }

}
