package huuphu.aprotrain.appweather;

public class Wheather {
    private String DateTime;
    private int WeatherIcon;
    private String IconPhrase;
    private Temperature Temperature;

    public Wheather(String dateTime, int weatherIcon, String iconPhrase, huuphu.aprotrain.appweather.Temperature temperature) {
        DateTime = dateTime;
        WeatherIcon = weatherIcon;
        IconPhrase = iconPhrase;
        Temperature = temperature;
    }

    public Wheather() {
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public int getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        IconPhrase = iconPhrase;
    }

    public Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(Temperature temperature) {
        Temperature = temperature;
    }
}