package cls.observer.weather;

public class WeatherStation extends Subject {
    private float temperature;

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("\nWeatherStation: New temperature = " + temperature + "°C");
        notifyAllObservers();
    }
}