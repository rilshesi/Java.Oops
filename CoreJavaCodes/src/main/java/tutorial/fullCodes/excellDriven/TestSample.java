package tutorial.fullCodes.excellDriven;

import java.io.IOException;
import java.util.ArrayList;

public class TestSample {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        Data d = new Data();

        // Note the data can be for example username and password to be used as key by using SendKeys
        ArrayList data = d.getData("Purchase");
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));



    }
}
