package tutorial.fullCodes.JavaEnum.exmaple3;

public class TutorialRunner {

    public static void main(String[] args) {

        Tutorial tutorial = new Tutorial("TypeScript"); // constructor takes the value

        System.out.println(tutorial.getmyPreferredLanguage()); // getter gets it from constructor


        tutorial.courseEnrol(ProgrammingLanguages.cSharp);
        System.out.println(tutorial.getmyPreferredLanguage());
    }
}
