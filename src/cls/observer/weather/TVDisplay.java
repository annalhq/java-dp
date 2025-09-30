package cls.observer.weather;


public class TVDisplay extends Observer {
    public TVDisplay(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("TVDisplay: Temperature updated to " + subject.getTemperature() + "°C");
    }
}