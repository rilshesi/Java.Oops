package tutorial.fullCodes.JavaEnum.example2;

public class NewsDest {
    // if these class is to use the properties of weather

    public String checkWeather(Weather.TypesOfWeather actualWeather){
        if(actualWeather == Weather.TypesOfWeather.Overcast){
            return "Overcast";
        }else if(actualWeather == Weather.TypesOfWeather.Raining){
            return "Raining";
        }else if(actualWeather == Weather.TypesOfWeather.Sunny){
            return "Sunny";
        }else if(actualWeather == Weather.TypesOfWeather.Windy){
            return "Windy";
        }else {
            return "Not Known";
        }

    }
}
