package tutorial.fullCodes.encapsulation.gettersSetters.example1;

public class GettersAndSetters {

    private String cameraName;
    private boolean canSnap;
    private long zoomLenght;

    public GettersAndSetters(String cameraName, boolean canSnap, long zoomLenght) {
        this.cameraName = cameraName;
        this.canSnap = canSnap;
        this.zoomLenght = zoomLenght;
    }


    // Getter Method for cameraName. we need to call it in the runner
    //getter will get the field and setter will assign new name to it
    public String getCameraName(){
        return cameraName;
    }

    // Setter Method for cameraName
    public String setCameraName(String cameraName) {
        this.cameraName = cameraName;
        return cameraName;
    }



    public void canCameraSnap(){

        System.out.println(canSnap);
    }

}
