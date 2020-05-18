package tutorial.fullCodes.JavaEnum.example2;

public class WeatherRunner1 {

    public static void main(String[] args) {
        //if we know that default weather from enum says its Windy today
        Weather.TypesOfWeather defaultWeather = Weather.TypesOfWeather.Sunny;

        //then, when we run this class, it will show us message that correspond with default
        if(defaultWeather == Weather.TypesOfWeather.Overcast){
            System.out.println("The weather is overcast from the BBC weather forecast");
        }else if(defaultWeather == Weather.TypesOfWeather.Raining){
            System.out.println("The weather is overcast from the BBC weather raining");
        }else if(defaultWeather == Weather.TypesOfWeather.Sunny){
            System.out.println("The weather is overcast from the BBC weather sunny");
        }else if(defaultWeather == Weather.TypesOfWeather.Windy){
            System.out.println("The weather is overcast from the BBC weather windy");
        }else {
            System.out.println("don't know the actual weather today");
        }


    }
}
