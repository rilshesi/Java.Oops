package tutorial.fullCodes.inheritance;

public class Father extends GrandFather {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Father f = new Father();
        f.browser();
        f.loginDetails();
    }


    public void fatherProperty()
    {
        System.out.println("father property");
    }


}
