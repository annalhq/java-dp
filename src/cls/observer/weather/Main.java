package cls.observer.weather;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Observers automatically register during construction
        Observer phoneDisplay = new PhoneDisplay(weatherStation);
        Observer tvDisplay = new TVDisplay(weatherStation);

        // Simulate weather changes
        weatherStation.setTemperature(22.5f);
        weatherStation.setTemperature(24.0f);

        // Unregister phone display
        weatherStation.detach(phoneDisplay);

        // Another weather change
        weatherStation.setTemperature(26.3f);
    }
}