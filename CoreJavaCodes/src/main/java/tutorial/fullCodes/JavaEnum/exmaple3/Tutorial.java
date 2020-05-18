package tutorial.fullCodes.JavaEnum.exmaple3;

public class Tutorial {

    private String myPreferredLanguage;

    public Tutorial(String myPreferredLanguage) {
        this.myPreferredLanguage = myPreferredLanguage;
    }


    public void courseEnrol(ProgrammingLanguages language) {
        switch (language) {
            case cSharp:
                System.out.println("Welcome to Microsoft Technologies");
                System.out.println("We shall be learning Four Modules in automation");
                this.myPreferredLanguage = "C#";
                break;
            case Python:
                System.out.println("Welcome to OpenSource Technologies");
                System.out.println("We shall be learning Four Modules in automation");
                this.myPreferredLanguage = "Python";
                break;
            case Ruby:
                System.out.println("Welcome to OpenSource Technologies from Japan");
                System.out.println("We shall be learning Four Modules in automation");
                this.myPreferredLanguage = "Ruby";
                break;

            case Java:
                System.out.println("Welcome to Oracle Technologies");
                System.out.println("We shall be learning Four Modules in automation");
                this.myPreferredLanguage = "Java";
                break;

        }

    }
        //getter
    public String getmyPreferredLanguage(){
            return myPreferredLanguage;

    }
}
