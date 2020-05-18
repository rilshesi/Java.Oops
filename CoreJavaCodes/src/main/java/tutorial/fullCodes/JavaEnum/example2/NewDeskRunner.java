package tutorial.fullCodes.JavaEnum.example2;

public class NewDeskRunner {

    public static void main(String[] args) {
        // what if we don't know the weather
        NewsDest newsDest = new NewsDest();
        String weatherValue = newsDest.checkWeather(Weather.TypesOfWeather.Windy);
        System.out.println(weatherValue);
    }
}
